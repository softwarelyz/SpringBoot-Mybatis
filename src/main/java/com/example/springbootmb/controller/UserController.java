package com.example.springbootmb.controller;

import com.example.springbootmb.dao.UserDao;
import com.example.springbootmb.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({"/home"})
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/user")
    @ResponseBody
    public String user() {
        User user = userDao.findUserByName("lazy");
        return user.getName() + "--***---" + user.getAge();
    }
}
