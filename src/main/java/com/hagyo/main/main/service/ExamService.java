package com.hagyo.main.main.service;

import com.hagyo.main.main.dto.ExamDto;
import com.hagyo.main.main.model.Exam;
import com.hagyo.main.main.repository.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
public class ExamService {

    @Autowired
    private ExamRepository examRepository;

    @Autowired
    private MongoOperations mongoOperations;

    public List<Exam> findExamsByTeacher(int teacherId) {
        return examRepository.findByconductedBy(teacherId);
    }

    public Exam saveExam(ExamDto exam) {
        Exam newExam = new Exam(exam.getExamDate(), exam.getExamStartingTime(), exam.getExamType(), exam.getExamName(), exam.getExamSubject(), exam.getExamHours(), exam.getPassMark(), exam.getTotalMark(), exam.getSchool(), exam.getClassroom(), exam.getConductedBy(), exam.getDescription());
        return examRepository.save(newExam);
    }

    public Exam updateExam(String id, Map<String, Object> updates) {
        updates.values().removeIf(Objects::isNull);
        Update update = new Update();
        updates.forEach(update::set);

        return mongoOperations.findAndModify(
                Query.query(Criteria.where("_id").is(id)), update, Exam.class);
    }

}
