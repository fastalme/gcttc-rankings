package com.gcttc.gcttcrankings.domain;

import com.gcttc.gcttcrankings.domain.exceptions.NotEnoughPlayedSetsException;
import com.gcttc.gcttcrankings.domain.exceptions.SameWinningSetsException;

public class MatchResult {

    private final Player winner;
    private final Player loser;

    public MatchResult (Player playerA, Player playerB) {

        if (playerA.getWinningSets() == playerB.getWinningSets()) {
            throw new SameWinningSetsException();
        }

        int playedSets = playerA.getWinningSets() + playerB.getWinningSets();
        if (playedSets != 3 && playedSets != 5 && playedSets != 7) {
            throw new NotEnoughPlayedSetsException();
        }

        if (playerA.getWinningSets() > playerB.getWinningSets()) {
            this.winner = playerA;
            this.loser = playerB;
        } else {
            this.winner = playerB;
            this.loser = playerA;
        }

        int exchangedPoints = RatingChart.getExchangedPoints(this.winner.getBeforeMatchRanking(),
                this.loser.getBeforeMatchRanking(),
                this.winner.getBeforeMatchRanking() > this.loser.getBeforeMatchRanking());

        this.winner.setAfterMatchRanking(this.winner.getBeforeMatchRanking() + exchangedPoints);
        this.loser.setAfterMatchRanking(this.loser.getBeforeMatchRanking() - exchangedPoints);

    }

    public Player getWinnerUpdatedPlayer () {
        return winner;
    }

    public Player getLoserUpdatedPlayer () {
        return loser;
    }

}
