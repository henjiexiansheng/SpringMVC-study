package com.henjie.filter;


import jdk.nashorn.internal.ir.RuntimeNode;

import javax.servlet.*;
import java.io.IOException;

public class Filter implements javax.servlet.Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化过滤器");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/html;charset=utf-8");
        System.out.println("程序执行前");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("程序执行后");
    }

    public void destroy() {
        System.out.println("注销过滤器");
    }
}
