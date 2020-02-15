package com.hagyo.main.main.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "exam")
public class Exam {
    @Id
    private int id;
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
}