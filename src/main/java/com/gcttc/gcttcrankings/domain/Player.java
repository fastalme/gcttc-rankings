package com.gcttc.gcttcrankings.domain;

public class Player {

    private String id;
    private String name;
    private int winningSets;
    private int beforeMatchRanking;
    private int afterMatchRanking;

    public Player (String id, String name, int winningSets, int beforeMatchRanking) {
        this.id = id;
        this.name = name;
        this.winningSets = winningSets;
        this.beforeMatchRanking = beforeMatchRanking;
        this.afterMatchRanking = beforeMatchRanking;
    }

    public String getId () {
        return id;
    }

    public String getName () {
        return name;
    }

    public int getWinningSets () {
        return winningSets;
    }

    public int getBeforeMatchRanking () {
        return beforeMatchRanking;
    }

    public int getAfterMatchRanking () {
        return this.afterMatchRanking;
    }

    public void setAfterMatchRanking (int afterMatchRanking) {
        this.afterMatchRanking = afterMatchRanking;
    }

}
