package com.example.wechatdream.dao;

import com.example.wechatdream.domain.UserInfo;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

public interface UserInfoMapper extends Mapper<UserInfo> {
    @Select({"SELECT "
            + " u.* "
            + " FROM "
            + " user_info u"
            + " WHERE "
            + " u.wechat_id = #{wechat_id}"})
    UserInfo selectUserByWechatID(String wechat_id);
}