package com.example.wechatdream.service;

import com.example.wechatdream.dao.ClassMapper;
import com.example.wechatdream.dao.RequestMapper;
import com.example.wechatdream.dao.UserInfoMapper;
import com.example.wechatdream.domain.Class;
import com.example.wechatdream.domain.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Component
@Service
public class RequestService {
    @Autowired
    private RequestMapper requestMapper;
    @Autowired
    private ClassMapper classMapper;
    @Autowired
    private UserInfoMapper userInfoMapper;

    public ArrayList<Request> getRequestListByClass(Integer classId) {
        ArrayList<Request> result = new ArrayList<>();
        result =  requestMapper.getRequestListByClass(classId);
        for(int i = 0; i < result.size();++i) {
            result.get(i).setUserName(userInfoMapper.selectNameByID(result.get(i).getUserId()));
            result.get(i).setClassName(classMapper.selectClassNameByClassId(result.get(i).getClassId()));
        }
        return result;
    }

    public boolean insertRequest(Integer userId, Integer classId, String description) {
        Date curTime = new Date();
        Request request = new Request(classId, userId, curTime, description);
        try {
            requestMapper.insert(request);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public Request getOneRequest(Integer classId, Integer userId) {
        Request request =  requestMapper.getOneRequest(classId, userId);
        if(request != null) {
            request.setClassName(classMapper.selectClassNameByClassId(request.getClassId()));
            request.setUserName(userInfoMapper.selectNameByID(request.getUserId()));
        }
        return request;
    }
//
//    public boolean addUserToClass(Integer userId, Integer classId) throws Exception {
//        ClassHasUser classHasUser  = new ClassHasUser(userId, classId);
//        try {
//            // insert a user into the class
//            classHasUserMapper.insert(classHasUser);
//            //delete the request from the request list
//            Request request = requestMapper.getOneRequest(classId, userId);
//            if(request != null) {
//                requestMapper.delete(request);
//            } else {
//                throw new Exception("Can't delete the request");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            return false;
//
//        }
//        return true;
//    }
//    public boolean deleteUserFromClass(Integer userId, Integer classId){
//        System.out.println(classId);
//        try{
//            ClassHasUser classHasUser=classHasUserMapper.getOneClassHasUser(userId,classId);
//            if(classHasUser!=null){
//                classHasUserMapper.delete(classHasUser);
//            }
//            else {
//                throw new Exception("Can't quit the class");
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//            return false;
//        }
//        return true;
//    }
//    public ClassHasUser userInClass(Integer userId, Integer classId) {
//        ClassHasUser classHasUser = new ClassHasUser(userId,classId);
//        return classHasUserMapper.selectOne(classHasUser);
//    }



//    public ArrayList<Class> getLeadClassByWechatID(String id){
////        int userID = userInfoMapper.selectUserByWechatID(id).getUserId();
////        return classes;
//    }

}
