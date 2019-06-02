package com.example.wechatdream.controller;

import com.example.wechatdream.domain.Class;
import com.example.wechatdream.domain.User;
import com.example.wechatdream.domain.UserInfo;
import com.example.wechatdream.service.ClassService;
import com.example.wechatdream.service.UserInfoService;
import com.example.wechatdream.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;

@Component
@RestController
public class UserController {
    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private UserService userService;

    @Autowired
    private ClassService classService;

    @RequestMapping(value = "/loginPage", method = RequestMethod.POST)
    @ResponseBody
    public HashMap wechatLogin(@RequestParam("wechat_id") String id){
        UserInfo userInfo = userInfoService.findUserByWechatID(id);
        User user = userService.findUserByID(userInfo.getUserId().toString());
        HashMap hashMap = new HashMap();
        hashMap.put("user",user);
        hashMap.put("userInfo",userInfo);
        return hashMap;
    }

    @RequestMapping(value = "/updateUserInfo", method = RequestMethod.POST)
    @ResponseBody
    public String userUpdate(@RequestParam("name") String name,@RequestParam("gender") String gender,
                             @RequestParam("age") int age,@RequestParam("wechat_id") String id,
                             @RequestParam("description") String description){
        UserInfo userInfo = userInfoService.findUserByWechatID(id);
        System.out.println(userInfo.getUserId());
        userInfo.setAge(age);
        userInfo.setName(name);
        userInfo.setGender(gender);
        userInfo.setDescription(description);
        System.out.println(userInfo.getName());
        return userInfoService.updateUserInfo(userInfo);
    }

    @RequestMapping(value = "/getUserClasses", method = RequestMethod.POST)
    @ResponseBody
    public ArrayList<Class> getUserClassesByWechatID(@RequestParam("wechat_id") String id){
        ArrayList<Class> classes = classService.getClassListByWechatID(id);
        return classes;
    }


}
