import test.Test;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(urlPatterns = {"/son"})
public class tesst extends HttpServlet {
    ArrayList<Test> list = new ArrayList<>();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        //them cap key value
//        req.setAttribute("ListSP",list);
//        // RequestDispatcher điều hướng request và response sang 1 servlet or jsp khác.
//        RequestDispatcher dispatcher =  req.getRequestDispatcher("test.jps");
//
//        // chuyển tếp request và reponse đi cho thằng servlet khác sử lý.
//        dispatcher.forward(req,resp);
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        int gia = Integer.parseInt(req.getParameter("gia"));
        list.add(new Test(id,name,gia));
        req.setAttribute("listSp", list);
        RequestDispatcher dispatcher;
        dispatcher = req.getRequestDispatcher("test.jsp");
        dispatcher.forward(req,resp);
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        list.add(new Test(1,"Tivi",15));

        req.setAttribute("listSp", list);
        RequestDispatcher dispatcher;
        dispatcher = req.getRequestDispatcher("test.jsp");
        dispatcher.forward(req, resp);
    }
}
