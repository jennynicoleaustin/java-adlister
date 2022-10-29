import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//
@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")

public class PizzaOrderServlet extends HttpServlet {
// This links the jsp file and the servlet
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/pizza-order.jsp").forward(req, resp);
    }

    // This prints in the console inside of intellij "services" tab
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getParameter("crust"));
        System.out.println(req.getParameter("sauce"));
        System.out.println(req.getParameter("size"));
        System.out.println(req.getParameter("address"));
        String[] toppings = req.getParameterValues("toppings");
        for (String topping : toppings) {
            System.out.println(topping);
        }
    }

}
