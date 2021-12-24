package cn.edu.lzit.response;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

@WebServlet(name = "ChineseServlet", value = "/ChineseServlet")
public class ChineseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //处理字节流的中文乱码
        //streamMethod(response);

        //处理字符流的中文乱码
        String data = "中国";
        //设置服务器编码为utf-8
        response.setCharacterEncoding("utf-8");
        //处理浏览器端编码为utf-8
        response.setContentType("text/html;charset=utf-8");
        //获取字符流
        PrintWriter pw = response.getWriter();
        pw.println(data);
    }

    private void streamMethod(HttpServletResponse response) throws IOException {
        String data = "中国";
        ServletOutputStream out = response.getOutputStream();
        //设置浏览器端解析编码格式为utf-8
        //response.setHeader("Content-Type","text/html;charset=utf-8");  //简写成下面的
        response.setContentType("text/html;charset=utf-8");
        //让服务器以utf-8格式编码二进制数据
        out.write(data.getBytes("utf-8"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
