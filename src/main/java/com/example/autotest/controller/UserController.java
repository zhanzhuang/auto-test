package com.example.autotest.controller;

import com.example.autotest.po.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {


    @GetMapping
    public Object getUser() {
        return new User("JACK", 18, "男");
    }

}

