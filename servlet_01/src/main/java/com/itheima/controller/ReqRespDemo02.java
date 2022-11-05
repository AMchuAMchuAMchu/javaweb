package com.itheima.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;

@WebServlet("/reqrespdemo02")
public class ReqRespDemo02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("get...");
//
//        String method = request.getMethod();
//
//        String contextPath = request.getContextPath();
//
//        String requestURI = request.getRequestURI();
//
//        StringBuffer requestURL = request.getRequestURL();
//
//        String queryString = request.getQueryString();
//
//        String name = request.getParameter("name");
//
//        Enumeration<String> parameterNames = request.getParameterNames();
//
//        String[] names = request.getParameterValues("names");
//
//        System.out.println("method::"+method);
//        System.out.println("contextPath::"+contextPath);
//        System.out.println("requestURI::"+requestURI);
//        System.out.println("requestURL::"+requestURL);
//        System.out.println("queryString::"+queryString);
//        System.out.println("name::"+name);
//        System.out.println("parameterNames::");
//        System.out.println(parameterNames);
//        System.out.println("names::");
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(i+1+">>"+names[i]);
//        }

//        String header = request.getHeader("user-agent");
//
//        System.out.println("header::"+header);



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("post...");

//        String method = request.getMethod();
//
//        String contextPath = request.getContextPath();
//
//        String requestURI = request.getRequestURI();
//
//        StringBuffer requestURL = request.getRequestURL();
//
//        String queryString = request.getQueryString();
//
//        String name = request.getParameter("name");
//
//        Enumeration<String> parameterNames = request.getParameterNames();
//
//        String[] names = request.getParameterValues("names");
//
//        System.out.println("method::"+method);
//        System.out.println("contextPath::"+contextPath);
//        System.out.println("requestURI::"+requestURI);
//        System.out.println("requestURL::"+requestURL);
//        System.out.println("queryString::"+queryString);
//        System.out.println("name::"+name);
//        System.out.println("parameterNames::");
//        System.out.println(parameterNames);
//        System.out.println("names::");
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(i+1+">>"+names[i]);
//        }

//        String header = request.getHeader("user-agent");
//
//        System.out.println("header>>"+header);

        String s = request.getReader().readLine();
        String s1 = new String(s.getBytes(),StandardCharsets.ISO_8859_1);
        System.out.println("s>>"+s1);

    }
}
