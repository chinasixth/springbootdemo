package com.sixth.springboot.service.impl;

import com.sixth.springboot.mapper.WorkCardMapper;
import com.sixth.springboot.pojo.WorkCard;
import com.sixth.springboot.service.WorkCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author ：liuhao
 * @Company: qinglian cloud
 * @Date ：Created in 2020/4/7 15:08
 * @
 */
@Service(value = "workCardService")
public class WorkCardServiceImpl implements WorkCardService {

    @Autowired
    private WorkCardMapper workCardMapper;

    @Override
    public WorkCard selectByEmpId(int empId) {
        return workCardMapper.selectByEmpId(empId);
    }
}
