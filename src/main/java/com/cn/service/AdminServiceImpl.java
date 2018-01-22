package com.cn.service;

import com.cn.dao.AdminDao;
import com.cn.entity.Admin;
import com.cn.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 业务层
 * @author vook
 * @date 2017/11/15 15:59
 */
@Service("adminService")
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;

    public Admin adLogin(String a_name, String a_password) {
       Admin admin = adminDao.findAdminByNameAndPwd(a_name,a_password);
        System.out.println("Admin------>" + admin);
        if(admin != null) {
            System.out.println("admin.a_password------------->" + adminDao.findAdminByNameAndPwd(a_name, a_password).getA_password());
            return admin;
        }
        return null;
    }

    public boolean deleteUser(int u_id) {
        boolean isSuccess = false;
        int number = 0;
        number = adminDao.deleteUser(u_id);
        if(number > 0) {
            isSuccess = true;
            return isSuccess;
        }
        return isSuccess;
    }

    public User findUserByName(String u_name) {
        User user = adminDao.findUserByName(u_name);
        System.out.println("User------>" + user);
        if(user != null) {
            System.out.println("user.password------------->" + adminDao.findUserByName(u_name));
            return user;
        }
        return null;
    }
}
