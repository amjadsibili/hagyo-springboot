package com.hagyo.main.main.dto;

import lombok.Data;

@Data
public class HandledByDto {

    private int handledBy;

    public HandledByDto(int handledBy) {
        this.handledBy = handledBy;
    }
}
