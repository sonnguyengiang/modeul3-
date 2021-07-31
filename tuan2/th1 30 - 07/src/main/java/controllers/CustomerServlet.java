package controllers;

import services.CustomerServices;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {""})
public class CustomerServlet extends HttpServlet {
    CustomerServices customerServices = new CustomerServices();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher;
        String action = req.getParameter("action");
        if (action == null){
            action = "";
        }

        switch (action){
            case "create":
            case "delete":
            default:
                req.setAttribute("listCustomer", customerServices.list);
                dispatcher = req.getRequestDispatcher("index.jsp");
                dispatcher.forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
