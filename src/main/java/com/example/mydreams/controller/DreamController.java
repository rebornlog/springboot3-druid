package com.example.mydreams.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DreamController {

    @RequestMapping("hello")
    public  String   get(){
        return "hello";
    }
}
