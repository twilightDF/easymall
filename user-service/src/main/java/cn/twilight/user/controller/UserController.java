package cn.twilight.user.controller;

import cn.twilight.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/manage")

public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public int userLogin(String userName, String password){
        //TODO 找到了该用户后跳转主页面并返回cookie
        return userService.doLogin(userName,password);
    }
}
