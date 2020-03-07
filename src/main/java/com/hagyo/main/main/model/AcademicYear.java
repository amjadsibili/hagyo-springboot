package com.hagyo.main.main.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "academic_year")
public class AcademicYear {
    @Id
    private int id;
    private Date startingDate;
    private Date endingDate;
}
