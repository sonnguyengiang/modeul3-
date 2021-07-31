package controllers;

import models.Account;
import services.AccountServices;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/account"})
public class AccountServlet extends HttpServlet {
    AccountServices accountServices = new AccountServices();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher;
        String action = req.getParameter("action");
        if (action == null){
            action = "";
        }

        switch (action) {
            case "create":
                resp.sendRedirect("views/CreateAccount.jsp");
                break;
            case "edit":
                int index_edit = Integer.parseInt(req.getParameter("index"));
                req.setAttribute("account",accountServices.list.get(index_edit));
                dispatcher = req.getRequestDispatcher("views/EditAccount.jsp");
                dispatcher.forward(req, resp);
                break;
            case "delete":
                int index = Integer.parseInt(req.getParameter("index"));
                accountServices.delete(index);
                resp.sendRedirect("/account");
                break;
            default:
                req.setAttribute("accountList", accountServices.list);
                dispatcher = req.getRequestDispatcher("views/ShowAccount.jsp");
                dispatcher.forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher;
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "create":
                int id = Integer.parseInt(req.getParameter("id"));
                String userName = req.getParameter("userName");
                String password = req.getParameter("password");
                String gmail = req.getParameter("gmail");
                Account account = new Account(id,userName,password,gmail);
                accountServices.save(account);
//                req.setAttribute("accountList", accountServices.list);
//                dispatcher = req.getRequestDispatcher("views/ShowAccount.jsp");
//                dispatcher.forward(req,resp);

                resp.sendRedirect("/account");
                break;
            case "edit":
                int id_edit = Integer.parseInt(req.getParameter("id"));
                String userName_edit = req.getParameter("userName");
                String password_edit = req.getParameter("password");
                String gmail_edit = req.getParameter("gmail");
                Account account_edit = new Account(id_edit,userName_edit,password_edit,gmail_edit);
                int index_edit = Integer.parseInt(req.getParameter("index"));
                accountServices.edit(account_edit, index_edit);
                resp.sendRedirect("/account");
                break;
            case "delete":
            default:
                req.setAttribute("accountList", accountServices.list);
                dispatcher = req.getRequestDispatcher("views/ShowAccount.jsp");
                dispatcher.forward(req, resp);
        }
    }
}
