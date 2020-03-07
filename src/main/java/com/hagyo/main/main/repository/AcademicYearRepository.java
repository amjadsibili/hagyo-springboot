package com.hagyo.main.main.repository;

import com.hagyo.main.main.model.AcademicYear;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AcademicYearRepository extends MongoRepository<AcademicYear, Integer> {

}