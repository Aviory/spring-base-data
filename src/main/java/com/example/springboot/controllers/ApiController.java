package com.example.springboot.controllers;

import com.example.springboot.models.BaseModel;
import com.example.springboot.models.MessageModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
    private int a;
    @PostMapping("/add")
    public BaseModel add() {
        a++;
        return new MessageModel("added");
    }
    @GetMapping("/read")
    public int read() {
        return a;
    }
}
