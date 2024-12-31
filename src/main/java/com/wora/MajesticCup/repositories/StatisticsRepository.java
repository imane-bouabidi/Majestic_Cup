package com.wora.MajesticCup.repositories;

import com.wora.MajesticCup.entities.Statistic;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface StatisticsRepository extends MongoRepository<Statistic, String> {
    List<Statistic> findByPlayerId(Long playerId);
}

