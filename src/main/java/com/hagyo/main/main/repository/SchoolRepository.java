package com.hagyo.main.main.repository;

import com.hagyo.main.main.model.School;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SchoolRepository extends MongoRepository<School, Integer> {
}
