package cn.edu.lzit.response;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Date;

@WebServlet(name = "RefreshServlet", value = "/RefreshServlet")
public class RefreshServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //定时跳转，用到Refresh响应头
        //response.setHeader("Refresh","5;URL=/javaweb_war_exploded/login.html");

        //定时刷新
        response.setHeader("Refresh","2");
        response.getWriter().println(new Date());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
