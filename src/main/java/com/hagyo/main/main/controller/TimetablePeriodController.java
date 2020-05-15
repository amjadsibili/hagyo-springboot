package com.hagyo.main.main.controller;

import com.hagyo.main.main.dto.ResponseInfo;
import com.hagyo.main.main.exception.InvalidTokenException;
import com.hagyo.main.main.model.TimetablePeriod;
import com.hagyo.main.main.repository.UserRepository;
import com.hagyo.main.main.service.TimetablePeriodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/periods")
public class TimetablePeriodController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private TimetablePeriodService timetablePeriodService;

    @PostMapping("/create")
    public ResponseEntity<?> createPeriod(@RequestHeader("Authorization") String authToken,
                                          @RequestBody TimetablePeriod timetablePeriod
                                          ){
        if (userRepository.existsByToken(authToken)) {
            return new ResponseEntity<>(timetablePeriodService.createTimetablePeriod(timetablePeriod),
                    HttpStatus.OK);
        } else{
            return new ResponseEntity<>(new InvalidTokenException("Invalid Token"), HttpStatus.UNAUTHORIZED);
        }
    }

    @PatchMapping("/{periodId}/edit")
    public ResponseEntity<?> createPeriod(@RequestHeader("Authorization") String authToken,
                                          @RequestBody Map<String, Object> timetablePeriodNew,
                                          @PathVariable("periodId") String periodId
    ){
        if (userRepository.existsByToken(authToken)) {
            return new ResponseEntity<>(timetablePeriodService.editTimetable(periodId, timetablePeriodNew),
                    HttpStatus.OK);
        } else{
            return new ResponseEntity<>(new InvalidTokenException("Invalid Token"), HttpStatus.UNAUTHORIZED);
        }
    }

//    @GetMapping("/teachers/{tid}")
//    public ResponseInfo getTeacherTimetable(
//            @RequestHeader("Authorization") String authToken,
//            @PathVariable("tid") String teacherId
//    ) {
//
//    }


}
