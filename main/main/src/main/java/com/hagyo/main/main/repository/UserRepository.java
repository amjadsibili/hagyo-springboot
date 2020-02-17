package com.hagyo.main.main.repository;

import com.hagyo.main.main.dto.UserDto;
import com.hagyo.main.main.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Integer> {
     User findByUsernameAndPassword(String username, String password);
     boolean existsByToken(String token);

}
