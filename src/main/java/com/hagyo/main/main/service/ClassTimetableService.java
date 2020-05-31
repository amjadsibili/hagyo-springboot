package com.hagyo.main.main.service;

import com.hagyo.main.main.dto.AllotedPeriodDto;
import com.hagyo.main.main.dto.DayWiseSlotsAndSubjectsDto;
import com.hagyo.main.main.dto.PeriodIndexDto;
import com.hagyo.main.main.model.ClassTimetable;
import com.hagyo.main.main.model.Subject;
import com.hagyo.main.main.model.TimetablePeriod;
import com.hagyo.main.main.repository.ClassTimetableRepository;
import com.hagyo.main.main.repository.SubjectRepository;
import com.hagyo.main.main.repository.TimetablePeriodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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
        List<TimetablePeriod> isTakingPeriod1 = null;
        List<TimetablePeriod> isTakingPeriod2 = null;
        List<TimetablePeriod> isTakingPeriod3 = null;
        List<TimetablePeriod> isTakingPeriod4 = null;
        List<TimetablePeriod> isTakingPeriod5 = null;
        List<TimetablePeriod> isTakingPeriod6 = null;
        List<TimetablePeriod> isTakingPeriod7 = null;
        List<TimetablePeriod> isTakingPeriod8 = null;

        for (Subject subject : handlingSubjects) {
            String subjectId = subject.getId();
            isTakingPeriod1 = timetablePeriodRepository.findByPeriod1(subjectId);
            isTakingPeriod2 = timetablePeriodRepository.findByPeriod2(subjectId);
            isTakingPeriod3 = timetablePeriodRepository.findByPeriod3(subjectId);
            isTakingPeriod4 = timetablePeriodRepository.findByPeriod4(subjectId);
            isTakingPeriod5 = timetablePeriodRepository.findByPeriod5(subjectId);
            isTakingPeriod6 = timetablePeriodRepository.findByPeriod6(subjectId);
            isTakingPeriod7 = timetablePeriodRepository.findByPeriod7(subjectId);
            isTakingPeriod8 = timetablePeriodRepository.findByPeriod8(subjectId);
        }

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

        List<ClassTimetable> isExistsByMondayPeriods = null;
        //TODO lookup on each days by existsBy not by findBY -> based on that create a new dto and then do a lookup on classrooms object.
        boolean isInMonday = false;
        boolean isInTuesday = false;
        boolean isInWednesday = false;
        boolean isInThursday = false;
        boolean isInFriday = false;
        boolean isInSaturday = false;
        boolean isInSunday = false;

        for (PeriodIndexDto periodIndexDto : periodIndexDtos) {
            String periodId = periodIndexDto.getPeriodId();
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
    private List<DayWiseSlotsAndSubjectsDto> convertToDaywiseSlots(List<PeriodIndexDto> periodIndexDtos, String day) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<DayWiseSlotsAndSubjectsDto> dayWiseSlotsAndSubjectsDtos = new ArrayList<>();
//        for (PeriodIndexDto periodIndexDto : periodIndexDtos) {
//            String periodId = periodIndexDto.getPeriodId();
//            if (classTimetableRepository.findByMondayPeriods(periodId) != null) {
//                dayWiseSlotsAndSubjectsDtos.add(new DayWiseSlotsAndSubjectsDto(
//                        day,
//                        periodId,
//                        periodIndexDto.getPeriodSubjectMap()
//                ));
//            }
//        }
        for (PeriodIndexDto periodIndexDto : periodIndexDtos) {
            Method findPeriods = ClassTimetableRepository.class.getMethod("findBy" + day + "Periods", String.class);
            List<ClassTimetable> timeTableInGivenDay = (List<ClassTimetable>) findPeriods.invoke(classTimetableRepository, periodIndexDto.getPeriodId());
        }
        return new ArrayList<>();
    }

}
