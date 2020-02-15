package com.hagyo.main.main.repository;

import com.hagyo.main.main.model.Classroom;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClassroomRepository extends MongoRepository<Classroom, Integer> {
}
