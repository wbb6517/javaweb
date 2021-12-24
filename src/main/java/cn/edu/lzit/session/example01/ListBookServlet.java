package cn.edu.lzit.session.example01;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Collection;

@WebServlet(name = "ListBookServlet", value = "/ListBookServlet")
public class ListBookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //处理中文乱码
        response.setContentType("text/html;charset=utf-8");
        //1.得到所有图书
        Collection<Book> books = BookDB.getAll();
        //2.图书回显到页面
        response.getWriter().println("<h1>以下是本网站所有图书</h1>");
        //3.遍历集合，回显数据
        for(Book b:books){
            //4.得到图书名字
            String name = b.getName();
            String id = b.getId();
            //5.购买图书链接
            String url="<a href='PurchaseServlet?id="+id+"'>点击购买</a>";
            response.getWriter().println("图书名称："+name+"->"+url+"<br><br>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
