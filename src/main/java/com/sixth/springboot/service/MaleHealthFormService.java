package com.sixth.springboot.service;

import com.sixth.springboot.pojo.MaleHealthForm;
import org.springframework.stereotype.Service;

/**
 * @Author ：liuhao
 * @Company: qinglian cloud
 * @Date ：Created in 2020/4/7 10:17
 * @
 */
@Service
public interface MaleHealthFormService {
    MaleHealthForm selectByEmpId(int empId);
}
