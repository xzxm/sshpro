package com.ds.controller;

import com.alibaba.fastjson.JSON;
import com.ds.domain.User;
import com.ds.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    @ResponseBody
    public String findAll(){
        List<User> list=userService.findList();
        return JSON.toJSONString(list);
    }
    @RequestMapping("/saveUser")
    @ResponseBody
    public String saveUser(User user){
        userService.saveUser(user);
        return findAll();
    }
    @RequestMapping("/findUser")
    @ResponseBody
    public String findUser(User user){

        return JSON.toJSONString(userService.findUser(user));
    }
    @RequestMapping("/updateUser")
    @ResponseBody
    public String updateUser(User user){
            userService.updateUser(user);
            return findAll();
    }
    @RequestMapping("/deleteUser")
    @ResponseBody
    public String deleteUser(User user){
            userService.deleteUser(user);
            return findAll();
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
