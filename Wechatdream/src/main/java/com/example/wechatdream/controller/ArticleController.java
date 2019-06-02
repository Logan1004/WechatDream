package com.example.wechatdream.controller;

import com.example.wechatdream.domain.Article;
import com.example.wechatdream.domain.Class;
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
public class ArticleController {
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

    @RequestMapping("/getArticlesToConfirm")
    @ResponseBody
    public ArrayList<HashMap> getArticlesToConfirmByWechatID(@RequestParam("wechat_id") String id){
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
            ArrayList<Article> articles=articleService.getArticleToConfirmByClassId(classArrayList.get(i).getId());
            System.out.println(articles.size());
            for (int j=0;j<articles.size();j++){
                HashMap temp =  new HashMap();
                UserInfo userInfo = userInfoService.findUserByID(articles.get(j).getUserId());
                User user = userService.findUserByID(articles.get(j).getUserId().toString());
                temp.put("user",user);
                temp.put("userInfo",userInfo);
                temp.put("articleInfo",articles.get(j));
                arrayList.add(temp);
            }
        }
        return arrayList;
    }

    @RequestMapping("/confirmArticle")
    @ResponseBody
    public String confirmArticle(@RequestParam("aid") int aid){
        articleService.confirmArticle(aid);
        return "success";
    }

    @RequestMapping("/getAllArticle")
    @ResponseBody
    public ArrayList<HashMap> getPublishedArticles(){
        ArrayList<HashMap> arrayList = new ArrayList<>();
        ArrayList<Article> articles=articleService.getPublishedArticle(null, "");
        for (int j=0;j<articles.size();j++){
            HashMap temp =  new HashMap();
            UserInfo userInfo = userInfoService.findUserByID(articles.get(j).getUserId());
            User user = userService.findUserByID(articles.get(j).getUserId().toString());
            temp.put("user",user);
            temp.put("userInfo",userInfo);
            temp.put("articleInfo",articles.get(j));
            arrayList.add(temp);
        }
        return arrayList;
    }



}
