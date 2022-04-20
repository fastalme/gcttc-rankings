package com.gcttc.gcttcrankings.domain;

import java.time.LocalDate;

public class Tournament {

    private LocalDate date;
    private String organizer;
    private String responsible;

    public Tournament (LocalDate date, String organizer, String responsible) {
        this.date = date;
        this.organizer = organizer;
        this.responsible = responsible;
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

    public String getResponsible () {
        return responsible;
    }

    public void setResponsible (String responsible) {
        this.responsible = responsible;
    }

}
