package com.hagyo.main.main.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "attendance")
public class Attendance {
    @Id
    private int id;
    private Date attendanceDate;
    private boolean isMorning;
    private int classroom;
    private int school;
    private int presentStudent;
    private boolean isPresent;
    private int academicYear;
}
