package com.wora.MajesticCup.repositories;

import com.wora.MajesticCup.entities.Round;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RoundRepository extends MongoRepository<Round, String> {
    List<Round> findByCompetitionId(Long competitionId);
}

