package com.hagyo.main.main.controller;

import com.hagyo.main.main.dto.ExamDto;
import com.hagyo.main.main.exception.InvalidTokenException;
import com.hagyo.main.main.model.Exam;
import com.hagyo.main.main.repository.UserRepository;
import com.hagyo.main.main.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/exams")
public class ExamController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ExamService examService;

    @GetMapping("/")
    public ResponseEntity<?> getExamsByTeacherId(@RequestHeader("Authorization") String authToken,
                                                 @RequestParam("tid") Integer teacherId) {
        if (userRepository.existsByToken(authToken)) {
            return new ResponseEntity<>(examService.findExamsByTeacher(teacherId), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(new InvalidTokenException("Invalid Token"), HttpStatus.UNAUTHORIZED);
        }
    }

    @PostMapping("/create")
    public ResponseEntity<?> createAnExam(@RequestHeader("Authorization") String authToken,
                                          @RequestBody ExamDto exam) {
        if (userRepository.existsByToken(authToken)) {
            return new ResponseEntity<>(examService.saveExam(exam), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(new InvalidTokenException("Invalid Token"), HttpStatus.UNAUTHORIZED);
        }
    }

    @PatchMapping("/{examId}/edit")
    public ResponseEntity<?> updateExam(@RequestHeader("Authorization") String authToken,
                                        @RequestBody Map<String, Object> updates,
                                        @PathVariable("examId") String examdId) {
        if (userRepository.existsByToken(authToken)) {
            return new ResponseEntity<>(examService.updateExam(examdId, updates), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(new InvalidTokenException("Invalid Token"), HttpStatus.UNAUTHORIZED);
        }
    }
}
