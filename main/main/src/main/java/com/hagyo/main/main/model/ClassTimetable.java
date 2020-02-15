package com.hagyo.main.main.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "time_table")
public class ClassTimetable {
    @Id
    private int id;
    private int sundayPeriods;
    private int mondayPeriods;
    private int tuesdayPeriods;
    private int wednesdayPeriods;
    private int thursdayPeriods;
    private int fridayPeriods;
    private int saturdayPeriods;

}
