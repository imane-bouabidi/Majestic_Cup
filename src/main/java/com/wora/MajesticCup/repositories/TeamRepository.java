package com.wora.MajesticCup.repositories;

import com.wora.MajesticCup.entities.Team;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeamRepository extends MongoRepository<Team, String> {
    Team findByName(String name);
}
