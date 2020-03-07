package com.hagyo.main.main.repository;

import com.hagyo.main.main.model.ClassTimetable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ClassTimetableRepository extends MongoRepository<ClassTimetable, Integer> {
    ClassTimetable findById(int id);
    List<ClassTimetable> findBymondayPeriods(int mp);
}
