package com.hagyo.main.main.dto;

import com.hagyo.main.main.dto.TimetablePeriodDto;

public class TimetableDto {

    private Integer id;
    private TimetablePeriodDto sundayPeriods;
    private TimetablePeriodDto mondayPeriods;
    private TimetablePeriodDto tuesdayPeriods;
    private TimetablePeriodDto wednesdayPeriods;
    private TimetablePeriodDto thursdayPeriods;
    private TimetablePeriodDto fridayPeriods;
    private TimetablePeriodDto saturdayPeriods;

    public TimetableDto(Integer id, TimetablePeriodDto sundayPeriods, TimetablePeriodDto mondayPeriods, TimetablePeriodDto tuesdayPeriods, TimetablePeriodDto wednesdayPeriods, TimetablePeriodDto thursdayPeriods, TimetablePeriodDto fridayPeriods, TimetablePeriodDto saturdayPeriods) {
        this.id = id;
        this.sundayPeriods = sundayPeriods;
        this.mondayPeriods = mondayPeriods;
        this.tuesdayPeriods = tuesdayPeriods;
        this.wednesdayPeriods = wednesdayPeriods;
        this.thursdayPeriods = thursdayPeriods;
        this.fridayPeriods = fridayPeriods;
        this.saturdayPeriods = saturdayPeriods;
    }

    public TimetableDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TimetablePeriodDto getSundayPeriods() {
        return sundayPeriods;
    }

    public void setSundayPeriods(TimetablePeriodDto sundayPeriods) {
        this.sundayPeriods = sundayPeriods;
    }

    public TimetablePeriodDto getMondayPeriods() {
        return mondayPeriods;
    }

    public void setMondayPeriods(TimetablePeriodDto mondayPeriods) {
        this.mondayPeriods = mondayPeriods;
    }

    public TimetablePeriodDto getTuesdayPeriods() {
        return tuesdayPeriods;
    }

    public void setTuesdayPeriods(TimetablePeriodDto tuesdayPeriods) {
        this.tuesdayPeriods = tuesdayPeriods;
    }

    public TimetablePeriodDto getWednesdayPeriods() {
        return wednesdayPeriods;
    }

    public void setWednesdayPeriods(TimetablePeriodDto wednesdayPeriods) {
        this.wednesdayPeriods = wednesdayPeriods;
    }

    public TimetablePeriodDto getThursdayPeriods() {
        return thursdayPeriods;
    }

    public void setThursdayPeriods(TimetablePeriodDto thursdayPeriods) {
        this.thursdayPeriods = thursdayPeriods;
    }

    public TimetablePeriodDto getFridayPeriods() {
        return fridayPeriods;
    }

    public void setFridayPeriods(TimetablePeriodDto fridayPeriods) {
        this.fridayPeriods = fridayPeriods;
    }

    public TimetablePeriodDto getSaturdayPeriods() {
        return saturdayPeriods;
    }

    public void setSaturdayPeriods(TimetablePeriodDto saturdayPeriods) {
        this.saturdayPeriods = saturdayPeriods;
    }
}
