package com.cn.service;

import com.cn.entity.Admin;
import com.cn.entity.User;

/**
 * @author vook
 * @date 2017/11/15 15:57
 */
public interface AdminService {
    //管理员登录
    Admin adLogin(String a_name, String a_password);
    //删除用户
    boolean deleteUser(int u_id);
    //根据用户名查找用户
    User findUserByName(String u_name);
}
