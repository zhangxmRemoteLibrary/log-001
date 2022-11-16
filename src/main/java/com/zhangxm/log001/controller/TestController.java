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
        //System.out.println();
        //日志的级别；
        //由低到高
        //可以调整输出的日志级别；日志就只会在这个级别以后的高级别生效
        logger.trace("这是trace日志...");
        logger.debug("这是debug日志...");

        //springboot 日志级别默认是info级别的
        logger.info("这是info日志...");
        logger.warn("这是warn日志...");
        logger.error("这是error日志...");
//        for (int i = 0; i < 99999999; i++) {
//            logger.warn("循环" + i+"哈哈哈哈啊哈哈哈哈");
//        }
        return "0k";
    }
}
