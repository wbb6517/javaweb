package cn.edu.lzit.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet(name = "TestServlet02", value = "/TestServlet02")
public class TestServlet02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        // 获得ServletConfig对象
        ServletConfig config = this.getServletConfig();

        //获得Servlet名称，即<servlet-name>TestServlet02</servlet-name>中的值
        String ServletName = config.getServletName();
        out.println("servlet的名称："+ServletName);

        // 获得参数名为encoding对应的参数值
        String param = config.getInitParameter("encoding");
        out.println("<br />encoding=" + param);

        //获取servlet参数的初始化名称
        Enumeration<String> initParameterNames = config.getInitParameterNames();
        while (initParameterNames.hasMoreElements()){
            //获取初始化参数的名称
            String name = initParameterNames.nextElement();
            //根据初始化参数的名称，获取相应的值
            String value = config.getInitParameter(name);
            out.println("<br />初始化参数的名称："+name);
            out.println("<br />初始化参数的值："+value);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
