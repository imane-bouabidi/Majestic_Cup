package com.wora.MajesticCup.repositories;

import com.wora.MajesticCup.entities.Competition;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompetitionRepository extends MongoRepository<Competition, String> {
    Competition findByName(String name);
}

