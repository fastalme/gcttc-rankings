package com.gcttc.gcttcrankings.domain;

import java.time.LocalDate;
import java.util.List;

public class RankingTable {

    private LocalDate lastUpdate;
    private List<Player> players;

    public RankingTable (LocalDate lastUpdate, List<Player> players) {
        this.lastUpdate = lastUpdate;
        this.players = players;
    }

    public LocalDate getLastUpdate () {
        return lastUpdate;
    }

    public List<Player> getPlayers () {
        return players;
    }

}
