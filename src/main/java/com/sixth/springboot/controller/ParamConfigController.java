package com.sixth.springboot.controller;

import com.sixth.springboot.pojo.ParamConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ：liuhao
 * @Company: qinglian cloud
 * @Date ：Created in 2020/4/4 13:44
 * @
 */
@RestController
@RequestMapping("/params")
public class ParamConfigController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ParamConfig.class);


    @Autowired
    private ParamConfig paramConfig;

    @RequestMapping("/content")
    public String getContent() {
        LOGGER.info("author: " + paramConfig.getAuthor() + "  title: " + paramConfig.getTitle() + "  time: " + paramConfig.getTime());
        return "author: " + paramConfig.getAuthor() + "  title: " + paramConfig.getTitle() + "  time: " + paramConfig.getTime();
    }

}
