package com.hagyo.main.main.repository;

import com.hagyo.main.main.model.Attendance;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AttendanceRepository extends MongoRepository<Attendance, Integer> {
}
