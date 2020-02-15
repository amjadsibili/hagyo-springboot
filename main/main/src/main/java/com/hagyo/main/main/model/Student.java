package com.hagyo.main.main.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "student")
public class Student {
    @Id
    private int id;
    private String name;
    private String admissionNo;
    private String phoneNo;
    private String address;
    private String rollNo;
    private int classroom;
    private int school;
    private String sex;
}
