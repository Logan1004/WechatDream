package com.example.wechatdream.service;

import com.example.wechatdream.domain.User;
import com.example.wechatdream.domain.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.example.wechatdream.dao.*;

@Component
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User findUserByID(String id) {
        User targetUser = userMapper.selectUserByID(id);
        return targetUser;
    }


}
