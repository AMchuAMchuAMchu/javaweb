package com.itheima.dao;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

/**
 * Description ==> TODO
 * BelongsProject ==> javaweb
 * BelongsPackage ==> com.itheima.dao
 * Version ==> 1.0
 * CreateTime ==> 2022-11-07 09:19:49
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public interface UserDao{

    @Select("select * from user where username = #{username}")
    User selectByUsername(String username);

    @Insert("insert into user values(#{username},#{password}) ")
    Integer insertUser(String username,String password);

}
