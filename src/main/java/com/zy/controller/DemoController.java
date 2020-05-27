package com.zy.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    public String info(){
        return "hello controller";
        //开发人员修改了代码
        //项目经理修改
        //有增加
    }
}
