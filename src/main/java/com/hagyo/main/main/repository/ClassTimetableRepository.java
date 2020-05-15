package com.hagyo.main.main.repository;

import com.hagyo.main.main.model.ClassTimetable;
import org.omg.CORBA.IMP_LIMIT;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ClassTimetableRepository extends MongoRepository<ClassTimetable, Integer> {
    ClassTimetable findById(int id);
    List<ClassTimetable> findByMondayPeriods(Integer mp);
    List<ClassTimetable> findByTuesdayPeriods(Integer ts);
    List<ClassTimetable> findByWednesdayPeriods(Integer wp);
    List<ClassTimetable> findByThursdayPeriods(Integer thrp);
    List<ClassTimetable> findByFridayPeriods(Integer fp);
    List<ClassTimetable> findBySaturdayPeriods(Integer sp);
    List<ClassTimetable> findBySundayPeriods(Integer sunp);

}
