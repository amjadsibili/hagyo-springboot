package com.hagyo.main.main.repository;

import com.hagyo.main.main.model.Exam;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ExamRepository extends MongoRepository<Exam, Integer> {
    List<Exam> findByconductedBy(int teacherId);
    Exam findById(String id);
}
