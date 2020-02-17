package com.hagyo.main.main.repository;

import com.hagyo.main.main.model.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TeacherRepository extends MongoRepository<Teacher, Integer> {
    List<Teacher> findByTid(String tid);
}
