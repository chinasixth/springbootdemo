package com.sixth.springboot.pojo;

import com.sixth.springboot.enumeration.SexEnum;

import java.util.Date;
import java.util.List;

/**
 * @Author ：liuhao
 * @Company: qinglian cloud
 * @Date ：Created in 2020/4/4 22:12
 * @雇员父类
 */
public class Employee {
    private int id;
    private String name;
    private SexEnum sex = null;
    private Date birthday;
    private String mobile;
    private String email;
    private String position;
    private String note;
    /**
     * 工牌按照一对一级联
     */
    private WorkCard workCard;
    /**
     * 雇员任务，一对多级联
     */
    private List<EmployeeTask> employeeTaskList = null;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public WorkCard getWorkCard() {
        return workCard;
    }

    public void setWorkCard(WorkCard workCard) {
        this.workCard = workCard;
    }

    public List<EmployeeTask> getEmployeeTaskList() {
        return employeeTaskList;
    }

    public void setEmployeeTaskList(List<EmployeeTask> employeeTaskList) {
        this.employeeTaskList = employeeTaskList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", position='" + position + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
