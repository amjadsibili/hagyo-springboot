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
    private int teacher;
    private int classroom;
    private int school;

}
