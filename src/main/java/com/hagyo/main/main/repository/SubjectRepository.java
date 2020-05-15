package com.hagyo.main.main.repository;

import com.hagyo.main.main.model.Subject;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SubjectRepository extends MongoRepository<Subject, Integer> {
    List<Subject> findByClassroomAndSchool(int classroom, int school);
    Subject findById(int subject);
    List<Subject> findByHandledBy(int handledBy);
}
