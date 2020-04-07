package com.sixth.springboot.service.impl;

import com.sixth.springboot.mapper.MaleHealthFormDao;
import com.sixth.springboot.pojo.MaleHealthForm;
import com.sixth.springboot.service.MaleHealthFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author ：liuhao
 * @Company: qinglian cloud
 * @Date ：Created in 2020/4/7 10:19
 * @
 */
@Service(value = "maleHealthFormService")
public class MaleHealthFormServiceImpl implements MaleHealthFormService {

    @Autowired
    private MaleHealthFormDao maleHealthFormDao;

    @Override
    public MaleHealthForm selectByEmpId(int empId) {
        return maleHealthFormDao.selectById(empId);
    }
}
