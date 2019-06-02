package com.example.wechatdream.service;

import com.example.wechatdream.dao.ClassMapper;
import com.example.wechatdream.dao.FileMapper;
import com.example.wechatdream.dao.UserInfoMapper;
import com.example.wechatdream.domain.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Component
@Service
public class FileService {
    @Autowired
    private FileMapper fileMapper;
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private ClassMapper classMapper;

    public ArrayList<File> getFileToConfirm(Integer classId){
        ArrayList<File> files =  fileMapper.getFileToConfirm(classId);
        for (File file : files){
            file.setUserName(userInfoMapper.selectNameByID(file.getUserId()));
            file.setClassName(classMapper.selectClassNameByClassId(classId));
        }
        return files;
    }


}
