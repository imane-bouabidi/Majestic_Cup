package com.wora.MajesticCup.repositories;

import com.wora.MajesticCup.entities.Match;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MatchRepository extends MongoRepository<Match, Long> {
}

