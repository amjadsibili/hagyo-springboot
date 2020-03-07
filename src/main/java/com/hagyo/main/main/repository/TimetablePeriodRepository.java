package com.hagyo.main.main.repository;

import com.hagyo.main.main.model.TimetablePeriod;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TimetablePeriodRepository extends MongoRepository<TimetablePeriod, Integer> {
    TimetablePeriod findById(String id);
}
