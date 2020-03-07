package com.hagyo.main.main.dto;

import java.util.Date;

public class ExamDto {

    private Date examDate;
    private String examStartingTime;
    private String examType;
    private String examName;
    private int examSubject;
    private String examHours;
    private float passMark;
    private int totalMark;
    private int school;
    private int classroom;
    private int conductedBy;
    private String description;

    public Date getExamDate() {
        return examDate;
    }

    public String getExamStartingTime() {
        return examStartingTime;
    }

    public String getExamType() {
        return examType;
    }

    public String getExamName() {
        return examName;
    }

    public int getExamSubject() {
        return examSubject;
    }

    public String getExamHours() {
        return examHours;
    }

    public float getPassMark() {
        return passMark;
    }

    public int getTotalMark() {
        return totalMark;
    }

    public int getSchool() {
        return school;
    }

    public int getClassroom() {
        return classroom;
    }

    public int getConductedBy() {
        return conductedBy;
    }

    public String getDescription() {
        return description;
    }
}
