package com.sixth.springboot.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author liuhao
 * @Author ：liuhao
 * @Company: qinglian cloud
 * @Date ：Created in 2020/4/3 15:18
 * @@Component：表明当前类是一个 Java Bean
 * @ConfigurationProperties(prefix = “author”)：表示获取前缀为 author 的配置信息
 */
@Component
@ConfigurationProperties(prefix = "author")
public class AutoAuthor {
    private String name;

    private String stage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String age) {
        this.stage = age;
    }


}
