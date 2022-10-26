import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//
@WebServlet(name = "CountServlet", urlPatterns = "/count")

//Create a page view counter:
//Create a page that displays a number that goes up by one every time the /count page is viewed.
//Bonus
//Allow the user to pass a parameter in the query string to reset the counter.
public class CountServlet extends HttpServlet {
    private int count;

    public void init() {
        count = 0;
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        count++;
        PrintWriter out = res.getWriter();
        out.println("<h1>" + count + "</h1>");
        String reset = req.getParameter("reset");
        if(reset.equalsIgnoreCase("reset")) {
            init();
        }
    }

}
