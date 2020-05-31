package com.hagyo.main.main.repository;

import com.hagyo.main.main.model.ClassTimetable;
import org.omg.CORBA.IMP_LIMIT;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ClassTimetableRepository extends MongoRepository<ClassTimetable, Integer> {
    ClassTimetable findById(int id);

    List<ClassTimetable> findByMondayPeriods(String mp);

    List<ClassTimetable> findByTuesdayPeriods(String ts);

    List<ClassTimetable> findByWednesdayPeriods(String wp);

    List<ClassTimetable> findByThursdayPeriods(String thrp);

    List<ClassTimetable> findByFridayPeriods(String fp);

    List<ClassTimetable> findBySaturdayPeriods(String sp);

    List<ClassTimetable> findBySundayPeriods(String sunp);

}
