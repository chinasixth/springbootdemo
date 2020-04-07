package com.sixth.springboot.pojo;

/**
 * @Author ：liuhao
 * @Company: qinglian cloud
 * @Date ：Created in 2020/4/4 21:21
 * @ 女性体检表
 */
public class FemaleHealthForm extends HealthForm {
    private String uterus;

    public String getUterus() {
        return uterus;
    }

    public void setUterus(String uterus) {
        this.uterus = uterus;
    }
}
