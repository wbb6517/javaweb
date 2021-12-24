package cn.edu.lzit.request;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "request_DownloadServlet", value = "/request_DownloadServlet")
public class DownloadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        //获取referer请求头
        String referer = request.getHeader("Referer");
        //获取服务器名称
        String serverName = request.getServerName();
        //判断请求头是否来自本网站，即referer是否包含serverName
        if (referer!=null&&referer.contains(serverName)){
            out.println("download................");
        }else {
            out.println("请从正规网站下载！");
            //response.sendRedirect("download.html");
            response.setHeader("Refresh","3;URL=/javaweb_war_exploded/download.html");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
