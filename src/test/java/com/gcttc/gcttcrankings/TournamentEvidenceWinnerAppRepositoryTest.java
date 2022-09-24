package com.gcttc.gcttcrankings;

import com.gcttc.gcttcrankings.domain.Tournament;
import com.gcttc.gcttcrankings.domain.ports.TournamentEvidenceRepository;
import com.gcttc.gcttcrankings.infra.TournamentEvidenceWinnerAppRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

class TournamentEvidenceWinnerAppRepositoryTest {

    TournamentEvidenceRepository repository = new TournamentEvidenceWinnerAppRepository("winner-app-exports");

    @Test
    void shouldLoadTournamentsWhenThereIsTournamentFiles() throws IOException {

        List<Tournament> tournaments = repository.findAllTournaments();
        Assertions.assertEquals(1, tournaments.size());
        Assertions.assertEquals(22, tournaments.get(0).getMatches().size());
        Assertions.assertEquals(LocalDate.of(2022, 5, 8), tournaments.get(0).getInformation().getDate());
        Assertions.assertEquals("GCTTC", tournaments.get(0).getInformation().getOrganizer());
        Assertions.assertEquals("Torneo U1800", tournaments.get(0).getInformation().getName());

    }

}
