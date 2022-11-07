package com.itheima.service;

import com.itheima.pojo.User;
import org.springframework.transaction.annotation.Transactional;

/**
 * Description ==> TODO
 * BelongsProject ==> javaweb
 * BelongsPackage ==> com.itheima.service
 * Version ==> 1.0
 * CreateTime ==> 2022-11-07 09:27:39
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Transactional
public interface IUserService {

    boolean selectByUsername(String username);

    boolean insertUser(String username,String password);

}
