package com.hagyo.main.main.controller;

import com.hagyo.main.main.exception.InvalidTokenException;
import com.hagyo.main.main.model.Teacher;
import com.hagyo.main.main.repository.UserRepository;
import com.hagyo.main.main.security.TokenService;
import com.hagyo.main.main.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/teachers")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{tid}")
    public ResponseEntity<?> getTeacherByTid(@RequestHeader("Authorization") String authToken, @PathVariable("tid") String tid) {
        if (userRepository.existsByToken(authToken)) {
            return new ResponseEntity<>(teacherService.findTeacherByTid(tid), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(new InvalidTokenException("Invalid Token"), HttpStatus.UNAUTHORIZED);
        }
    }
}
