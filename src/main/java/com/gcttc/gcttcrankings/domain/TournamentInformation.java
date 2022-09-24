package com.gcttc.gcttcrankings.domain;

import java.time.LocalDate;

public class TournamentInformation {

    private LocalDate date;
    private String organizer;
    private String name;

    public TournamentInformation (LocalDate date, String organizer, String name) {
        this.date = date;
        this.organizer = organizer;
        this.name = name;
    }

    public LocalDate getDate () {
        return date;
    }

    public void setDate (LocalDate date) {
        this.date = date;
    }

    public String getOrganizer () {
        return organizer;
    }

    public void setOrganizer (String organizer) {
        this.organizer = organizer;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

}
