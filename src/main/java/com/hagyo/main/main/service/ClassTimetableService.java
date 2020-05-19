package com.hagyo.main.main.service;

import com.hagyo.main.main.dto.AllotedPeriodDto;
import com.hagyo.main.main.dto.PeriodIndexDto;
import com.hagyo.main.main.model.Subject;
import com.hagyo.main.main.model.TimetablePeriod;
import com.hagyo.main.main.repository.ClassTimetableRepository;
import com.hagyo.main.main.repository.SubjectRepository;
import com.hagyo.main.main.repository.TimetablePeriodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class ClassTimetableService {

    @Autowired
    private SubjectRepository subjectRepository;
    @Autowired
    private TimetablePeriodRepository timetablePeriodRepository;
    @Autowired
    private ClassTimetableRepository classTimetableRepository;

    public List<AllotedPeriodDto> getAllotedPeriodsByTeacher(String teacherId) {
        List<Subject> handlingSubjects = subjectRepository.findByHandledBy(teacherId);
        for (Subject subject : handlingSubjects) {
            String subjectId = subject.getId();
            List<TimetablePeriod> isTakingPeriod1 = timetablePeriodRepository.findByPeriod1(subjectId);
            //TODO do a lookup on classtimetable models based on timetableperiodid
            List<TimetablePeriod> isTakingPeriod2 = timetablePeriodRepository.findByPeriod2(subjectId);
            List<TimetablePeriod> isTakingPeriod3 = timetablePeriodRepository.findByPeriod3(subjectId);
            List<TimetablePeriod> isTakingPeriod4 = timetablePeriodRepository.findByPeriod4(subjectId);
            List<TimetablePeriod> isTakingPeriod5 = timetablePeriodRepository.findByPeriod5(subjectId);
            List<TimetablePeriod> isTakingPeriod6 = timetablePeriodRepository.findByPeriod6(subjectId);
            List<TimetablePeriod> isTakingPeriod7 = timetablePeriodRepository.findByPeriod7(subjectId);
            List<TimetablePeriod> isTakingPeriod8 = timetablePeriodRepository.findByPeriod8(subjectId);

            List<PeriodIndexDto> periodIndexDtos = new ArrayList<>();
            if (isTakingPeriod1 != null) {
                periodIndexDtos.addAll(getAllotedPeriodsAndSubjectsFromTimetablePeriod(isTakingPeriod1, 1));
            }
            if (isTakingPeriod2 != null) {
                periodIndexDtos.addAll(getAllotedPeriodsAndSubjectsFromTimetablePeriod(isTakingPeriod2, 2));
            }
            if (isTakingPeriod3 != null) {
                periodIndexDtos.addAll(getAllotedPeriodsAndSubjectsFromTimetablePeriod(isTakingPeriod3, 3));
            }
            if (isTakingPeriod4 != null) {
                periodIndexDtos.addAll(getAllotedPeriodsAndSubjectsFromTimetablePeriod(isTakingPeriod4, 4));
            }
            if (isTakingPeriod5 != null) {
                periodIndexDtos.addAll(getAllotedPeriodsAndSubjectsFromTimetablePeriod(isTakingPeriod5, 5));
            }
            if (isTakingPeriod6 != null) {
                periodIndexDtos.addAll(getAllotedPeriodsAndSubjectsFromTimetablePeriod(isTakingPeriod6, 6));
            }
            if (isTakingPeriod7 != null) {
                periodIndexDtos.addAll(getAllotedPeriodsAndSubjectsFromTimetablePeriod(isTakingPeriod7, 7));
            }
            if (isTakingPeriod8 != null) {
                periodIndexDtos.addAll(getAllotedPeriodsAndSubjectsFromTimetablePeriod(isTakingPeriod8, 8));
            }

        }
        return new ArrayList<AllotedPeriodDto>();
    }
    private List<PeriodIndexDto> getAllotedPeriodsAndSubjectsFromTimetablePeriod(List<TimetablePeriod> timetablePeriod, int period) {
        List<PeriodIndexDto> periodIndexDtos = new ArrayList<>();
        for (TimetablePeriod timetablePeriodInstance : timetablePeriod) {
            PeriodIndexDto periodIndexDto = new PeriodIndexDto(timetablePeriodInstance.getId(),
                    new HashMap<Integer, String>() {{
                        put(period, timetablePeriodInstance.getPeriod1());
                    }});
            periodIndexDtos.add(periodIndexDto);
        }
        return periodIndexDtos;
    }

}
