package com.hagyo.main.main.repository;

import com.hagyo.main.main.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface StudentRepository extends MongoRepository<Student, Integer> {
    Student findById(int id);
    List<Student> findByBelongingClass(int classroomId);
}
