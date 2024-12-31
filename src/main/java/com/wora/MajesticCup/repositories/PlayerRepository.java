package com.wora.MajesticCup.repositories;

import com.wora.MajesticCup.entities.Player;
import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends MongoRepository<Player, String> {
}

