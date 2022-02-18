package cn.twilight.user.service;

import cn.twilight.user.dao.UserDao;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserDao userDao;

    @Autowired(required = true)
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public int doLogin(String userName, String pwd){
        return userDao.selectUserByUserNameAndPwd(userName, pwd);
    }

}
