package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.pojo.User;
import com.itheima.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description ==> TODO
 * BelongsProject ==> javaweb
 * BelongsPackage ==> com.itheima.service.impl
 * Version ==> 1.0
 * CreateTime ==> 2022-11-07 09:30:28
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User selectByUsername(String username) {
        System.out.println("selectByUsername...");
        User b = userDao.selectByUsername(username);
        return b;
    }

    @Override
    public boolean insertUser(String username, String password) {
        System.out.println("insertUser...");
        Integer integer = 0;
        User user = userDao.selectByUsername(username);
        if (user == null) {
            integer = userDao.insertUser(username, password);
            return integer>0;
        }
        return false;

    }
}
