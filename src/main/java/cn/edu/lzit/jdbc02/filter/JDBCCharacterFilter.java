package cn.edu.lzit.jdbc02.filter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebFilter(filterName = "JDBCCharacterFilter",urlPatterns = "/*")
public class JDBCCharacterFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        //如果做完工作，需要放行，转到目的地去工作
        chain.doFilter(request, response);
    }
}
