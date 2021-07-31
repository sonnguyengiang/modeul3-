import product.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(urlPatterns = "")
public class CreateProduct extends HttpServlet {
    ArrayList<Product> list = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        list.add(new Product(1, "lamborghini", "img/anh1.jpg", 234234234));
        list.add(new Product(2, "honda", "img/anh2.png", 4234));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        list.add(new Product(1, "lamborghini", "img/anh1.jpg", 234234234));
        list.add(new Product(2, "honda", "img/anh2.png", 4234));

        req.setAttribute("listSp", list);
        RequestDispatcher dispatcher;
        dispatcher = req.getRequestDispatcher("index.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String img = req.getParameter("anh");
        int gia = Integer.parseInt(req.getParameter("gia"));
        list.add(new Product(id, name, img, gia));

        req.setAttribute("listSp", list);
        RequestDispatcher dispatcher;
        dispatcher = req.getRequestDispatcher("index.jsp");
        dispatcher.forward(req, resp);
    }
}
