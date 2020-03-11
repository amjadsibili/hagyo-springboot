package com.hagyo.main.main.repository;

import com.hagyo.main.main.model.Classroom;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ClassroomRepository extends MongoRepository<Classroom, String> {
    Optional<Classroom> findById(String classroom);

}
