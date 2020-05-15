package com.hagyo.main.main.service;

import com.hagyo.main.main.dto.AllotedPeriodDto;
import com.hagyo.main.main.model.Subject;
import com.hagyo.main.main.model.TimetablePeriod;
import com.hagyo.main.main.repository.ClassTimetableRepository;
import com.hagyo.main.main.repository.SubjectRepository;
import com.hagyo.main.main.repository.TimetablePeriodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassTimetableService {

    @Autowired
    private SubjectRepository subjectRepository;
    @Autowired
    private TimetablePeriodRepository timetablePeriodRepository;
    @Autowired
    private ClassTimetableRepository classTimetableRepository;

    public List<AllotedPeriodDto> getAllotedPeriodsByTeacher(int teacherId) {
        List<Subject> handlingSubjects = subjectRepository.findByHandledBy(teacherId);
        for (Subject subject : handlingSubjects) {
            int subjectId = subject.getId();
            List<TimetablePeriod> isTakingPeriod1 = timetablePeriodRepository.findByPeriod1(subjectId);
            //TODO do a lookup on classtimetable models based on timetableperiodid
            List<TimetablePeriod> isTakingPeriod2 = timetablePeriodRepository.findByPeriod2(subjectId);
            List<TimetablePeriod> isTakingPeriod3 = timetablePeriodRepository.findByPeriod3(subjectId);
            List<TimetablePeriod> isTakingPeriod4 = timetablePeriodRepository.findByPeriod4(subjectId);
            List<TimetablePeriod> isTakingPeriod5 = timetablePeriodRepository.findByPeriod5(subjectId);
            List<TimetablePeriod> isTakingPeriod6 = timetablePeriodRepository.findByPeriod6(subjectId);
            List<TimetablePeriod> isTakingPeriod7 = timetablePeriodRepository.findByPeriod7(subjectId);
            List<TimetablePeriod> isTakingPeriod8 = timetablePeriodRepository.findByPeriod8(subjectId);

            if (isTakingPeriod1 != null) {
                
            }

        }
    }

}
