import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//
@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")

public class PizzaOrderServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String sauce = request.getParameter("sauce");
        String crust = request.getParameter("crust");
        String size = request.getParameter("size");

        request.setAttribute("sauce", sauce);
        request.setAttribute("crust", crust);
        request.setAttribute("size", size);
        request.getRequestDispatcher("../webapp/pizza-order.jsp").forward(request, response);
    }

}
