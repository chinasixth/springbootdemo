package com.sixth.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author ：liuhao
 * @ Company: qinglian cloud
 * @ Date   ：Created in 2020/4/3 14:59
 * @ desc : 测试控制器
 */
@RestController
public class HelloController {

    @Value("${name1}")
    private String name1;

    @Value("${stage1}")
    private String stage1;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring Boot\n" +
                "name: " + name1 + "  stage: " + stage1;
    }
}