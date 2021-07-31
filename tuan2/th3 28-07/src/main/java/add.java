import ql.Sp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(urlPatterns = {"/son"})
public class add extends HttpServlet {
    ArrayList<Sp> list = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        int gia = Integer.parseInt(req.getParameter("gia"));
        list.add(new Sp(id,name,gia));

        req.setAttribute("ListSp",list);
        RequestDispatcher dispatcher;
        dispatcher = req.getRequestDispatcher("showTable.jsp");
        dispatcher.forward(req,resp);
    }
}
