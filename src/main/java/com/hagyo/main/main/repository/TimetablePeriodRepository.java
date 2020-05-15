package com.hagyo.main.main.repository;

import com.hagyo.main.main.model.TimetablePeriod;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TimetablePeriodRepository extends MongoRepository<TimetablePeriod, Integer> {
    TimetablePeriod findById(String id);

    List<TimetablePeriod> findByPeriod1(int period1SubjectId);

    List<TimetablePeriod> findByPeriod2(int period2SubjectId);

    List<TimetablePeriod> findByPeriod3(int period3SubjectId);

    List<TimetablePeriod> findByPeriod4(int period4SubjectId);

    List<TimetablePeriod> findByPeriod5(int period5SubjectId);

    List<TimetablePeriod> findByPeriod6(int period6SubjectId);

    List<TimetablePeriod> findByPeriod7(int period7SubjectId);

    List<TimetablePeriod> findByPeriod8(int period8SubjectId);

    boolean existsByPeriod1(int period1SubjectId);

    boolean existsByPeriod2(int period2SubjectId);

    boolean existsByPeriod3(int period3SubjectId);

    boolean existsByPeriod4(int period4SubjectId);

    boolean existsByPeriod5(int period5SubjectId);

    boolean existsByPeriod6(int period6SubjectId);

    boolean existsByPeriod7(int period7SubjectId);

    boolean existsByPeriod8(int period8SubjectId);
}
