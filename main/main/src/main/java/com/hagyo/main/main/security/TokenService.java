package com.hagyo.main.main.security;

import com.hagyo.main.main.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Component
public class TokenService {

    @Autowired
    private static UserRepository userRepository;

    public static String generateToken(String message, String algorithm) {

        try {
            MessageDigest digest = MessageDigest.getInstance(algorithm);
            byte[] hashedBytes = digest.digest(message.getBytes(StandardCharsets.UTF_8));

            return convertByteArrayToHexString(hashedBytes);
        } catch (NoSuchAlgorithmException ex) {
            System.out.println("token generation error");
            return "";
        }
    }
        private static String convertByteArrayToHexString ( byte[] arrayBytes){
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < arrayBytes.length; i++) {
                stringBuffer.append(Integer.toString((arrayBytes[i] & 0xff) + 0x100, 16)
                        .substring(1));
            }
            return stringBuffer.toString();
        }
//        public static boolean isValidToken(String token) {
////            boolean isValid = false;
////            if (userRepository.findByToken(token) != null) isValid = true;
////            return  isValid;
////        }
    }