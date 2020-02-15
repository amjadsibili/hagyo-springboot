package com.hagyo.main.main.repository;

import com.hagyo.main.main.model.Mark;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MarkRepository extends MongoRepository<Mark, Integer> {
}
