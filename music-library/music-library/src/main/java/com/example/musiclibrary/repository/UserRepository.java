package com.example.musiclibrary.repository;

import com.example.musiclibrary.model.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserEntity, String> {
    UserEntity findByEmail(String email);
}
