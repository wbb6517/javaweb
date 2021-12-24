package cn.edu.lzit.filter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebFilter(filterName = "MyFilter01" ,urlPatterns = "/MyFilterServlet")
public class MyFilter01 implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        response.getWriter().println("hello MyFilter01-----------before<br>");
        chain.doFilter(request, response);
        response.getWriter().println("hello MyFilter01-----------after<br>");
    }
}
