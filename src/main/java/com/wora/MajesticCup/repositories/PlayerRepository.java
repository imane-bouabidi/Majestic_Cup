package com.wora.MajesticCup.repositories;

import com.wora.MajesticCup.entities.Player;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PlayerRepository extends MongoRepository<Player, Long> {
}

