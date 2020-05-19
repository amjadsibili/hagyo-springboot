package com.hagyo.main.main.controller;

import com.hagyo.main.main.exception.InvalidTokenException;
import com.hagyo.main.main.model.ClassTimetable;
import com.hagyo.main.main.model.Classroom;
import com.hagyo.main.main.repository.ClassTimetableRepository;
import com.hagyo.main.main.repository.ClassroomRepository;
import com.hagyo.main.main.repository.UserRepository;
import com.hagyo.main.main.service.ClassTimetableService;
import com.hagyo.main.main.service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/classrooms")
public class ClassroomController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ClassroomService classroomService;
    @Autowired
    private ClassTimetableService classTimetableService;

    @GetMapping("/{classroomId}")
    public ResponseEntity<?> getClassroomDetailsById(@RequestHeader("Authorization") String authToken, @PathVariable("classroomId") String classroomId) {
        if (userRepository.existsByToken(authToken)) {
            return new ResponseEntity<>(classroomService.findClassroomById(classroomId), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(new InvalidTokenException("Invalid Token"), HttpStatus.UNAUTHORIZED);
        }
    }
    @GetMapping("/{classroomId}/timetable")
    public ResponseEntity<?> getClassroomTimetable(@RequestHeader("Authorization") String authToken, @PathVariable("classroomId") String classroomId) {
        if (userRepository.existsByToken(authToken)) {
            return new ResponseEntity<>(classroomService.findTimetable(classroomId), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(new InvalidTokenException("Invalid Token"), HttpStatus.UNAUTHORIZED);
        }
    }

}
