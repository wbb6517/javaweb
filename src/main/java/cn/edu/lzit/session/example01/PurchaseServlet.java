package cn.edu.lzit.session.example01;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "PurchaseServlet", value = "/PurchaseServlet")
public class PurchaseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获得用户购买的商品
        String id = request.getParameter("id");
        if (id == null) {
            // 如果id为null，重定向到ListBookServlet页面
            response.sendRedirect("ListBookServlet");
            return;
        }
        Book book = BookDB.getBook(id);
        // 创建或者获得用户的Session对象
        HttpSession session = request.getSession();
        // 从Session对象中获得用户的购物车
        List<Book> cart = (List<Book>) session.getAttribute("cart");
        if (cart == null) {
            // 首次购买，为用户创建一个购物车(List集合模拟购物车)
            cart = new ArrayList<Book>();
            // 将购物城存入Session对象
            session.setAttribute("cart", cart);
        }
        // 将商品放入购物车
        cart.add(book);
        // 创建Cookie存放Session的标识号
        Cookie cookie = new Cookie("JSESSIONID", session.getId());
        cookie.setMaxAge(60 * 30);
        response.addCookie(cookie);
        // 重定向到购物车页面
        response.sendRedirect("CartServlet");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}







