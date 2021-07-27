import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(urlPatterns = {"/th4"})
public class Th4  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello","xin chao");
        dictionary.put("hi","xin chao");
        dictionary.put("goodbye","tam biet");
        dictionary.put("good morning","chao buoi sang");

        String text = req.getParameter("text");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");

        String result = dictionary.get(text);
        if (result != null){
            writer.println("work: " + text);
            writer.println("<br>");
            writer.println("result: " + result);
        } else {
        writer.println("Not found");
    }

        writer.println("</html>");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
