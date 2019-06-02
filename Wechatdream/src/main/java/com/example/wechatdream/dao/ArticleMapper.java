package com.example.wechatdream.dao;

import com.example.wechatdream.domain.Article;
import org.apache.ibatis.annotations.*;
import tk.mybatis.mapper.common.Mapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public interface ArticleMapper extends Mapper<Article> {

    @Select({"SELECT "//    @Select({"SELECT "
            + " * "
            + " FROM "
            + " article a "
            + " WHERE "
            + " a.region_id = #{regionId} "
            + " ORDER BY a.time "
            + " LIMIT #{start},20 "})
    List<Article> getRegionArticle(Integer regionId, Integer start);

    @Select({"SELECT COUNT(id) "
            +"FROM article "
            + " WHERE region_id=#{regionId}})"})
    Integer getArticleNumbers(Integer regionId);


    @Select({"SELECT "
            +" * "
            +" FROM article a "
            +" WHERE "
            +" a.user_id = #{userId} and a.status=1 "
            +"ORDER BY a.time "})
    ArrayList<Article> selectPublishedByUserId(@Param("userId") Integer userId);


    @Select({
            "select a.* "
                    +" FROM article a  "
                    +" WHERE "
                    +" a.type=#{type} and a.status=1 "
                    +"ORDER BY a.time "})
    ArrayList<Article> selectPublishedByType(@Param("type") String type);

    @Select({"SELECT "
            +" * "
            +" FROM article a , class c "
            +" WHERE "
            +" c.school_region_id = #{regionId} and c.id = a.class_id  and a.status=1 "
            +"ORDER BY a.time "})
    ArrayList<Article> selectPublishedByRegion(@Param("regionId") Integer regionId);


    @Select({"SELECT "
            +" * "
            +" FROM article a , class c "
            +" WHERE "
            +" c.school_region_id = #{regionId} and a.class_id=c.id and a.type=#{type} and a.status=1 "
            +"ORDER BY a.time "})
    ArrayList<Article> selectPublishedByTypeAndRegion(@Param("regionId") Integer regionId, @Param("type") String type);


    @Select({"SELECT "
            +" * "
            +" FROM article a , class c "
            +" WHERE "
            +" c.id = #{classId} and c.id = a.class_id  and a.status=0 "
            +"ORDER BY a.time desc "})
    ArrayList<Article> selectUnpublishedByClass(@Param("classId") Integer classId);

    @Select({"SELECT "
            +" max(id) "
            +" FROM article "})
    Integer selectMaxId();


    @Select({
            "SELECT "
                    +" * "
                    +" FROM article a "
                    +" WHERE a.id = #{aid} "
    })
    Article getArticleById(@Param("aid") Integer aid);

    //    @Select({
//            "SELECT"
//            +" COUNT(*) "
//            +" FROM like l "
//            +" WHERE l.article_id = #{aid} "
//    })
//    Integer getLikeNumOfArticle(@Param("aid") Integer aid);
    @Select({
            "SELECT"
                    +" * "
                    +" FROM article a"
                    +" WHERE a.status = 1 "
    })
    ArrayList<Article> getAllPublishedArticle();

    @Select({
            "SELECT "
                    +" * "
                    +" FROM article a "
                    +" WHERE a.class_id = #{classId} and a.status = 0"
    })
    ArrayList<Article> getArticlesToConfirmByClassId(@Param("classId") Integer classId);


    @Update({
            "UPDATE "
                    +" article a "
                    +" SET status=1 "
                    +" WHERE a.id=#{aid}"
    })
    boolean confirmArticle(@Param("aid") Integer aid);


    @Delete({
            "Delete "
                    +" FROM article "
                    +" WHERE id = #{aid}"
    })
    boolean deleteArticle(@Param("aid") Integer aid);

    @Select({
            "SELECT"
                    +" * "
                    +" FROM article a "
                    +" WHERE a.user_id = #{uid}"
    })
    ArrayList<Article> getArticleByUserId(@Param("uid") Integer uid);

    @Insert({
            "INSERT INTO article"
                    +" values(#{id},#{url},#{time},#{uid}, #{status}, #{classId}, #{title}, #{type}) "
    })
    boolean insertArticle(@Param("id") Integer id, @Param("url") String url, @Param("time") Date time, @Param("uid") Integer uid, @Param("status") Integer status, @Param("classId") Integer classId, @Param("title") String title, @Param("type") String type);


}