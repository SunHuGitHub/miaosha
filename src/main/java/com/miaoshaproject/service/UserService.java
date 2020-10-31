package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.UserModel;
import org.springframework.stereotype.Service;

/**
 * @author Tiger
 * @date 2020/10/29 19:44
 */

public interface UserService {
    /**
     * 得到用户的领域模型
     *
     * @param id 用户Id
     * @return UserModel
     */
    UserModel getUserById(Integer id);

    /**
     * 用户注册接口
     *
     * @param userModel 用户的领域模型
     */
    void register(UserModel userModel) throws BusinessException;

    /**
     * 用户登录接口
     * @param telphone
     * @param encodeByMd5
     * @return
     */
    UserModel validateLogin(String telphone, String encodeByMd5) throws BusinessException;
}
