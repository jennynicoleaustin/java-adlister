import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//to /viewcolor and see a page with a background color of the submitted color.
@WebServlet(name = "ViewColorServlet", urlPatterns = "/view-color")
public class ViewColorServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String color = req.getParameter("color");
        if (color == null) {
            color = "transparent";
        }
        req.setAttribute("color", color);
        req.getRequestDispatcher("/view-color.jsp").forward(req, resp);
    }

}
