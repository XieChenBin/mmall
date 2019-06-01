package com.imooc.mmall.common;

/**
 * @author XieChenBin
 */
public class Const {

    public static final String CURRENT_USER = "currentUser";
    public static final String USERNAME = "username";
    public static final String EMAIL = "email";

    public interface Role {
        int ROLE_ADMIN = 0;     // 管理员
        int ROLE_CUSTOMER = 1;  // 普通用户
    }

}
