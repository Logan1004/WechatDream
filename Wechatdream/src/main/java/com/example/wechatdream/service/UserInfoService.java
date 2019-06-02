package com.example.wechatdream.service;

import com.example.wechatdream.dao.UserInfoMapper;
import com.example.wechatdream.domain.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    public UserInfo findUserByWechatID(String id) {
        UserInfo targetUser = userInfoMapper.selectUserByWechatID(id);
        return targetUser;
    }

    public String updateUserInfo(UserInfo userInfo){
        userInfoMapper.updateByPrimaryKey(userInfo);
        return "Update Successfully";
    }

    public UserInfo findUserByID(int id){
        UserInfo targetUser = userInfoMapper.selectUserByID(id);
        return targetUser;
    }
}
