package com.hagyo.main.main.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "exam")
public class Exam {
    @Id
    private String id;
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

    public Exam(Date examDate, String examStartingTime, String examType, String examName, int examSubject, String examHours, float passMark, int totalMark, int school, int classroom, int conductedBy, String description) {
        this.examDate = examDate;
        this.examStartingTime = examStartingTime;
        this.examType = examType;
        this.examName = examName;
        this.examSubject = examSubject;
        this.examHours = examHours;
        this.passMark = passMark;
        this.totalMark = totalMark;
        this.school = school;
        this.classroom = classroom;
        this.conductedBy = conductedBy;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

    public String getExamStartingTime() {
        return examStartingTime;
    }

    public void setExamStartingTime(String examStartingTime) {
        this.examStartingTime = examStartingTime;
    }

    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public int getExamSubject() {
        return examSubject;
    }

    public void setExamSubject(int examSubject) {
        this.examSubject = examSubject;
    }

    public String getExamHours() {
        return examHours;
    }

    public void setExamHours(String examHours) {
        this.examHours = examHours;
    }

    public float getPassMark() {
        return passMark;
    }

    public void setPassMark(float passMark) {
        this.passMark = passMark;
    }

    public int getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(int totalMark) {
        this.totalMark = totalMark;
    }

    public int getSchool() {
        return school;
    }

    public void setSchool(int school) {
        this.school = school;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public int getConductedBy() {
        return conductedBy;
    }

    public void setConductedBy(int conductedBy) {
        this.conductedBy = conductedBy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}