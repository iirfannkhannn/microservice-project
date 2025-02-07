package com.example.demo_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CheckController {

    @GetMapping("/check")
    public String getMethod()
    {
        return new String("This is get method!!");
    }

    @PostMapping("/add-Data")
    public String postMethodName(@RequestParam String name) {
        //TODO: process POST request
        
        return name;
    }
    
}
