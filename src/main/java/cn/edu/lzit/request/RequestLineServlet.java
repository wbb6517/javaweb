package cn.edu.lzit.request;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RequestLineServlet", value = "/RequestLineServlet")
public class RequestLineServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //获取请求提交的方式
        String method = request.getMethod();
        out.println("请求方式：" + method + "<br>");
        //获取请求的协议
        String protocol = request.getProtocol();
        out.println("请求协议：" + protocol + "<br>");
        //获取项目路径
        String contextPath = request.getContextPath();
        out.println("项目路径：" + contextPath + "<br>");
        //获取Servlet路径
        String servletPath = request.getServletPath();
        out.println("Servlet路径：" + servletPath + "<br>");
        //获取请求路径
        String requestURI = request.getRequestURI();
        out.println("URI对应的请求路径：" + requestURI + "<br>");
        StringBuffer requestURL = request.getRequestURL();
        out.println("URI对应的请求路径：" + requestURL.toString() + "<br>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
