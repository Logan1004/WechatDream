package com.example.wechatdream.dao;

import com.example.wechatdream.domain.File;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.ArrayList;

public interface FileMapper extends Mapper<File> {
    @Select({
            "SELECT * FROM file f WHERE f.class_id = #{classId} and (f.status = 1 or f.status = 4)"
    })
    ArrayList<File> getFileToConfirm(Integer classId);
}