package com.example.wechatdream.dao;

import com.example.wechatdream.domain.ClassHasUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.ArrayList;

public interface ClassHasUserMapper extends Mapper<ClassHasUser> {
    @Select({"select count(*) " +
            "from class_has_user cu " +
            "where cu.class_id=#{id}"})
    Integer getClassMemberNum(Integer id);
}