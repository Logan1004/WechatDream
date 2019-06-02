package com.example.wechatdream.controller;

import com.example.wechatdream.domain.User;
import com.example.wechatdream.domain.UserInfo;
import com.example.wechatdream.service.UserInfoService;
import com.example.wechatdream.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@Component
@RestController
public class UserController {
    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/loginPage")
    public HashMap wechatLogin(@RequestParam("wechat_id") String id){
        UserInfo userInfo = userInfoService.findUserByWechatID(id);
        User user = userService.findUserByID(userInfo.getUserId().toString());
        HashMap hashMap = new HashMap();
        hashMap.put("user",user);
        hashMap.put("userInfo",userInfo);
        return hashMap;
    }


}
