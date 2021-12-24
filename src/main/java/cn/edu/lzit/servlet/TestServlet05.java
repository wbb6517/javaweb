package cn.edu.lzit.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 在TestServlet05里取数据
 * */
@WebServlet(name = "TestServlet05", value = "/TestServlet05")
public class TestServlet05 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        //获取ServletContext对象
        ServletContext context = this.getServletContext();
        // 通过getAttribute()方法获取属性值
        String key = (String) context.getAttribute("key");
        out.println(key);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
