package com.wora.MajesticCup.repositories;

import com.wora.MajesticCup.entities.Result;
import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface ResultRepository extends MongoRepository<Result, String> {
//    List<Result> findByMatchId(Long matchId);
//    List<Result> findByPlayerId(Long playerId);
}
