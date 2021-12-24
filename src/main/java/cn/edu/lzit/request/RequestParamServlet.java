package cn.edu.lzit.request;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;

@WebServlet(name = "RequestParamServlet", value = "/RequestParamServlet")
public class RequestParamServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        //根据name属性值，获取用户输入的值
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //获取用户选择的值
        String[] hobbies = request.getParameterValues("hobby");
        out.println("username:"+username+"<br>");
        out.println("password:"+password+"<br>");
        out.println("hobbies:"+ Arrays.toString(hobbies) +"<br>");

        out.println("<br>---------------------------------------------------------------<br>");

        Map<String, String[]> map = request.getParameterMap();
        //遍历map
        for (String key : map.keySet()) {
            String[] value = map.get(key);
            out.println("name属性的值："+key+"->\t"+Arrays.toString(value)+"<br>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置请求和相应的编码，防止乱码
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        //根据name属性值，获取用户输入的值
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //获取用户选择的值
        String[] hobbies = request.getParameterValues("hobby");
        out.println("username:"+username+"<br>");
        out.println("password:"+password+"<br>");
        out.println("hobbies:"+ Arrays.toString(hobbies) +"<br>");

        out.println("<br>---------------------------------------------------------------<br>");

        Map<String, String[]> map = request.getParameterMap();
        //遍历map
        for (String key : map.keySet()) {
            String[] value = map.get(key);
            out.println("name属性的值："+key+"->\t"+Arrays.toString(value)+"<br>");
        }
    }
}
