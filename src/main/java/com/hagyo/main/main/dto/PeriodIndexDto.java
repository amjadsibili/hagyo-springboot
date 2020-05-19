package com.hagyo.main.main.dto;

import java.util.Map;

public class PeriodIndexDto {

    private String periodId;
    private Map<Integer, String> periodSubjectMap;

    public PeriodIndexDto(String periodId, Map<Integer, String> periodSubjectMap) {
        this.periodId = periodId;
        this.periodSubjectMap = periodSubjectMap;
    }

    public String getPeriodId() {
        return periodId;
    }

    public void setPeriodId(String periodId) {
        this.periodId = periodId;
    }

    public Map<Integer, String> getPeriodSubjectMap() {
        return periodSubjectMap;
    }

    public void setPeriodSubjectMap(Map<Integer, String> periodSubjectMap) {
        this.periodSubjectMap = periodSubjectMap;
    }
}
