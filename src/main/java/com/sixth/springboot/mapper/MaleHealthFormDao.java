package com.sixth.springboot.mapper;

import com.sixth.springboot.pojo.MaleHealthForm;
import org.springframework.stereotype.Repository;

/**
 * @author liuhao
 */
@Repository
public interface MaleHealthFormDao {

    /**
     * 根据 员工id 查询体检记录
     *
     * @param empId 员工id
     * @return
     */
    MaleHealthForm selectById(int empId);

}