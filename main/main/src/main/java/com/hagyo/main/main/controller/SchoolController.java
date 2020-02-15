package com.hagyo.main.main.controller;

import com.hagyo.main.main.model.School;
import com.hagyo.main.main.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/schools")
public class SchoolController {
    @Autowired
    private SchoolRepository schoolRepository;

    @GetMapping("/{schoolId}")
    public Optional<School> getSchoolDetails(@PathVariable("schoolId") String schoolId) {
        return schoolRepository.findById(Integer.parseInt(schoolId));
    }
}
