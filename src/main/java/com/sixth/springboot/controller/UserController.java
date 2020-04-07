package com.sixth.springboot.controller;

import com.sixth.springboot.pojo.User;
import com.sixth.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author ：liuhao
 * @Company: qinglian cloud
 * @Date ：Created in 2020/4/3 17:14
 * @RestController 相当于 @Controller + @ResponseBody 返回 Json格式数据
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/add")
    public int addUser(@RequestBody User user) {
        userService.addUser(user);
        return user.getUserId();
    }

    @RequestMapping("/search")
    public User selectById(@RequestBody User user) {
        User u = userService.selectById(user.getUserId());
        return u;
    }

    @RequestMapping("/all")
    public List<User> listUsers() {
        return userService.listUsers();
    }

}
