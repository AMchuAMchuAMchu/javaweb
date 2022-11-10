package com.itheima.cookiesession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Description ==> TODO
 * BelongsProject ==> javaweb
 * BelongsPackage ==> com.itheima.cookie
 * Version ==> 1.0
 * CreateTime ==> 2022-11-09 07:56:46
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@WebServlet("/cookie02")
public class CookieDemo02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("doGet...");

        Cookie[] cookies = req.getCookies();


        for (Cookie cookie : cookies) {
            if ("name".equals(cookie.getName())){
                System.out.println(cookie.getName()+"::"+cookie.getValue());
            }
        }

    }
}
