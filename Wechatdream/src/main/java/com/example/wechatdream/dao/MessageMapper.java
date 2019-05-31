package com.example.wechatdream.dao;

import com.example.wechatdream.domain.Message;
import java.util.Date;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface MessageMapper extends Mapper<Message> {
}