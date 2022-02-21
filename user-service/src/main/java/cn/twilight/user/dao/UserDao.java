package cn.twilight.user.dao;

import cn.twilight.user.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<UserEntity, String> {

    UserEntity findByNameAndPassword(String userName, String pwd);

    Boolean existsByName(String userName);

    UserEntity save(UserEntity user);
}
