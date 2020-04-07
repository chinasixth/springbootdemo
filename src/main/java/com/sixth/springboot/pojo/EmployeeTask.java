package com.sixth.springboot.pojo;

import com.sixth.springboot.pojo.Task;

/**
 * @Author ：liuhao
 * @Company: qinglian cloud
 * @Date ：Created in 2020/4/4 22:01
 * @ 员工任务表
 */
public class EmployeeTask {
    private int id;
    private int empId;
    /**
     * 员工任务表和任务表是一对一的级联关系
     */
    private Task task = null;
    private String taskName;
    private String note;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
