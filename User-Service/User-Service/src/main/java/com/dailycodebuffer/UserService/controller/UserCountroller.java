package com.dailycodebuffer.UserService.controller;

import com.dailycodebuffer.UserService.entity.User;
import com.dailycodebuffer.UserService.service.UserService;
import com.dailycodebuffer.UserService.vo.Department;
import com.dailycodebuffer.UserService.vo.ResponseTemplateVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserCountroller {
    @Autowired
    private UserService userService;
    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }
    @GetMapping("/{id}")
    public ResponseTemplateVo findUserWithDepartment(@PathVariable("id") Long userId){
        return userService.findUserWithDepartment(userId);
    }
}
