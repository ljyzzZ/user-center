package com.lucas.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.lucas.model.User;

import javax.servlet.http.HttpServletRequest;

public interface UserService extends IService<User> {


    /**
     * @param userAccount   用户账号
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @param planetCode    星球编号
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword, String planetCode);

    /**
     * @param userAccount
     * @param userPassword
     * @return
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户脱敏
     *
     * @param originUser
     * @return
     */
    User getSafetyUser(User originUser);

    /**
     * 用户注销（移除登录态）
     *
     * @param request
     */
    int userLogout(HttpServletRequest request);
}
