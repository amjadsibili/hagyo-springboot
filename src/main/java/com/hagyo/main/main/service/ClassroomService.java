package com.hagyo.main.main.service;

import com.hagyo.main.main.dto.TimetableDto;
import com.hagyo.main.main.dto.TimetablePeriodDto;
import com.hagyo.main.main.model.ClassTimetable;
import com.hagyo.main.main.model.Classroom;
import com.hagyo.main.main.model.Subject;
import com.hagyo.main.main.model.TimetablePeriod;
import com.hagyo.main.main.repository.ClassTimetableRepository;
import com.hagyo.main.main.repository.ClassroomRepository;
import com.hagyo.main.main.repository.SubjectRepository;
import com.hagyo.main.main.repository.TimetablePeriodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ClassroomService {

    @Autowired
    private ClassroomRepository classroomRepository;

    @Autowired
    private ClassTimetableRepository classTimetableRepository;

    @Autowired
    private TimetablePeriodRepository timetablePeriodRepository;

    @Autowired
    private SubjectRepository subjectRepository;


    public Optional<Classroom> findClassroomById(String id) {
        return classroomRepository.findById(id);
    }

    public TimetableDto findTimetable(String id) {
        int timetableId = (classroomRepository.findById(id).orElse(null)).getTimetable();
        ClassTimetable timetable = classTimetableRepository.findById(timetableId);

        TimetableDto timetableDto = new TimetableDto();

        if (timetable != null) {

            int mondayPeriodsId = timetable.getMondayPeriods();
            TimetablePeriod mondayPeriod = timetablePeriodRepository.findById(mondayPeriodsId).orElse(null);

            int tuesdayPeriodsId = timetable.getTuesdayPeriods();
            TimetablePeriod tuesdayPeriod = timetablePeriodRepository.findById(tuesdayPeriodsId).orElse(null);

            int wednesdayPeriodsId = timetable.getWednesdayPeriods();
            TimetablePeriod wednesdayPeriod = timetablePeriodRepository.findById(wednesdayPeriodsId).orElse(null);

            int thursdayPeriodsId = timetable.getThursdayPeriods();
            TimetablePeriod thursdayPeriod = timetablePeriodRepository.findById(thursdayPeriodsId).orElse(null);

            int fridayPeriodsId = timetable.getFridayPeriods();
            TimetablePeriod fridayPeriod = timetablePeriodRepository.findById(fridayPeriodsId).orElse(null);

//        Integer saturdayPeriodsId = timetable.getSaturdayPeriods();
        TimetablePeriod saturdayPeriod = null;
//        if (saturdayPeriodsId != null)
//             saturdayPeriod = timetablePeriodRepository.findById(saturdayPeriodsId).orElse(null);

            if (timetable.getSaturdayPeriods() != null) {
                saturdayPeriod = timetablePeriodRepository.findById(timetable.getSaturdayPeriods()).orElse(null);
                timetableDto.setSaturdayPeriods(getTimeTablePeriod(saturdayPeriod));
            } else {
                timetableDto.setSaturdayPeriods(null);
            }

            TimetablePeriod sundayPeriod;
            if (timetable.getSundayPeriods() != null) {
                sundayPeriod = timetablePeriodRepository.findById(timetable.getSundayPeriods()).orElse(null);
                timetableDto.setSundayPeriods(getTimeTablePeriod(sundayPeriod));
            } else {
                timetableDto.setSaturdayPeriods(null);
            }

//        Integer sundayPeriodsId = timetable.getSundayPeriods();
//        TimetablePeriod sundayPeriod = null;
//        if (sundayPeriodsId != null)
//         sundayPeriod = timetablePeriodRepository.findById(sundayPeriodsId).orElse(null);


            timetableDto.setId(timetableId);
            timetableDto.setMondayPeriods(getTimeTablePeriod(mondayPeriod));
            timetableDto.setTuesdayPeriods(getTimeTablePeriod(tuesdayPeriod));
            timetableDto.setWednesdayPeriods(getTimeTablePeriod(wednesdayPeriod));
            timetableDto.setThursdayPeriods(getTimeTablePeriod(thursdayPeriod));
            timetableDto.setFridayPeriods(getTimeTablePeriod(fridayPeriod));

//            timetableDto.setSundayPeriods(getTimeTablePeriod(sundayPeriod));
        }
        return timetableDto;
    }

    private TimetablePeriodDto getTimeTablePeriod(TimetablePeriod timetablePeriod) {
        TimetablePeriodDto timetablePeriodDto = new TimetablePeriodDto();
        List<Subject> subjects = new ArrayList<>();
        List<Integer> subjectIds = new ArrayList<>(Arrays.asList(
                timetablePeriod.getPeriod1(),
                timetablePeriod.getPeriod2(),
                timetablePeriod.getPeriod3(),
                timetablePeriod.getPeriod4(),
                timetablePeriod.getPeriod5(),
                timetablePeriod.getPeriod6(),
                timetablePeriod.getPeriod7(),
                timetablePeriod.getPeriod8()));

        subjectIds.forEach(id -> {
            subjects.add(subjectRepository.findById(id).orElse(null));
        });
        timetablePeriodDto.setId(timetablePeriod.getId());
        timetablePeriodDto.setPeriod1(subjects.get(0));
        timetablePeriodDto.setPeriod2(subjects.get(1));
        timetablePeriodDto.setPeriod3(subjects.get(2));
        timetablePeriodDto.setPeriod4(subjects.get(3));
        timetablePeriodDto.setPeriod5(subjects.get(4));
        timetablePeriodDto.setPeriod6(subjects.get(5));
        timetablePeriodDto.setPeriod7(subjects.get(6));
        timetablePeriodDto.setPeriod8(subjects.get(7));

        return timetablePeriodDto;
    }

}
