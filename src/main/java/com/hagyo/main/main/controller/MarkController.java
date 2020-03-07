package com.hagyo.main.main.controller;

import com.hagyo.main.main.dto.ExamMarkDto;
import com.hagyo.main.main.exception.InvalidTokenException;
import com.hagyo.main.main.model.Mark;
import com.hagyo.main.main.repository.UserRepository;
import com.hagyo.main.main.service.MarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/marks")
public class MarkController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MarkService markService;

    @GetMapping("/{studentId}")
    public ResponseEntity<?> getMarksOfStudent(@RequestHeader("Authorization") String authToken, @PathVariable("studentId") String studentId){
        if (userRepository.existsByToken(authToken)) {
            return new ResponseEntity<>(markService.findMarksByStudentId(studentId), HttpStatus.OK);
        } else{
            return new ResponseEntity<>(new InvalidTokenException("Invalid Token"), HttpStatus.UNAUTHORIZED);
        }
    }
    @PatchMapping("/{markId}/edit")
    public ResponseEntity<?> editMark(@RequestHeader("Authorization") String authToken,
                                      @PathVariable("markId") String markId,
                                      @RequestBody Map<String, Object> mark
                                      ){
        if (userRepository.existsByToken(authToken)) {
            return new ResponseEntity<>(markService.editMark(markId, (String) mark.get("mark")), HttpStatus.OK);
        } else{
            return new ResponseEntity<>(new InvalidTokenException("Invalid Token"), HttpStatus.UNAUTHORIZED);
        }
    }
    @PostMapping("/create")
    public ResponseEntity<?> createMark(@RequestHeader("Authorization") String authToken,
                                        @RequestBody Mark mark
                                        ){
        if (userRepository.existsByToken(authToken)) {
            return new ResponseEntity<>(markService.createMark(mark), HttpStatus.CREATED);
        } else{
            return new ResponseEntity<>(new InvalidTokenException("Invalid Token"), HttpStatus.UNAUTHORIZED);
        }
    }
}
