package com.hagyo.main.main.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "teacher")
public class Teacher {
    @Id
    private int id;
    private String name;
    private String tId;
    private String initialPassword;
    private String address;
    private String phoneNo;
    private boolean isActivated; //to check whether the account activated
    private boolean isDisabled;  //for blocking account if teacher goes to non-hagyo schools
    private int school;
}
