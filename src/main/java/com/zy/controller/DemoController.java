package com.zy.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    public String info(){
        return "hello controller";
    }
}
