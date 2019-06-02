package com.example.wechatdream.controller;

import com.example.wechatdream.dao.UserInfoMapper;
import com.example.wechatdream.domain.Class;
import com.example.wechatdream.domain.Request;
import com.example.wechatdream.domain.User;
import com.example.wechatdream.domain.UserInfo;
import com.example.wechatdream.service.ClassService;
import com.example.wechatdream.service.RequestService;
import com.example.wechatdream.service.UserInfoService;
import com.example.wechatdream.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;

@Component
@RestController
public class RequestController {
    @Autowired
    private RequestService requestService;
    @Autowired
    private ClassService classService;
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private UserService userService;


    @RequestMapping(value = "/getRequest", method = RequestMethod.POST)
    @ResponseBody
    public ArrayList<HashMap> getRequestByWechatID(@RequestParam("wechat_id") String id){
        ArrayList<HashMap> arrayList = new ArrayList<>();
        int userID = userInfoService.findUserByWechatID(id).getUserId();
        ArrayList<Class> classes = classService.getClassList();
        ArrayList<Class> classArrayList = new ArrayList<>();
        for (int i=0;i<classes.size();i++){
            if (classes.get(i).getLeaderId()==userID){
                classArrayList.add(classes.get(i));
            }
        }
        if (classArrayList.size()==0) return null;
        for (int i=0;i<classArrayList.size();i++){
            ArrayList<Request> reqs = requestService.getRequestListByClass(classArrayList.get(i).getId());
            if (reqs.size()>0) {
                for (int j = 0; j < reqs.size(); j++) {
                    System.out.println(reqs.get(j).getUserId());
                    HashMap temp =  new HashMap();
                    UserInfo userInfo = userInfoService.findUserByID(reqs.get(j).getUserId());
                    User user = userService.findUserByID(reqs.get(j).getUserId().toString());
                    Class classInfo = classArrayList.get(i);
                    temp.put("user",user);
                    temp.put("userInfo",userInfo);
                    temp.put("classInfo",classInfo);
                    temp.put("req",reqs.get(j));
                    arrayList.add(temp);
                }
            }
        }
        return arrayList;
    }

    @RequestMapping("/createRequest")
    @ResponseBody
    public String createRequest(@RequestParam("wechat_id") String id, @RequestParam("classId") Integer classId) {
        int userId = userInfoService.findUserByWechatID(id).getUserId();
        if (requestService.insertRequest(userId, classId, "Please")) {
            return "success";
        } else {
            return "fail";
        }
    }

}
