package cn.edu.lzit.ELservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "MyEIServlet", value = "/MyEIServlet")
public class MyELServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("username", "itcast");
        request.setAttribute("password", "123");
        RequestDispatcher dispatcher = request
                .getRequestDispatcher("/el/myeljsp.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
