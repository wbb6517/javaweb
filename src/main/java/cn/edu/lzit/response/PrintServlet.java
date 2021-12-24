package cn.edu.lzit.response;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

@WebServlet(name = "PrintServlet", value = "/PrintServlet")
public class PrintServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //响应行相关的方法
        //hangMethod(response);

        //与相应消息头相关方法,在用户名或者密码错误的情况下，重新回到登录界面
        //headerMethod(response);

//        //响应体相关方法
//        //1.字节流对象向浏览器返回数据
//        ServletOutputStream out = response.getOutputStream();
//        String value1 = "lzit字节流";
//        out.write(value1.getBytes());

        //2.字符流对象向浏览器返回数据
        response.setContentType("text/html;charset=utf-8");
        PrintWriter pw = response.getWriter();
        String value2 = "lzit字符流";
        pw.println(value2);
        pw.write(value2);
    }

    private void headerMethod(HttpServletResponse response) {
        //1.设置状态码
        response.setStatus(302);
        //2.设置响应头，重定向到登录界面
        response.setHeader("Location","/javawebServlet/login.html");
    }

    //响应行相关的方法
    private void hangMethod(HttpServletResponse response) throws IOException {
        response.sendError(404,"资源找不到！");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
