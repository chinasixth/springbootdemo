package com.sixth.springboot;


import com.sixth.springboot.enumeration.SexEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @Author ：liuhao
 * @Company: qinglian cloud
 * @Date ：Created in 2020/4/6 0:20
 * @
 */
public class Test {
    private static final Logger LOGGER = LoggerFactory.getLogger(Test.class);

    @org.junit.jupiter.api.Test
    public void testEnum() {
        SexEnum sex = SexEnum.getSexById(1);
        LOGGER.info("SexEnum: " + sex);

        SexEnum sex1 = SexEnum.getSexByName("男");
        LOGGER.info("SexEnum: " + sex);
    }
}
