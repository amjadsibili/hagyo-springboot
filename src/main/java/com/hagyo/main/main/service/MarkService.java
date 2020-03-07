package com.hagyo.main.main.service;

import com.hagyo.main.main.dto.ExamMarkDto;
import com.hagyo.main.main.model.Exam;
import com.hagyo.main.main.model.Mark;
import com.hagyo.main.main.repository.ExamRepository;
import com.hagyo.main.main.repository.MarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MarkService {

    @Autowired
    private MarkRepository markRepository;

    @Autowired
    private ExamRepository examRepository;

    public List<ExamMarkDto> findMarksByStudentId(String id) {
        List<ExamMarkDto> examMarkDtos = new ArrayList<>();
        List<Mark> marks = markRepository.findByStudent(id);
        for(Mark mark: marks) {
            Exam exam = examRepository.findById(mark.getExam());
            examMarkDtos.add(new ExamMarkDto(mark.getId(), exam.getExamName(), mark.getMarkReceived()));
        }
        return examMarkDtos;
    }
    public Mark editMark(String id, String mark) {
        Mark current = markRepository.findById(id);
        current.setMarkReceived(mark);
        return markRepository.save(current);
    }
    public Mark createMark(Mark mark) {
        return markRepository.save(mark);
    }

}