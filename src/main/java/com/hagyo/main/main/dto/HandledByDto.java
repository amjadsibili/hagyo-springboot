package com.hagyo.main.main.dto;

import lombok.Data;

@Data
public class HandledByDto {

    private String handledBy;

    public HandledByDto(String handledBy) {
        this.handledBy = handledBy;
    }
}
