package com.example.wechatdream.service;

import com.example.wechatdream.dao.ClassMapper;
import com.example.wechatdream.dao.UserInfoMapper;
import com.example.wechatdream.domain.Class;
import com.example.wechatdream.domain.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service

public class ClassService {
    @Autowired
    private ClassMapper classMapper;
    @Autowired
    private UserInfoMapper userInfoMapper;

    public ArrayList<Class> getClassListByWechatID(String id) {
        UserInfo userInfo = userInfoMapper.selectUserByWechatID(id);
        ArrayList<Class> result = classMapper.selectClassByUserId(userInfo.getUserId());
        result = getClassLabel(result);
        return result;
    }

    public ArrayList<Class> getClassLabel(ArrayList<Class> classArrayList) {
        for (Class item: classArrayList
        ) {
            item.setLabel(classMapper.getLabel(item.getId()));
        }
        return classArrayList;
    }
}
