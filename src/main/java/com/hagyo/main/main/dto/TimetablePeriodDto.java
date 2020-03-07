package com.hagyo.main.main.dto;

import com.hagyo.main.main.model.Subject;

public class TimetablePeriodDto {

    private Integer id;
    private Subject period1;
    private Subject period2;
    private Subject period3;
    private Subject period4;
    private Subject period5;
    private Subject period6;
    private Subject period7;
    private Subject period8;

    public TimetablePeriodDto(Integer id, Subject period1, Subject period2, Subject period3, Subject period4, Subject period5, Subject period6, Subject period7, Subject period8) {
        this.id = id;
        this.period1 = period1;
        this.period2 = period2;
        this.period3 = period3;
        this.period4 = period4;
        this.period5 = period5;
        this.period6 = period6;
        this.period7 = period7;
        this.period8 = period8;
    }

    public TimetablePeriodDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Subject getPeriod1() {
        return period1;
    }

    public void setPeriod1(Subject period1) {
        this.period1 = period1;
    }

    public Subject getPeriod2() {
        return period2;
    }

    public void setPeriod2(Subject period2) {
        this.period2 = period2;
    }

    public Subject getPeriod3() {
        return period3;
    }

    public void setPeriod3(Subject period3) {
        this.period3 = period3;
    }

    public Subject getPeriod4() {
        return period4;
    }

    public void setPeriod4(Subject period4) {
        this.period4 = period4;
    }

    public Subject getPeriod5() {
        return period5;
    }

    public void setPeriod5(Subject period5) {
        this.period5 = period5;
    }

    public Subject getPeriod6() {
        return period6;
    }

    public void setPeriod6(Subject period6) {
        this.period6 = period6;
    }

    public Subject getPeriod7() {
        return period7;
    }

    public void setPeriod7(Subject period7) {
        this.period7 = period7;
    }

    public Subject getPeriod8() {
        return period8;
    }

    public void setPeriod8(Subject period8) {
        this.period8 = period8;
    }
}
