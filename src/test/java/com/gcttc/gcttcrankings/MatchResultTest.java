package com.gcttc.gcttcrankings;

import com.gcttc.gcttcrankings.domain.MatchResult;
import com.gcttc.gcttcrankings.domain.Player;
import com.gcttc.gcttcrankings.domain.exceptions.NotEnoughPlayedSetsException;
import com.gcttc.gcttcrankings.domain.exceptions.SameWinningSetsException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MatchResultTest {

    @Test
    void expectedMatchResultTest () {

        Player playerA = new Player("IrrelevantID", "Irrelevant Name", 3, 1200);
        Player playerB = new Player("IrrelevantID2", "Irrelevant Name 2", 4, 1340);

        MatchResult matchResult = new MatchResult(playerA, playerB);
        Player winner = matchResult.getWinnerUpdatedPlayer();
        Player loser = matchResult.getLoserUpdatedPlayer();

        assertEquals(winner.getName(), playerB.getName());
        assertEquals(winner.getBeforeMatchRanking(), playerB.getBeforeMatchRanking());
        assertEquals(winner.getAfterMatchRanking(), playerB.getBeforeMatchRanking() + 2);
        assertEquals(loser.getName(), playerA.getName());
        assertEquals(loser.getBeforeMatchRanking(), playerA.getBeforeMatchRanking());
        assertEquals(loser.getAfterMatchRanking(), playerA.getBeforeMatchRanking() - 2);

    }

    @Test
    void upsetMatchResultTest () {

        Player playerA = new Player("IrrelevantID", "Irrelevant Name", 4, 1200);
        Player playerB = new Player("IrrelevantID2", "Irrelevant Name 2", 3, 1340);

        MatchResult matchResult = new MatchResult(playerA, playerB);
        Player winner = matchResult.getWinnerUpdatedPlayer();
        Player loser = matchResult.getLoserUpdatedPlayer();

        assertEquals(winner.getName(), playerA.getName());
        assertEquals(winner.getBeforeMatchRanking(), playerA.getBeforeMatchRanking());
        assertEquals(winner.getAfterMatchRanking(), playerA.getBeforeMatchRanking() + 30);
        assertEquals(loser.getName(), playerB.getName());
        assertEquals(loser.getBeforeMatchRanking(), playerB.getBeforeMatchRanking());
        assertEquals(loser.getAfterMatchRanking(), playerB.getBeforeMatchRanking() - 30);

    }

    @Test
    void sameWinningSetsMatchResultTest () {

        Player playerA = new Player("IrrelevantID", "Irrelevant Name", 3, 1200);
        Player playerB = new Player("IrrelevantID2", "Irrelevant Name 2", 3, 1340);

        assertThrows(SameWinningSetsException.class, () -> {
            new MatchResult(playerA, playerB);
        });

    }

    @Test
    void notEnoughPlayedSetsMatchResultTest () {

        Player playerA = new Player("IrrelevantID", "Irrelevant Name", 1, 1200);
        Player playerB = new Player("IrrelevantID2", "Irrelevant Name 2", 0, 1340);

        assertThrows(NotEnoughPlayedSetsException.class, () -> {
            new MatchResult(playerA, playerB);
        });

    }

}
