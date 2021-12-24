package cn.edu.lzit.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
/**
 * 在TestServlet04里存数据
 * */
@WebServlet(name = "TestServlet04", value = "/TestServlet04")
public class TestServlet04 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取ServletContext对象
        ServletContext context = this.getServletContext();
        // 通过setAttribute()方法存值
        context.setAttribute("key", "这是在TestServlet04里面存的值");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
