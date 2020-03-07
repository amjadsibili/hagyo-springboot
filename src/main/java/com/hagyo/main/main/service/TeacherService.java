package com.hagyo.main.main.service;

import com.hagyo.main.main.model.Teacher;
import com.hagyo.main.main.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    public Teacher findTeacherByTid(String tid) {
        List<Teacher> teachers = teacherRepository.findByTid(tid);
        if (!teachers.isEmpty()) {
            return  teachers.get(0);
        } else {
            return new Teacher();
        }
    }
}
