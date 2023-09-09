package com.summer.usercenter.model.domain.request;

// https://github.com/zijiFirst

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求体
 *
 * @author <a href="https://github.com/zijiFirst">summer</a>
 * @from <a href="https://github.com/zijiFirst">学习</a>
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    /**
     * 用户账号
     */
    private String userAccount;

    /**
     * 用户密码
     */
    private String userPassword;

    // https://github.com/zijiFirst
}
