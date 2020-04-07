package com.sixth.springboot.mapper;

import com.sixth.springboot.pojo.WorkCard;
import org.springframework.stereotype.Repository;

/**
 * @author liuhao
 */
@Repository
public interface WorkCardMapper {
    WorkCard selectByEmpId(int empId);
}