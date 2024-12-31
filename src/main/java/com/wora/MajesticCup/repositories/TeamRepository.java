package com.wora.MajesticCup.repositories;

import com.wora.MajesticCup.entities.Team;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends MongoRepository<Team, String> {
    Team findByName(String name);
}
