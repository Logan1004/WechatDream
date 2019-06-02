package com.example.wechatdream.service;

import com.example.wechatdream.dao.ArticleMapper;
import com.example.wechatdream.dao.UserInfoMapper;
import com.example.wechatdream.domain.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service

public class ArticleService {
    @Autowired
    private ArticleMapper articleRepo;
    @Autowired
    private UserInfoMapper userInfoMapper;

    // To get the article list by region
    // Return 20 articles each time
//    public List<Article> getRegionArticle(Integer regionId, Integer start) {
//        List<Article> result =  articleRepo.getRegionArticle(regionId, start);
//        for (Article article:result
//             ) {
//            UserInfo userInfo = userInfoMapper.selectByPrimaryKey(article.getUserId());
//            article.setUserName(userInfo.getName());
//        }
//        return result;
//    }

    // To get the article numbers
//    public Integer getArticleNumbers(Integer regionId) {
//        return articleRepo.getArticleNumbers(regionId);
//    }

    // TODO: get the article content

    // get the article by author
    public ArrayList<Article> getUserArticle(Integer userId) {
        ArrayList<Article> result = null;
        try {
            result = articleRepo.selectPublishedByUserId(userId);
            for (int i = 0; i < result.size(); ++i) {
                result.get(i).setUserName(userInfoMapper.selectNameByID(result.get(i).getUserId()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;

    }

    public ArrayList<Article> getUnpublishArticle(Integer classId) {
        ArrayList<Article> result = new ArrayList<>();
        result =  articleRepo.selectUnpublishedByClass(classId);
        for (int i = 0; i < result.size(); ++i) {
            result.get(i).setUserName(userInfoMapper.selectNameByID(result.get(i).getUserId()));
        }
        return result;
    }


    public ArrayList<Article> getPublishedArticle(Integer regionId, String type) {
        //both parameter are valid
        ArrayList<Article> result = new ArrayList<>();
        if (regionId != null && !type.equals("")) {
            result  = articleRepo.selectPublishedByTypeAndRegion(regionId, type);
        } else if (regionId != null && type.equals("")) {
            result =  articleRepo.selectPublishedByRegion(regionId);
        } else if (regionId == null && !type.equals("")) {
            result =  articleRepo.selectPublishedByType(type);
        } else {
            result =  articleRepo.getAllPublishedArticle();
        }
        for (int i = 0; i < result.size(); ++i) {
            result.get(i).setUserName(userInfoMapper.selectNameByID(result.get(i).getUserId()));
        }
        return result;
    }


    public Integer generateId() {
        Integer id =  articleRepo.selectMaxId();
        if (id == null) {
            return 1;
        } else {
            return id + 1;
        }
    }

    // TODO: insertArticle

    public Boolean insertArticle(Article article) {
        try {
            articleRepo.insert(article);
        } catch (Exception e) {
            return false;
        }
        return true;
    }


    public Boolean insertArticle(Integer id, String url, Date time, Integer uid, Integer status, Integer classId, String title, String type) {
        return articleRepo.insertArticle(id, url,time,uid,status,classId,title,type);
    }

    public Article getOneArticleById(Integer id) {
        Article result =  articleRepo.selectByPrimaryKey(id);
        if(result != null) {
            result.setUserName(userInfoMapper.selectNameByID(result.getUserId()));
        }
        return result;
    }


    public Article getArticleById(Integer aid){
        Article result =  articleRepo.getArticleById(aid);
        if(result != null) {
            result.setUserName(userInfoMapper.selectNameByID(result.getUserId()));
        }
        return result;
    }



    public Article deleteArticle(Integer aid){
        Article article = articleRepo.getArticleById(aid);
        try{
//            articleRepo.delete(article);
            if (articleRepo.deleteArticle(aid)){
                return article;
            }else{
                return null;
            }
        }catch(Exception e){
            return null;
        }
    }


    public ArrayList<Article> getArticleToConfirmByClassId(Integer classId){
        try{
            ArrayList<Article> result = articleRepo.getArticlesToConfirmByClassId(classId);
            for (int i = 0; i < result.size(); ++i) {
                result.get(i).setUserName(userInfoMapper.selectNameByID(result.get(i).getUserId()));
            }
            return result;
        }catch(Exception e){
            return null;
        }
    }

    public boolean confirmArticle(Integer aid){
        return articleRepo.confirmArticle(aid);
    }

    public ArrayList<Article> getArticleByUserId(Integer uid){
        try{
            ArrayList<Article> result = articleRepo.getArticleByUserId(uid);
            for (int i = 0; i < result.size(); ++i) {
                result.get(i).setUserName(userInfoMapper.selectNameByID(result.get(i).getUserId()));
            }
            return result;
        }catch(Exception e){
            return null;
        }
    }

}
