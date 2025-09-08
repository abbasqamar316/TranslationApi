package com.abbas.translationapi.controller;

import com.abbas.translationapi.model.Users;
import com.abbas.translationapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public String login(@RequestBody Users user)
    {
        return userService.verify(user);

    }
}