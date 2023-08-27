package com.sky.service;

import com.sky.dto.UserLoginDTO;
import com.sky.entity.User;
import com.sky.vo.UserLoginVO;

/**
 * @create 2023-08-27 9:32
 */
public interface UserService {
    /**
     * 微信登录
     */
    User wxlogin(UserLoginDTO userLoginDTO);
}
