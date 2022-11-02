package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;

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
// TODO: 11/2/22  grab data to check.
        String password1 = request.getParameter("registerPassword1");
        String password2 = request.getParameter("registerPassword2");
        String username = request.getParameter("username");
        String email = request.getParameter("registerEmail");
        String password;
        // TODO: ensure the submitted information is valid
        // Valid Password
        if (password1.equals(password2)) {
            password = password1;
        } else {
            password = null;
        } // how do I make this not so bulky...
        System.out.println(username + password + email);

        boolean validAttempt = password != null && email != null && username != null;

        // TODO: create a new user based off of the submitted information
            User user = new User(username, email, password);
            try {
                DaoFactory.getUsersDao().insert(user);
                request.getSession().setAttribute("user", username);
                response.sendRedirect("/profile");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }


//            response.sendRedirect("/register");


        // TODO: if a user was successfully created, send them to their profile



    }
}
