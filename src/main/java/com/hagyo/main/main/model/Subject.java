package com.hagyo.main.main.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "subject")
public class Subject {
    @Id
    private int id;
    private String name;
    private int handledBy;
    private int classroom;
    private int school;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHandledBy() {
        return handledBy;
    }

    public void setHandledBy(int handledBy) {
        this.handledBy = handledBy;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public int getSchool() {
        return school;
    }

    public void setSchool(int school) {
        this.school = school;
    }
}
