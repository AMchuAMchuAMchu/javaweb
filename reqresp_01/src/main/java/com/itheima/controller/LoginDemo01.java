package com.itheima.controller;

import com.itheima.config.CFSpringConfig;
import com.itheima.pojo.User;
import com.itheima.service.IUserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
@WebServlet("/login01")
public class LoginDemo01 extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("doPost...");

        String username = req.getParameter("username");

        String password = req.getParameter("password");

        System.out.println("username::"+username+ "|| password:"+password);

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(CFSpringConfig.class);

        IUserService userService = ac.getBean(IUserService.class);

        User b = userService.selectByUsername(username);

        resp.setContentType("text/html;charset=utf-8");

        resp.getWriter().write("<h1>查询结果"+(b==null?"🤣🤣成功!!":"😭😭失败...")+"</h1>");

    }
}
