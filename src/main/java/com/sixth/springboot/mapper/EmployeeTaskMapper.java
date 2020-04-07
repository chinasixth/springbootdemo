package com.sixth.springboot.mapper;

import com.sixth.springboot.pojo.EmployeeTask;
import org.springframework.stereotype.Repository;

/**
 * @author liuhao
 */
@Repository
public interface EmployeeTaskMapper {
    EmployeeTask selectByEmpId(int empId);
}