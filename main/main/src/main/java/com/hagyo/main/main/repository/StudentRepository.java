package com.hagyo.main.main.repository;

import com.hagyo.main.main.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, Integer> {
}
