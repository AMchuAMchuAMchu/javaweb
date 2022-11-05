package com.itheima.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;

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

        Map<String, String[]> parameterMap = request.getParameterMap();

        parameterMap.entrySet().forEach((item)->{
            String key = item.getKey();
            System.out.print("key::"+key);
            String[] value = item.getValue();
            System.out.println("||value::"+Arrays.toString(value));
        });


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("post...");
        request.setCharacterEncoding("UTF-8");

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
        System.out.println("s1>>"+s);
    }
}
