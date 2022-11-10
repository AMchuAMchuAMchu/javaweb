package com.itheima.mapper;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Description ==> TODO
 * BelongsProject ==> javaweb
 * BelongsPackage ==> com.itheima.mapper
 * Version ==> 1.0
 * CreateTime ==> 2022-11-10 10:33:15
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public interface UserMapper {

    @Select("select * from tb_user where username = #{username} and password = #{password}")
    User select(@Param("username") String username,@Param("password") String password);

    @Insert("insert into tb_user values(null,#{username},#{password})")
    void add(User user);

    @Select("select * from tb_user where username = #{username}")
    User selectByUsername(String username);



}
