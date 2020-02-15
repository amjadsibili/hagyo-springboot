package com.hagyo.main.main.repository;

import com.hagyo.main.main.model.Exam;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExamRepository extends MongoRepository<Exam, Integer> {
}
