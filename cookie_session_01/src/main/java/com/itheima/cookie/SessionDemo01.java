package com.itheima.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Description ==> TODO
 * BelongsProject ==> javaweb
 * BelongsPackage ==> com.itheima.cookie
 * Version ==> 1.0
 * CreateTime ==> 2022-11-09 08:21:46
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@WebServlet("/session01")
public class SessionDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet...");

        HttpSession session = req.getSession();

        session.setAttribute("name02","为美好世界献上祝福");

    }
}
