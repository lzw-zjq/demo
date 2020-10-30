package com.example.demo.user.service;

import com.example.demo.user.entity.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<UserEntity> getAll(Map map);

    void delById(Integer id);

    void save(UserEntity userEntity);

    public UserEntity getUserById(Integer id);

    public void updateUserById(@RequestBody UserEntity userEntity);
}
