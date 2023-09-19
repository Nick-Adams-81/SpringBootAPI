package com.example.newspringbootapi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("/hello/{name}")
    @ResponseBody
    public  String hello(@PathVariable String name) {
        return "Hello " + name;
    }
}
