package com.sixth.springboot.mapper;

import com.sixth.springboot.pojo.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author ：liuhao
 * @Company: qinglian cloud
 * @Date ：Created in 2020/4/3 17:33
 * @
 */
@Component
public interface UserMapper {

    int insert(User user);

    User selectById(int userId);


    List<User> listAll();

}
