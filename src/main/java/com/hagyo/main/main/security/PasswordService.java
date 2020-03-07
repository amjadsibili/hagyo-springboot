package com.hagyo.main.main.security;

import org.springframework.stereotype.Component;

@Component
public class PasswordService {

    public static String generatePasswordHash(String password) {
        String hash = TokenService.generateToken(password, "MD5");
        return hash;
    }

}
