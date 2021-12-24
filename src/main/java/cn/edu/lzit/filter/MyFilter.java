package cn.edu.lzit.filter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;

//@WebFilter(filterName = "MyFilter" ,urlPatterns = "/MyFilterServlet")
public class MyFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        //chain.doFilter(request, response);
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println("被拦截了！");
        chain.doFilter(request, response);
    }
}
