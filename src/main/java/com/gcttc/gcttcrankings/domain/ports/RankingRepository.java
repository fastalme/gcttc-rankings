package com.gcttc.gcttcrankings.domain.ports;

import com.gcttc.gcttcrankings.domain.RankingTable;

import java.time.LocalDate;
import java.util.List;

public interface RankingRepository {

    void saveRankingTable(RankingTable rankingTable);
    RankingTable getRankingTableByDate(LocalDate date);

}
