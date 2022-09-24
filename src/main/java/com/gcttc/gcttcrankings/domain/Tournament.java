package com.gcttc.gcttcrankings.domain;

import java.util.List;

public class Tournament {

    private TournamentInformation information;
    private List<MatchEntry> matches;

    public Tournament (TournamentInformation information, List<MatchEntry> matches) {
        this.information = information;
        this.matches = matches;
    }

    public TournamentInformation getInformation () {
        return information;
    }

    public void setInformation (TournamentInformation information) {
        this.information = information;
    }

    public List<MatchEntry> getMatches () {
        return matches;
    }

    public void setMatches (List<MatchEntry> matches) {
        this.matches = matches;
    }
}
