package com.hagyo.main.main.service;

import com.hagyo.main.main.model.TimetablePeriod;
import com.hagyo.main.main.repository.TimetablePeriodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class TimetablePeriodService {

    @Autowired
    private TimetablePeriodRepository timetablePeriodRepository;

    public TimetablePeriod createTimetablePeriod(TimetablePeriod timetablePeriod) {
       return timetablePeriodRepository.save(timetablePeriod);
    }
    public TimetablePeriod editTimetable(String periodId, Map<String, Object> changes) {
        TimetablePeriod currentTimetablePeriod = timetablePeriodRepository.findById(periodId);
        if(changes.containsKey("period2")) currentTimetablePeriod.setPeriod2((String) changes.get("period2"));
        if(changes.containsKey("period3")) currentTimetablePeriod.setPeriod3((String) changes.get("period3"));
        if(changes.containsKey("period1")) currentTimetablePeriod.setPeriod1((String) changes.get("period1"));
        if(changes.containsKey("period4")) currentTimetablePeriod.setPeriod4((String)changes.get("period4"));
        if(changes.containsKey("period5")) currentTimetablePeriod.setPeriod5((String) changes.get("period5"));
        if(changes.containsKey("period6")) currentTimetablePeriod.setPeriod6((String) changes.get("period6"));
        if(changes.containsKey("period7")) currentTimetablePeriod.setPeriod7((String) changes.get("period7"));
        if(changes.containsKey("period8")) currentTimetablePeriod.setPeriod8((String) changes.get("period8"));
        return timetablePeriodRepository.save(currentTimetablePeriod);
    }

}
