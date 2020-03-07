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

    public int getId() {
        return id;
    }

    public int getPeriod1() {
        return period1;
    }

    public int getPeriod2() {
        return period2;
    }

    public int getPeriod3() {
        return period3;
    }

    public int getPeriod4() {
        return period4;
    }

    public int getPeriod5() {
        return period5;
    }

    public int getPeriod6() {
        return period6;
    }

    public int getPeriod7() {
        return period7;
    }

    public int getPeriod8() {
        return period8;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPeriod1(int period1) {
        this.period1 = period1;
    }

    public void setPeriod2(int period2) {
        this.period2 = period2;
    }

    public void setPeriod3(int period3) {
        this.period3 = period3;
    }

    public void setPeriod4(int period4) {
        this.period4 = period4;
    }

    public void setPeriod5(int period5) {
        this.period5 = period5;
    }

    public void setPeriod6(int period6) {
        this.period6 = period6;
    }

    public void setPeriod7(int period7) {
        this.period7 = period7;
    }

    public void setPeriod8(int period8) {
        this.period8 = period8;
    }
}
