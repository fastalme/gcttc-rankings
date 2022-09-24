package com.gcttc.gcttcrankings.domain.ports;

import com.gcttc.gcttcrankings.domain.Tournament;

import java.util.List;

public interface TournamentEvidenceRepository {

    List<Tournament> findAllTournaments ();

}
