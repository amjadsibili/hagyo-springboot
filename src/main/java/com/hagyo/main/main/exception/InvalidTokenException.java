package com.hagyo.main.main.exception;

import lombok.Data;

@Data
public class InvalidTokenException {
    private String msg;

    public InvalidTokenException(String msg) {
        this.msg = msg;
    }
}
