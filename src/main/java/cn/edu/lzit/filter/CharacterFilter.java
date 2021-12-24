package cn.edu.lzit.filter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "CharacterFilter",urlPatterns = "/*")
public class CharacterFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
    }
    public void doFilter(ServletRequest req, ServletResponse resp,
                         FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        // 拦截所有的请求 解决全站中文乱码
        // 指定 request 和 response 的编码
        request.setCharacterEncoding("utf-8"); // 只对消息体有效
        response.setContentType("text/html;charset=utf-8");
        // 对request进行包装
        CharacterRequest characterRequest = new CharacterRequest(request);
        chain.doFilter(characterRequest, response);
    }
    public void destroy() {
    }
}
