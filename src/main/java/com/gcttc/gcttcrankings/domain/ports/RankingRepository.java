package com.gcttc.gcttcrankings.domain.ports;

import com.gcttc.gcttcrankings.domain.Player;
import com.gcttc.gcttcrankings.domain.RankingTable;

import java.time.LocalDate;

public interface RankingRepository {

    Player findPlayerByNameLike(String name);
    void saveRankingTable(RankingTable rankingTable);
    RankingTable getRankingTableByDate(LocalDate date);

}
