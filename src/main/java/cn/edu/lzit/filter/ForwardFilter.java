package cn.edu.lzit.filter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;
//dispatcherTypes
//REQUEST：默认值，浏览器直接请求的资源会被过滤器拦截
//FORWARD：转发访问资源会被过滤器拦截
//INCLUDE：包含访问资源
//ERROR：错误跳转资源
//ASYNC：异步访问资源
@WebFilter(filterName = "ForwardFilter",urlPatterns = "/filter/first.jsp",dispatcherTypes = DispatcherType.FORWARD)
public class ForwardFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        //chain.doFilter(request, response);
    }
}
