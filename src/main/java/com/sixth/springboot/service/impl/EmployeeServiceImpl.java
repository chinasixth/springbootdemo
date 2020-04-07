package com.sixth.springboot.service.impl;

import com.sixth.springboot.mapper.EmployeeMapper;
import com.sixth.springboot.pojo.Employee;
import com.sixth.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author ：liuhao
 * @Company: qinglian cloud
 * @Date ：Created in 2020/4/7 11:26
 * @(value = "employeeService")
 */
@Service(value = "EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public Employee selectByIdWithWorkCard(int empId) {
        return employeeMapper.selectByIdWithWorkCard(empId);
    }

    @Override
    public Employee selectById(int empId) {
        return employeeMapper.selectById(empId);
    }

    @Override
    public List<Employee> listAll() {
        System.out.println(this.getClass().getName());
        return employeeMapper.listAll();
    }
}
