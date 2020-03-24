package com.hagyo.main.main.repository;

import com.hagyo.main.main.model.Attendance;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AttendanceRepository extends MongoRepository<Attendance, Integer> {
    List<Attendance> findByClassroomAndSchoolOrderByAttendanceDateDesc(String classroomId, String schoolId);
}
