package com.example.demo.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerTest {

    // exposing "/" to return Hello World

    @GetMapping("/")
    public String hello(){
        return "Hello World";
    }

}
