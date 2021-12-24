package cn.edu.lzit.jdbc02.servlet;

import cn.edu.lzit.jdbc02.dao.UserDAO;
import cn.edu.lzit.jdbc02.dao.impl.UserDAOImpl;
import cn.edu.lzit.jdbc02.pojo.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "JDBCRegisterServlet", value = "/JDBCRegisterServlet")
public class JDBCRegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String petName = request.getParameter("petName");
        String userNameTrue = request.getParameter("userNameTrue");
        String userPassword = request.getParameter("userPassword");
        String gender = request.getParameter("gender");
        String email = request.getParameter("email");
        String address = request.getParameter("address");

        User user = new User();
        user.setPetName(petName);
        user.setUserNameTrue(userNameTrue);
        user.setUserPassword(userPassword);
        user.setGender(gender);
        user.setEmail(email);
        user.setAddress(address);

        UserDAO dao=new UserDAOImpl();

        if (dao.saveUsePS(user)){
            response.sendRedirect("jdbc/registersuccess.jsp");
        }else {
            //request.setAttribute("reerrorMsg", "red");
            response.sendRedirect("jdbc/registered.jsp");
        }
    }
}
