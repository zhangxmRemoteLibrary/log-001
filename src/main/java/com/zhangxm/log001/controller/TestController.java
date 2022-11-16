package com.zhangxm.log001.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    //记录器
    Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/test")
    @ResponseBody
    public String test(){
        for (int i = 0; i < 10; i++) {
            System.out.println("计数中 " + i);
        }
        System.out.println("版本 3");
        System.out.println("版本 4");
        System.out.println("master");
        return "0k";
    }
}
