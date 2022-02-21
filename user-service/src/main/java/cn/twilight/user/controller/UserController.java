package cn.twilight.user.controller;

import cn.twilight.user.entity.UserEntity;
import cn.twilight.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.handler.UserRoleAuthorizationInterceptor;

import java.util.Optional;

@RestController
@RequestMapping("/user/manage")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public UserEntity userLogin(@RequestParam String name,@RequestParam String password){
        //TODO 找到了该用户后跳转主页面并返回cookie
        UserEntity userEntity = userService.doLogin(name, password);
        UserEntity user = Optional.ofNullable(userEntity).orElse(new UserEntity());
        return user;
    }

    @GetMapping("/check")
    public Boolean check(@RequestParam String name){
        return userService.doCheck(name);
    }

    @PostMapping("/register")
    public UserEntity register(@RequestBody UserEntity user){
        return userService.doRegister(user);
    }
}
