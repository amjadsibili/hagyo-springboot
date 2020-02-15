package com.hagyo.main.main.repository;

import com.hagyo.main.main.model.Leave;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LeaveRepository extends MongoRepository<Leave, Integer> {
}
