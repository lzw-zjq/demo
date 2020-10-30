package com.example.demo.user.controller;

import com.example.demo.user.entity.UserEntity;
import com.example.demo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<UserEntity> getAll(Map map){

        return userService.getAll(map);
    }

    @RequestMapping("/delById")
    public String delById(Integer id){
        userService.delById(id);
        return "redirect:http://localhost:8080/index.html";
    }

    @RequestMapping("/save")
    @ResponseBody
    public String sava(@RequestBody UserEntity userEntity){

        System.out.println("用户注册 - " + userEntity.toString());
        userService.save(userEntity);
        return  "success";
    }

}
