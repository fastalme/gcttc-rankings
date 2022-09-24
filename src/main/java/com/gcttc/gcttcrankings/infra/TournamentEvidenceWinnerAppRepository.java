package com.gcttc.gcttcrankings.infra;

import com.gcttc.gcttcrankings.domain.MatchEntry;
import com.gcttc.gcttcrankings.domain.Tournament;
import com.gcttc.gcttcrankings.domain.TournamentInformation;
import com.gcttc.gcttcrankings.domain.exceptions.TournamentEvidenceDirException;
import com.gcttc.gcttcrankings.domain.exceptions.TournamentLoadException;
import com.gcttc.gcttcrankings.domain.ports.TournamentEvidenceRepository;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TournamentEvidenceWinnerAppRepository implements TournamentEvidenceRepository {

    private final String winnerAppEvidenceDir;

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");

    public TournamentEvidenceWinnerAppRepository (String winnerAppEvidenceDir) {
        this.winnerAppEvidenceDir = winnerAppEvidenceDir;
    }

    @Override
    public List<Tournament> findAllTournaments () {
        try (Stream<Path> stream = Files.list(Path.of(ClassLoader.getSystemResource(winnerAppEvidenceDir).toURI()))) {
            return stream
                    .filter(file -> !Files.isDirectory(file))
                    .map(path -> loadTournamentFromFile(path.toFile()))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new TournamentLoadException();
        } catch (URISyntaxException e) {
            throw new TournamentEvidenceDirException();
        }
    }

    public Tournament loadTournamentFromFile (File file) {

        TournamentInformation tournamentInformation = getTournamentInfoFromFilename(file.getName());

        String matchesInfoAsString = getMatchesAsStringFromFile(file);

        return new Tournament(tournamentInformation, getMatchesFromString(matchesInfoAsString));
    }

    private TournamentInformation getTournamentInfoFromFilename (String name) {
        String[] tournamentInfo = name.split("-");
        return new TournamentInformation(LocalDate.parse(tournamentInfo[0], formatter),
                tournamentInfo[2],
                tournamentInfo[3].split("\\.")[0]);
    }

    private static String getMatchesAsStringFromFile (File file) {
        PDDocument document = null;
        String matchesInfoAsString;
        try {
            document = PDDocument.load(file);
            PDFTextStripper pdfStripper = new PDFTextStripper();
            matchesInfoAsString = pdfStripper.getText(document);
            document.close();
        } catch (IOException e) {
            throw new TournamentLoadException();
        }
        return matchesInfoAsString;
    }

    private List<MatchEntry> getMatchesFromString (String text) {

        List<MatchEntry> result = new ArrayList<>();

        Pattern tournamentMatchesRegexPattern = Pattern.compile("(.*) (\\d*) : (\\d*) (.*)");
        Matcher tournamentMatchesRegexMatcher = tournamentMatchesRegexPattern.matcher(text);

        while (tournamentMatchesRegexMatcher.find()) {
            result.add(
                    new MatchEntry(
                            tournamentMatchesRegexMatcher.group(1),
                            Short.valueOf(tournamentMatchesRegexMatcher.group(2)),
                            tournamentMatchesRegexMatcher.group(4),
                            Short.valueOf(tournamentMatchesRegexMatcher.group(3))));
        }

        return result;
    }
}
