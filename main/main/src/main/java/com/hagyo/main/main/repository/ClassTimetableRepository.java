package com.hagyo.main.main.repository;

import com.hagyo.main.main.model.ClassTimetable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClassTimetableRepository extends MongoRepository<ClassTimetable, Integer> {
}
