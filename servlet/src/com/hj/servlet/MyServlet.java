package com.hj.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

//@WebServlet("/demo1")
public class MyServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
//    创建
        System.out.println("init");
       System.out.println( "servletConfig:"+servletConfig.getInitParameter("username"));
        System.out.println( "context:"+servletConfig.getServletContext().getInitParameter("username"));
    }
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
//工作
//          接受参数
        String id = servletRequest.getParameter("id");
//        给客户端返回
        System.out.println("已经接受到消息了"+id);
        servletResponse.setContentType("text/html;charset=UTF-8");
        servletResponse.getWriter().write("嘿嘿嘿嘿");
    }
    @Override
    public String getServletInfo() {
        return null;
    }
    @Override
    public void destroy() {
//销毁
    }
}
