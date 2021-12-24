package cn.edu.lzit.jdbc02.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

import cn.edu.lzit.jdbc02.dao.UserDAO;
import cn.edu.lzit.jdbc02.dao.impl.UserDAOImpl;
import cn.edu.lzit.jdbc02.pojo.*;

@WebServlet(name = "JDBCLoginServlet", value = "/JDBCLoginServlet")
public class JDBCLoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
         *
         */
        String petName = request.getParameter("petName");
        String userPassword = request.getParameter("userPassword");

        /*
         *
         */
        User user = new User();
        user.setPetName(petName);
        user.setUserPassword(userPassword);

        /*
         *
         */
        UserDAO dao=new UserDAOImpl();
        user=dao.findByPartProperty(petName, userPassword);

        /*
         *
         */
        if (user!=null) {
            request.getSession().setAttribute("user", user);
            response.sendRedirect("jdbc/welcome.jsp");
        } else {
            request.setAttribute("errorMsg", "用户名或密码错误！");
            request.getRequestDispatcher("/jdbc/login.jsp").forward(request,response);
        }

    }
}
