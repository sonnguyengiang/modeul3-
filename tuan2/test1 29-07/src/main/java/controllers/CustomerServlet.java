package controllers;

import jdk.nashorn.internal.ir.RuntimeNode;
import models.Customer;
import services.CustomerServices;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/customer"})
public class CustomerServlet extends HttpServlet {
    CustomerServices customerServices = new CustomerServices();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher;
        String action = req.getParameter("action");

        if (action == null) {
            action = "";
        }

        switch (action) {
            case "create":
                resp.sendRedirect("views/CreateCustomer.jsp");
                break;
            case "delete":
                int index = Integer.parseInt(req.getParameter("index"));
                customerServices.remove(index);
                resp.sendRedirect("/customer");
//                req.setAttribute("listCustomer", customerServices.list);
//                dispatcher = req.getRequestDispatcher("views/ShowCustomer.jsp");
//                dispatcher.forward(req,resp);
                break;
            case "edit":
                int index1 = Integer.parseInt(req.getParameter("index"));
                req.setAttribute("customer", customerServices.list.get(index1));
                dispatcher = req.getRequestDispatcher("views/EditCustomer.jsp");
                dispatcher.forward(req, resp);
                break;
            case "find":
            default:
                req.setAttribute("listCustomer", customerServices.list);
                dispatcher = req.getRequestDispatcher("views/ShowCustomer.jsp");
                dispatcher.forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        RequestDispatcher dispatcher;

        if (action == null) {
            action = "";
        }

        switch (action) {
            case "create":
                int id = Integer.parseInt(req.getParameter("id"));
                String name = req.getParameter("name");
                String gmail = req.getParameter("gmail");
                String address = req.getParameter("address");
                Customer customer = new Customer(id,name,gmail,address);
                customerServices.save(customer);
                resp.sendRedirect("/customer");
                break;
            case "remove":
            case "edit":
                int ids = Integer.parseInt(req.getParameter("id"));
                String names = req.getParameter("name");
                String gmails = req.getParameter("gmail");
                String addresss = req.getParameter("address");
                int index = Integer.parseInt(req.getParameter("index"));
                Customer customers = new Customer(ids,names,gmails,addresss);
                customerServices.edit(customers,index);
                resp.sendRedirect("/customer");
                break;
            case "find":
            default:
                req.setAttribute("listCustomer", customerServices.list);
                dispatcher = req.getRequestDispatcher("views/ShowCustomer.jsp");
                dispatcher.forward(req,resp);
        }
    }
}
