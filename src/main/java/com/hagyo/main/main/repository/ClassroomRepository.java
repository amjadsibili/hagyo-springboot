package com.hagyo.main.main.repository;

import com.hagyo.main.main.model.Classroom;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ClassroomRepository extends MongoRepository<Classroom, Integer> {
    Classroom findById(int classroom);

}
