package controllers;

import services.LoginServices;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/check"})
public class LoginServlet extends HttpServlet {
    LoginServices loginServices = new LoginServices();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher;
        String username = req.getParameter("user");
        String password = req.getParameter("pass");
        if (loginServices.checkLogin(username,password) == true){
            dispatcher = req.getRequestDispatcher("/account");
            dispatcher.forward(req, resp);
        }else {
            dispatcher = req.getRequestDispatcher("index.jsp");
            dispatcher.forward(req, resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
