package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;
import org.mindrot.jbcrypt.BCrypt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO: show the registration form
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
// TODO: 11/2/22  grab data
        String username = request.getParameter("username");
        String email = request.getParameter("registerEmail");
// Hash passwords before they are added to database
        boolean passwordsMatch = (request.getParameter("registerPassword1")).equals(request.getParameter("registerPassword2"));
        String hashPassword = BCrypt.hashpw((request.getParameter("registerPassword1")), BCrypt.gensalt());

// Ensure inputs are valid before creating a new user.
        boolean validAttempt = !email.isEmpty() && !username.isEmpty() && passwordsMatch;
        if (validAttempt) {
            // TODO: create a new user based off of the submitted information
            User user = new User(username, email, hashPassword);
            try {
                DaoFactory.getUsersDao().insert(user);
                request.getSession().setAttribute("user", user);
                response.sendRedirect("/profile");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } else {
            response.sendRedirect("/register");
        }

    }
}
