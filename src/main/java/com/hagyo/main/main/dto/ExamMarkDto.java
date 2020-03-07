package com.hagyo.main.main.dto;

public class ExamMarkDto {

    private String id;
    private String exam;
    private String marksReceived;

    public ExamMarkDto(String id, String exam, String marksReceived) {
        this.id = id;
        this.exam = exam;
        this.marksReceived = marksReceived;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }

    public String getMarksReceived() {
        return marksReceived;
    }

    public void setMarksReceived(String marksReceived) {
        this.marksReceived = marksReceived;
    }
}
