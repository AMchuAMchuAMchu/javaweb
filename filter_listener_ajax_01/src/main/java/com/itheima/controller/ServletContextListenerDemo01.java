package com.itheima.controller;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebListener;

/**
 * Description ==> TODO
 * BelongsProject ==> javaweb
 * BelongsPackage ==> com.itheima.controller
 * Version ==> 1.0
 * CreateTime ==> 2022-11-10 14:58:23
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@WebListener
public class ServletContextListenerDemo01 implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("init...");
        System.out.println("init...");
        System.out.println("init...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("destroy...");
        System.out.println("destroy...");
        System.out.println("destroy...");
    }
}
