package com.hagyo.main.main.controller;

import com.hagyo.main.main.dto.TokenDto;
import com.hagyo.main.main.dto.UserDto;
import com.hagyo.main.main.model.User;
import com.hagyo.main.main.security.PasswordService;
import com.hagyo.main.main.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public User saveUser(@RequestBody UserDto user) {
        User newUser = new User();
        newUser.setUsername(user.getUsername());
        newUser.setPassword(PasswordService.generatePasswordHash(user.getPassword()));
        return userService.saveUser(newUser);
    }

    @PatchMapping("/auth")
    public TokenDto authenticate(@RequestBody UserDto user) {
        return userService.authenticateUser(user);
    }


}
