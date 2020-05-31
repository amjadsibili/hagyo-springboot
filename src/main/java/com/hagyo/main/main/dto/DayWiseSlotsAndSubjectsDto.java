package com.hagyo.main.main.dto;

import java.util.Map;

public class DayWiseSlotsAndSubjectsDto {

    private String day;
    private String id;
    private Map<Integer, String> subjectMap;

    public DayWiseSlotsAndSubjectsDto(String day, String id, Map<Integer, String> subjectMap) {
        this.day = day;
        this.id = id;
        this.subjectMap = subjectMap;
    }

    public String getDay() {
        return day;
    }

    public String getId() {
        return id;
    }

    public Map<Integer, String> getSubjectMap() {
        return subjectMap;
    }
}
