package com.example.wechatdream.service;

import com.example.wechatdream.dao.UserInfoMapper;
import com.example.wechatdream.domain.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;
    public UserInfo findUserByWechatID(String id) {
        UserInfo targetUser = userInfoMapper.selectUserByWechatID(id);
        return targetUser;
    }
}
