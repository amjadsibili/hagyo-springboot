package com.hagyo.main.main.controller;

import com.hagyo.main.main.exception.InvalidTokenException;
import com.hagyo.main.main.model.Subject;
import com.hagyo.main.main.repository.UserRepository;
import com.hagyo.main.main.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subjects")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public ResponseEntity<?> findBySubjectsClassroomAndSchool(@RequestHeader("Authorization") String authToken, @RequestParam("schoolId") Integer schoolId, @RequestParam("classId") Integer classroomId) {
        if (userRepository.existsByToken(authToken)) {
            return new ResponseEntity<>(subjectService.findSubjectByClassroomAndSchool(schoolId, classroomId), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(new InvalidTokenException("Invalid Token"), HttpStatus.UNAUTHORIZED);
        }
    }
    @GetMapping("/{subjectId}/teacher")
    public ResponseEntity<?> findTeacherBySubject(@RequestHeader("Authorization") String authToken, @PathVariable("subjectId") String subjectId) {
        if (userRepository.existsByToken(authToken)) {
            return new ResponseEntity<>(subjectService.findTeacherBySubject(subjectId), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(new InvalidTokenException("Invalid Token"), HttpStatus.UNAUTHORIZED);
        }
    }

}
