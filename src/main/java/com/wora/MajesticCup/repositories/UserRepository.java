package com.wora.MajesticCup.repositories;

import com.wora.MajesticCup.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Long> {
    User findByUsername(String username);
}

