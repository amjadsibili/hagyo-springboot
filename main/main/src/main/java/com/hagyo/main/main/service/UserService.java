package com.hagyo.main.main.service;

import com.hagyo.main.main.dto.TokenDto;
import com.hagyo.main.main.dto.UserDto;
import com.hagyo.main.main.model.User;
import com.hagyo.main.main.repository.UserRepository;
import com.hagyo.main.main.security.PasswordService;
import com.hagyo.main.main.security.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }
    public TokenDto authenticateUser(UserDto user) {
            TokenDto tokenDto;
            String tokenString;
            User existingUser = userRepository.findByUsernameAndPassword(user.getUsername(), PasswordService.generatePasswordHash(user.getPassword()));
            System.out.println(existingUser);
            if (existingUser == null) {
                tokenDto = new TokenDto("invalid Token");
            } else {
                tokenString = TokenService.generateToken( user.getUsername() + "AKSDJHJJ2435", "MD5");
                System.out.println(user);
                existingUser.setToken(tokenString);
                userRepository.save(existingUser);
                tokenDto = new TokenDto(tokenString);
            }
            return tokenDto;
    }
}
