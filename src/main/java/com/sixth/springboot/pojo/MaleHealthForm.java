package com.sixth.springboot.pojo;

/**
 * @Author ：liuhao
 * @Company: qinglian cloud
 * @Date ：Created in 2020/4/4 21:21
 * @ 男性体检表
 */
public class MaleHealthForm extends HealthForm {
    private String prostate;

    public String getProstate() {
        return prostate;
    }

    public void setProstate(String prostate) {
        this.prostate = prostate;
    }

    @Override
    public String toString() {
        return "MaleHealthForm{" +
                "prostate='" + prostate + '\'' +
                "} " + super.toString();
    }
}
