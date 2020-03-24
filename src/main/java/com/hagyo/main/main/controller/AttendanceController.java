package com.hagyo.main.main.controller;

import com.hagyo.main.main.exception.InvalidTokenException;
import com.hagyo.main.main.repository.UserRepository;
import com.hagyo.main.main.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/attendances")
public class AttendanceController {
    @Autowired
    UserRepository userRepository;
    @Autowired
    AttendanceService attendanceService;

    @GetMapping("/list")
    public ResponseEntity<?> getRecentAttendance(
            @RequestHeader("Authorization") String authToken,
            @RequestParam("classId") String classId,
            @RequestParam("schoolId") String schoolId,
            @RequestParam("limit") Integer limit
    ){
        if (userRepository.existsByToken(authToken)) {
            return new ResponseEntity<>(attendanceService.getRecentAttendances(classId, schoolId, limit),
                    HttpStatus.OK);
        } else{
            return new ResponseEntity<>(new InvalidTokenException("Invalid Token"), HttpStatus.UNAUTHORIZED);
        }
    }
}
