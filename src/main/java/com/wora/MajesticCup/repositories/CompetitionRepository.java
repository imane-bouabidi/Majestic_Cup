package com.wora.MajesticCup.repositories;

import com.wora.MajesticCup.entities.Competition;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompetitionRepository extends MongoRepository<Competition, String> {
    Competition findByName(String name);
}

