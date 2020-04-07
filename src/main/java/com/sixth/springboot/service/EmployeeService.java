package com.sixth.springboot.service;

import com.sixth.springboot.pojo.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author ：liuhao
 * @Company: qinglian cloud
 * @Date ：Created in 2020/4/7 9:59
 * @
 */
@Service
public interface EmployeeService {
    Employee selectById(int empId);

    Employee selectByIdWithWorkCard(int empId);

    List<Employee> listAll();
}
