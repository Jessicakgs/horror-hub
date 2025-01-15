package com.horrorhub.horror_movies.controller;

import com.horrorhub.horror_movies.model.UserHub;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserHubController {

    @PostMapping("/user/created")
    public String createUser(@RequestBody UserHub newUser) {
        return "User created";
    }

    @PostMapping("/login")
    public String login(@RequestBody UserHub newUser) {
        return "User logged in";
    }
}
