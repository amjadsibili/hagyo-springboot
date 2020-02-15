package com.hagyo.main.main.repository;

import com.hagyo.main.main.model.Subject;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SubjectRepository extends MongoRepository<Subject, Integer> {
}
