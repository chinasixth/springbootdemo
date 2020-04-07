package com.sixth.springboot.service;

import com.sixth.springboot.pojo.FemaleHealthForm;
import org.springframework.stereotype.Service;

/**
 * @Author ：liuhao
 * @Company: qinglian cloud
 * @Date ：Created in 2020/4/7 14:21
 * @
 */
@Service
public interface FemaleHealthFormService {
    FemaleHealthForm selectByEmpId(int empId);
}
