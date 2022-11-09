package com.itheima.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Description ==> TODO
 * BelongsProject ==> javaweb
 * BelongsPackage ==> com.itheima.cookie
 * Version ==> 1.0
 * CreateTime ==> 2022-11-09 08:22:56
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@WebServlet("/session02")
public class SessionDemo02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet...");
        Object name02 = req.getAttribute("name02");
        System.out.println("name02:"+name02);
    }
}
