package com.hagyo.main.main.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "exam_mark")
public class Mark {
    @Id
    private int id;
    private int student;
    private int exam;
    private float markReceived;
}
