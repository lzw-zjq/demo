package com.example.demo.user.service;

import com.example.demo.user.entity.UserEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<UserEntity> getAll(Map map);

    void delById(Integer id);

    void save(UserEntity userEntity);
}
