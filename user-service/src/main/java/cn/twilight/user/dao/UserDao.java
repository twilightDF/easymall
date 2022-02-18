package cn.twilight.user.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    @Select("select * from user where name=${userName} and password=${pwd}}")
    int selectUserByUserNameAndPwd(String userName,String pwd);
}
