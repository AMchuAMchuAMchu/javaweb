package com.itheima.controller;

import com.itheima.config.CFSpringConfig;
import com.itheima.service.IUserService;
import com.itheima.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Description ==> TODO
 * BelongsProject ==> javaweb
 * BelongsPackage ==> com.itheima.controller
 * Version ==> 1.0
 * CreateTime ==> 2022-11-07 08:48:29
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Component
@WebServlet("/register01")
public class RegisterDemo01 extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("doPost...");

        String username = req.getParameter("username");

        String password = req.getParameter("password");

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(CFSpringConfig.class);

        UserServiceImpl userService = ac.getBean(UserServiceImpl.class);

        boolean b = userService.insertUser(username, password);

        System.out.println("插入结果::"+b);

        resp.setContentType("text/html;charset=utf-8");

        resp.getWriter().write("<h1>插入结果"+(b?"🤣🤣成功!!":"😭😭失败...")+"</h1>");


    }
}
