import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GuessServlet", urlPatterns = "/guess")


public class GuessServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/guess.jsp").forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String answer = "2";
        String guess = req.getParameter("guess");
        String correctURL = "/correct";
        String incorrectURL = "/incorrect";
        if (guess.equals("2")) {
            resp.sendRedirect(correctURL);
        } else {
            resp.sendRedirect(incorrectURL);
        }
    }
}
