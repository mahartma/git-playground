package com.example.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/demo")
public class DemoController {

    @GetMapping
    public String sayHello() {
        return "Hello";
    }
}
