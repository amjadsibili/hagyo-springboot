package com.hagyo.main.main.service;

import com.hagyo.main.main.dto.HandledByDto;
import com.hagyo.main.main.model.Subject;
import com.hagyo.main.main.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    public List<Subject> findSubjectByClassroomAndSchool(int classroom, int school) {
        return subjectRepository.findByClassroomAndSchool(classroom, school);
    }
    public HandledByDto findTeacherBySubject(String subject) {
        Subject teacherSubject = subjectRepository.findById(subject);
        return new HandledByDto(teacherSubject.getHandledBy());
    }

}
