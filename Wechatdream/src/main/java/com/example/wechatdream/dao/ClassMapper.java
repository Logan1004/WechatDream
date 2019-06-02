package com.example.wechatdream.dao;

import com.example.wechatdream.domain.Class;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.ArrayList;

public interface ClassMapper extends Mapper<Class> {
    @Select({"select l.label " +
            "from class_has_label cl,  label l " +
            "where cl.class_id=#{id} and cl.label_id = l.id"})
    ArrayList<String> getLabel(@Param("id") Integer id);

    @Select({"SELECT c.* " +
            "FROM class c inner join class_has_user u " +
            "where u.user_id = #{userId} and u.class_id = c.id "})
    ArrayList<Class> selectClassByUserId(@Param("userId") Integer userId);

}