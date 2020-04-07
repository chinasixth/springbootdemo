package com.sixth.springboot.mapper;

import com.sixth.springboot.pojo.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author liuhao
 */
@Repository
public interface EmployeeMapper {
    Employee selectById(int id);

    Employee selectByIdWithWorkCard(int empId);

    List<Employee> listAll();
}