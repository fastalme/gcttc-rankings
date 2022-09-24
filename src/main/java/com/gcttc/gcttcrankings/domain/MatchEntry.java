package com.gcttc.gcttcrankings.domain;

public class MatchEntry {

    private String playerAName;
    private Short playerAWinningSets;
    private String playerBName;
    private Short playerBWinningSets;

    public MatchEntry (String playerAName, Short playerAWinningSets, String playerBName, Short playerBWinningSets) {
        this.playerAName = playerAName;
        this.playerAWinningSets = playerAWinningSets;
        this.playerBName = playerBName;
        this.playerBWinningSets = playerBWinningSets;
    }

    public String getPlayerAName () {
        return playerAName;
    }

    public void setPlayerAName (String playerAName) {
        this.playerAName = playerAName;
    }

    public Short getPlayerAWinningSets () {
        return playerAWinningSets;
    }

    public void setPlayerAWinningSets (Short playerAWinningSets) {
        this.playerAWinningSets = playerAWinningSets;
    }

    public String getPlayerBName () {
        return playerBName;
    }

    public void setPlayerBName (String playerBName) {
        this.playerBName = playerBName;
    }

    public Short getPlayerBWinningSets () {
        return playerBWinningSets;
    }

    public void setPlayerBWinningSets (Short playerBWinningSets) {
        this.playerBWinningSets = playerBWinningSets;
    }

    @Override
    public String toString () {
        return "MatchEntry{" +
                "playerAName='" + playerAName + '\'' +
                ", playerAWinningSets=" + playerAWinningSets +
                ", playerBName='" + playerBName + '\'' +
                ", playerBWinningSets=" + playerBWinningSets +
                '}';
    }
}
