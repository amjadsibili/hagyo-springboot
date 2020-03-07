package com.hagyo.main.main.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "exam_mark")
public class Mark {
    @Id
    private String id;
    private int student;
    private String exam;
    private String markReceived;

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    public String getMarkReceived() {
        return markReceived;
    }

    public void setMarkReceived(String markReceived) {
        this.markReceived = markReceived;
    }
}
