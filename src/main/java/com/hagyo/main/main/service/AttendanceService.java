package com.hagyo.main.main.service;

import com.hagyo.main.main.model.Attendance;
import com.hagyo.main.main.repository.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AttendanceService {

    @Autowired
    AttendanceRepository attendanceRepository;

    @Autowired
    MongoOperations mongoOperations;

    public List<Attendance> getRecentAttendances(String classId, String schoolId, int limit) {
        List<Attendance> attendances = new ArrayList<>();
//        Query query = new Query();
//        query.addCriteria(Criteria.where("classroom").is(classId).and("school").is(schoolId));
//        query.limit(10);
//        query.with(new Sort(Sort.Direction.DESC, "attendanceDate"));
        attendances =  attendanceRepository.findByClassroomAndSchoolOrderByAttendanceDateDesc(classId, schoolId);
        return attendances;
    }

}
