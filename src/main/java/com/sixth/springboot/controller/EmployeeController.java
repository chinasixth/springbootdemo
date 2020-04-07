package com.sixth.springboot.controller;

import com.sixth.springboot.pojo.Employee;
import com.sixth.springboot.pojo.FemaleHealthForm;
import com.sixth.springboot.pojo.MaleHealthForm;
import com.sixth.springboot.pojo.WorkCard;
import com.sixth.springboot.service.EmployeeService;
import com.sixth.springboot.service.FemaleHealthFormService;
import com.sixth.springboot.service.MaleHealthFormService;
import com.sixth.springboot.service.WorkCardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author ：liuhao
 * @Company: qinglian cloud
 * @Date ：Created in 2020/4/7 9:55
 * @
 */
@RestController
@RequestMapping("/emp")
public class EmployeeController {
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private MaleHealthFormService maleHealthFormService;

    @Autowired
    private FemaleHealthFormService femaleHealthFormService;

    /**
     * 当一个接口有多个实现类时，用 @Qualifier 指定要用哪个实现类
     * value默认值为： 类名首字母小写
     */
    @Autowired
    @Qualifier(value = "EmployeeServiceV2")
    private EmployeeService employeeService;

    @Autowired
    private WorkCardService workCardService;

    private MaleHealthForm maleHealthForm = null;

    private FemaleHealthForm femaleHealthForm = null;

    private Employee employee = null;

    private WorkCard workCard = null;

    /**
     * 处理男性体检表的请求
     *
     * @param empId 员工ID
     * @return 男性员工实体
     */
    @RequestMapping("/maleHealthForm")
    public MaleHealthForm selectMaleHealthForm(@RequestBody int empId) {
        maleHealthForm = maleHealthFormService.selectByEmpId(empId);
        LOGGER.info(maleHealthForm == null ? "null" : maleHealthForm.toString());
        return maleHealthForm;
    }

    /**
     * 处理女性体检表的请求
     *
     * @param empId 员工ID
     * @return 女性员工实体
     */
    @RequestMapping("/femaleHealthForm")
    public FemaleHealthForm selectFemaleHealthForm(@RequestBody int empId) {
        femaleHealthForm = femaleHealthFormService.selectByEmpId(empId);
        LOGGER.info(femaleHealthForm == null ? "null" : femaleHealthForm.toString());
        return femaleHealthForm;
    }

    /**
     * 处理雇员基本信息表的请求
     *
     * @param id 雇员ID
     * @return 雇员实体
     */
    @RequestMapping("/employee")
    public Employee selectEmployee(@RequestBody int id) {
        employee = employeeService.selectById(id);
        LOGGER.info(employee.toString());
        return employee;
    }

    /**
     * 处理雇员基本信息表的请求
     *
     * @param id 雇员ID
     * @return 雇员实体
     */
    @RequestMapping("/employeeWithWorkCard")
    public Employee selectEmployeeWithWorkCard(@RequestBody int id) {
        employee = employeeService.selectByIdWithWorkCard(id);
        LOGGER.info(employee.toString());
        return employee;
    }

    /**
     * 处理工牌表的请求
     *
     * @param empId 雇员ID
     * @return 工牌实体
     */
    @RequestMapping("/workCard")
    public WorkCard selectByEmpId(@RequestBody int empId) {
        workCard = workCardService.selectByEmpId(empId);
        return workCard;
    }

    @RequestMapping("/all")
    public List<Employee> listEmployees() {
        return employeeService.listAll();
    }

}
