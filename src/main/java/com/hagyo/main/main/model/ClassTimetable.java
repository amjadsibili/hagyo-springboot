package com.hagyo.main.main.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "time_table")
public class ClassTimetable {
    @Id
    private Integer id;
    private Integer sundayPeriods;
    private int mondayPeriods;
    private int tuesdayPeriods;
    private int wednesdayPeriods;
    private int thursdayPeriods;
    private Integer fridayPeriods;
    private Integer saturdayPeriods;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSundayPeriods() {
        return sundayPeriods;
    }

    public void setSundayPeriods(Integer sundayPeriods) {
        this.sundayPeriods = sundayPeriods;
    }

    public int getMondayPeriods() {
        return mondayPeriods;
    }

    public void setMondayPeriods(int mondayPeriods) {
        this.mondayPeriods = mondayPeriods;
    }

    public int getTuesdayPeriods() {
        return tuesdayPeriods;
    }

    public void setTuesdayPeriods(int tuesdayPeriods) {
        this.tuesdayPeriods = tuesdayPeriods;
    }

    public int getWednesdayPeriods() {
        return wednesdayPeriods;
    }

    public void setWednesdayPeriods(int wednesdayPeriods) {
        this.wednesdayPeriods = wednesdayPeriods;
    }

    public int getThursdayPeriods() {
        return thursdayPeriods;
    }

    public void setThursdayPeriods(int thursdayPeriods) {
        this.thursdayPeriods = thursdayPeriods;
    }

    public Integer getFridayPeriods() {
        return fridayPeriods;
    }

    public void setFridayPeriods(Integer fridayPeriods) {
        this.fridayPeriods = fridayPeriods;
    }

    public Integer getSaturdayPeriods() {
        return saturdayPeriods;
    }

    public void setSaturdayPeriods(Integer saturdayPeriods) {
        this.saturdayPeriods = saturdayPeriods;
    }
}
