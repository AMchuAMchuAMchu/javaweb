package com.itheima.controller;

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
 * CreateTime ==> 2022-11-07 07:46:03
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@WebServlet("/redirect01")
public class Redirect01 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet...");
        System.out.println("redirect01");
//        resp.setCharacterEncoding("utf-8");
//        resp.setStatus(200);
        resp.setContentType("text/html;charset=utf-8");
//        req.setAttribute("name","刀剑神域 10 anniversary");
//        req.getRequestDispatcher("/redirect02").forward(req,resp);
        resp.getWriter().write("<h1>欢迎来到刀剑的殿堂....</h1>");
        resp.setStatus(302);
        String contextPath = req.getContextPath();
        resp.setHeader("Location",contextPath+"/redirect02");
//        resp.setHeader("Location","/baidu.com");
//        resp.sendRedirect("http://www.baidu.com");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost...");
    }
}
