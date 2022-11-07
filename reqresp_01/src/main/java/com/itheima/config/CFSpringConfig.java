package com.itheima.config;

import com.itheima.controller.LoginDemo01;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;

/**
 * Description ==> TODO
 * BelongsProject ==> javaweb
 * BelongsPackage ==> com.itheima.config
 * Version ==> 1.0
 * CreateTime ==> 2022-11-07 08:58:56
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Configuration
@ComponentScan("com.itheima.service")
@Import({CFDruidDataSource.class,CFMybatisConfig.class, LoginDemo01.class})
@PropertySource("classpath:jdbc.properties")
@Transactional
public class CFSpringConfig {
}
