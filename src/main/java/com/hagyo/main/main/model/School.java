package com.hagyo.main.main.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

@Data
@ToString
@Document(collection = "school")
public class School {
    @Id
    private int id;
    private String name;
    private String uniqueId;
    private String address;
    private int noOfStudents;
    private int noOfFaculties;
    private int noOfClasses;
    private int academicYear;
    private int headPerson;
    private String contactNo;
    private boolean isActivated;
    private int noOfWorkingDays;
    private int noOfPeriods;
    private String classDistributions;

}
