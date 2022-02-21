package cn.twilight.user.service;

import cn.twilight.user.dao.UserDao;
import cn.twilight.user.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.handler.UserRoleAuthorizationInterceptor;

@Service
public class UserService {

    @Autowired(required = true)
    private UserDao userDao;

    public UserEntity doLogin(String name, String pwd){
        return userDao.findByNameAndPassword(name, pwd);
    }

    public boolean doCheck(String name){
        return userDao.existsByName(name);
    }

    public UserEntity doRegister(UserEntity user){
        return userDao.save(user);
    }

}
