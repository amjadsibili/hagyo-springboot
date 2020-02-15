package com.hagyo.main.main.repository;

import com.hagyo.main.main.dto.UserDto;
import com.hagyo.main.main.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Integer> {
    public User findByUsername(String username);
    public User findByUsernameAndPassword(String username, String password);
}
