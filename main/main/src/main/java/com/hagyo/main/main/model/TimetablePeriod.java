package com.hagyo.main.main.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "time_table_periods")
public class TimetablePeriod {
    @Id
    private int id;
    private int period1;
    private int period2;
    private int period3;
    private int period4;
    private int period5;
    private int period6;
    private int period7;
    private int period8;
}
