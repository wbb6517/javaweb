package cn.edu.lzit.firstapp.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", value = "/HelloWorldServlet")
public class LifeServlet extends GenericServlet {

    public void init(ServletConfig config) throws ServletException {
        System.out.println("首次访问执行---------------------");
    }
    public void service(ServletRequest request, ServletResponse response) throws ServletException {
        System.out.println("每次访问都执行--------------------");
    }
    public void destroy() {
        System.out.println("服务器正常关闭时执行----------------------");
    }
}
