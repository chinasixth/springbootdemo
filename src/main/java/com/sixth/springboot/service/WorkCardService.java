package com.sixth.springboot.service;

import com.sixth.springboot.pojo.WorkCard;
import org.springframework.stereotype.Service;

/**
 * @Author ：liuhao
 * @Company: qinglian cloud
 * @Date ：Created in 2020/4/7 15:02
 * @
 */
@Service
public interface WorkCardService {

    /**
     * 通过雇员ID查询工牌信息
     *
     * @param empId 雇员ID
     * @return 工牌信息
     */
    WorkCard selectByEmpId(int empId);

}
