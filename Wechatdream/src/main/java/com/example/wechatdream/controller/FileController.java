package com.example.wechatdream.controller;

import com.example.wechatdream.domain.Class;
import com.example.wechatdream.domain.File;
import com.example.wechatdream.domain.User;
import com.example.wechatdream.domain.UserInfo;
import com.example.wechatdream.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@Component
@RestController
public class FileController {
    @Autowired
    private RequestService requestService;

    @Autowired
    private ClassService classService;

    @Autowired
    private ArticleService articleService;
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private UserService userService;

    @Autowired
    private FileService fileService;

    @RequestMapping("/getFileToConfirm")
    @ResponseBody
    public ArrayList<HashMap> getFilesToConfirmByWechatID(@RequestParam("wechat_id") String id){
        ArrayList<HashMap> arrayList = new ArrayList<>();
        int userID = userInfoService.findUserByWechatID(id).getUserId();
        ArrayList<Class> classes = classService.getClassList();
        ArrayList<Class> classArrayList = new ArrayList<>();
        for (int i=0;i<classes.size();i++){
            if (classes.get(i).getLeaderId()==userID){
                classArrayList.add(classes.get(i));
            }
        }
        System.out.println(classArrayList.size());
        if (classArrayList.size()==0) return null;
        for (int i=0;i<classArrayList.size();i++){
            ArrayList<File> files = fileService.getFileToConfirm(classArrayList.get(i).getId());
            System.out.println(files.size());
            for (int j=0;j<files.size();j++){
                HashMap temp =  new HashMap();
                UserInfo userInfo = userInfoService.findUserByID(files.get(j).getUserId());
                User user = userService.findUserByID(files.get(j).getUserId().toString());
                temp.put("user",user);
                temp.put("userInfo",userInfo);
                temp.put("fileInfo",files.get(j));
                arrayList.add(temp);
            }
        }
        return arrayList;

    }

}
