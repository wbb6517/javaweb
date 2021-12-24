package cn.edu.lzit.request;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RequestIncludingServlet", value = "/RequestIncludingServlet")
public class RequestIncludingServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //用于包含其他servlet类
        //获取转发对象
        RequestDispatcher rd = request.getRequestDispatcher("/RequestIncludedServlet?a=abc");
        //请求包含动作
        out.println("including   before------"+"<br/>");
        rd.include(request,response);
        out.println("including   after------");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
