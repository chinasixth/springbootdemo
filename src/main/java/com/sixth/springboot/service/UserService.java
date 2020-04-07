package com.sixth.springboot.service;

import com.sixth.springboot.pojo.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author ：liuhao
 * @Company: qinglian cloud
 * @Date ：Created in 2020/4/3 17:15
 * @
 */
@Component
public interface UserService {
    int addUser(User user);

    User selectById(int userId);

    List<User> listUsers();

}
