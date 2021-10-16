package com.krazy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/greeting")
    public String index() {
        return "aaa";
    }
}
