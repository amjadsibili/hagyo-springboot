package com.hagyo.main.main.repository;

import com.hagyo.main.main.model.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeacherRepository extends MongoRepository<Teacher, Integer> {
}
