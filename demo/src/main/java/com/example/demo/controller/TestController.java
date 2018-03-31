package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/test")
public class TestController {


    @Autowired
    UserDao userDao;

    @GetMapping("/select")
    public User select(@RequestParam("id") Integer id) {

        System.out.println(new User());
        System.out.println("================================");
        return userDao.selectById(id);
    }



}
