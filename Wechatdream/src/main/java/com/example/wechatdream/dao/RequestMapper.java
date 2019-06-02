package com.example.wechatdream.dao;

import com.example.wechatdream.domain.Request;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.ArrayList;

public interface RequestMapper extends Mapper<Request> {
    @Select({"SELECT * "
            +" FROM request "
            +"WHERE class_id=#{classId}"})
    ArrayList<Request> getRequestListByClass(@Param("classId") Integer classId);

    @Select({"SELECT * "
            +" FROM request "
            +"WHERE class_id=#{classId} and user_id=#{userId}"})
    Request getOneRequest(@Param("classId") Integer classId, @Param("userId") Integer userId);

}