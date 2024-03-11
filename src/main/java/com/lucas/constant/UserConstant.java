package com.lucas.constant;

/**
 * 用户常量
 * 当跟用户类相关的常量大于 2 个时，可以考虑新建一个常量类
 */
public class UserConstant {

    /**
     * 用户登录态-作session储存信息中的键
     */
    public static String USER_LOGIN_STATE = "userLoginState";

    /**
     * 权限常量：用户-0 管理员-1
     */
    public static int DEFAULT_ROLE = 0;
    public static int ADMIN_ROLE = 1;
}
