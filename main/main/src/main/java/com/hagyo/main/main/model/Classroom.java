package com.hagyo.main.main.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "classroom")
public class Classroom {
    @Id
    private int id;
    private String classLevel; //like 9th or 10th
    private String classDivision;
    private int classTeacher;
    private int school;
    private int classTimetable;

}
