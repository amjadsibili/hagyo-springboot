package com.hagyo.main.main.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "leave")
public class Leave {
    @Id
    private int id;
    private int student;
    private Date date;
    private boolean isMorning;
    private String reason;
    private String leaveStatus;
}
