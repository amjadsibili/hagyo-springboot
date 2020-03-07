package com.hagyo.main.main.controller;

import com.hagyo.main.main.exception.InvalidTokenException;
import com.hagyo.main.main.repository.UserRepository;
import com.hagyo.main.main.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private StudentService studentService;

    @GetMapping("/{studentId}")
   public ResponseEntity<?> getStudentDetails(@RequestHeader("Authorization") String authToken, @PathVariable("studentId") Integer studentId) {
        if (userRepository.existsByToken(authToken)) {
            return new ResponseEntity<>(studentService.findById(studentId), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(new InvalidTokenException("Invalid Token"), HttpStatus.UNAUTHORIZED);
        }
    }

    @GetMapping("/")
    public ResponseEntity<?> getStudentsByClassroom(@RequestHeader("Authorization") String authToken, @RequestParam("classId") Integer classroomId) {
        if (userRepository.existsByToken(authToken)) {
            return new ResponseEntity<>(studentService.findByClassroom(classroomId), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(new InvalidTokenException("Invalid Token"), HttpStatus.UNAUTHORIZED);
        }
    }
}
