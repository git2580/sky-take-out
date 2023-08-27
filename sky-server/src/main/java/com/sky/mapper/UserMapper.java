package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @create 2023-08-27 20:38
 */
@Mapper
public interface UserMapper {
    /**
     * 根据openid返回对象
     */
    @Select("select * from  user where  openid=#{openid}")
    User getOpenid(String openid);

    /**
     * 注册用户
     * @param user
     */
    void insert(User user);
}
