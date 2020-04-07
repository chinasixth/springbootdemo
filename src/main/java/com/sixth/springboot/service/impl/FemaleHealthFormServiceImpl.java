package com.sixth.springboot.service.impl;

import com.sixth.springboot.mapper.FemaleHealthFormDao;
import com.sixth.springboot.pojo.FemaleHealthForm;
import com.sixth.springboot.service.FemaleHealthFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author ：liuhao
 * @Company: qinglian cloud
 * @Date ：Created in 2020/4/7 14:25
 * @
 */
@Service(value = "femaleHealthFormService")
public class FemaleHealthFormServiceImpl implements FemaleHealthFormService {
    @Autowired
    private FemaleHealthFormDao femaleHealthFormDao;

    @Override
    public FemaleHealthForm selectByEmpId(int empId) {
        return femaleHealthFormDao.selectById(empId);
    }
}
