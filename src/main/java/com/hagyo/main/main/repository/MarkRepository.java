package com.hagyo.main.main.repository;

import com.hagyo.main.main.model.Mark;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MarkRepository extends MongoRepository<Mark, Integer> {
    List<Mark> findByStudent(String id);
    Mark findById(String id);
}
