package com.cn.dao;

import com.cn.entity.Admin;
import com.cn.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * 持久层映射接口
 * @author vook
 * @date 2017/11/15 15:54
 */
public interface AdminDao {

    //根据管理员的用户名和密码查询管理员
    //注解的两个参数会自动封装成map集合，括号内即为键
    public Admin findAdminByNameAndPwd(@Param("a_name") String a_name, @Param("a_password") String a_password);

    // 删除用户
    public int deleteUser(int u_id);

    //根据用户名查找用户
    public User findUserByName(String u_name);

}
