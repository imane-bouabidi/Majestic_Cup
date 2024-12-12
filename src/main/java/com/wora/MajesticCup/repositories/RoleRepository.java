package com.wora.MajesticCup.repositories;

import com.wora.MajesticCup.entities.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, Long> {
    Role findByRoleName(String roleName);
}

