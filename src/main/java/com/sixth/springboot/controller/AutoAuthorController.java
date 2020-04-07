package com.sixth.springboot.controller;

import com.sixth.springboot.pojo.AutoAuthor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ：liuhao
 * @Company: qinglian cloud
 * @Date ：Created in 2020/4/3 15:26
 * @
 */
@RestController
public class AutoAuthorController {
    @Autowired
    AutoAuthor author;

    @RequestMapping("/info")
    public String authorInfo() {
        return "name: " + author.getName() + "  stage: " + author.getStage();
    }
}