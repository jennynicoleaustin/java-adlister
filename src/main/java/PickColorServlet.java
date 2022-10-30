import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PickColorServlet", urlPatterns = "/pick-color")

//A user goes to /pickcolor and sees a page where they are prompted to enter their favorite color (using a text input).
// Upon clicking submit, they are redirected to /viewcolor and see a page with a background color of the submitted color.
//
//use a POST request on the form
//use two JSPs and two servlets
//use style tags to set the background color on the HTML body
//pass the data from one servlet to another by adding the color value in a query string

public class PickColorServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/pick-color.jsp").forward(req, resp);

    }
//This creates a query string and then the color variable is called using ${color} on the jsp file.
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String color = req.getParameter("color");
        String url = "/view-color?color=" + color;
        resp.sendRedirect(url);
    }

}
