package com.example.wechatdream.dao;

import com.example.wechatdream.domain.User;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User> {
    @Select({"SELECT "
            + " u.* "
            + " FROM "
            + " user u"
            + " WHERE "
            + " u.id = #{id}"})
    User selectUserByID(String ID);
}