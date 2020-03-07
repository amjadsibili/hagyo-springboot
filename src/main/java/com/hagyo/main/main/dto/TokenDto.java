package com.hagyo.main.main.dto;

import lombok.Data;

@Data
public class TokenDto {
    public TokenDto(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    private String token;
}
