package com.hagyo.main.main.service;

import com.hagyo.main.main.model.Student;
import com.hagyo.main.main.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student findById(int id) {
        return studentRepository.findById(id);
    }
    public List<Student> findByClassroom(int classroomId) {
        return  studentRepository.findByBelongingClass(classroomId);
    }

}
