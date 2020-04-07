package com.sixth.springboot.service.impl;

import com.sixth.springboot.mapper.UserMapper;
import com.sixth.springboot.pojo.User;
import com.sixth.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author ：liuhao
 * @Company: qinglian cloud
 * @Date ：Created in 2020/4/3 17:25
 * @
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public User selectById(int userId) {
        return userMapper.selectById(userId);
    }

    @Override
    public List<User> listUsers() {
        return userMapper.listAll();
    }
}
