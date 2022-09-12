package com.spring.mongo.demo.repository;

import com.spring.mongo.demo.model.AppUser;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AppUserRepository extends MongoRepository<AppUser, String> {
    boolean existsByUsername(String username);

    AppUser findByUsername(String username);

}
