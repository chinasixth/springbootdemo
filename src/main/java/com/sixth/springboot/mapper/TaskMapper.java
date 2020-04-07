package com.sixth.springboot.mapper;

import com.sixth.springboot.pojo.Task;
import org.springframework.stereotype.Repository;

/**
 * @Author ：liuhao
 * @Company: qinglian cloud
 * @Date ：Created in 2020/4/4 22:35
 * @
 */
@Repository
public interface TaskMapper {
    Task selectById(int id);

}
