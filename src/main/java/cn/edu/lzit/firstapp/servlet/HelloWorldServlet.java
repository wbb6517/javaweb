package cn.edu.lzit.firstapp.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", value = "/HelloWorldServlet")
public class HelloWorldServlet extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        PrintWriter out = servletResponse.getWriter();

        out.println("Hello World");
    }


}
