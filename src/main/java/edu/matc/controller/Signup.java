package edu.matc.controller;

import edu.matc.entity.User;
import edu.matc.persistence.UserDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * receives data from signup.jsp and signs up a user.
 */
@WebServlet(
        name="SignUp",
        urlPatterns = {"/signup"}
)

public class Signup extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String pass = req.getParameter("password1");
        String confirmPass = req.getParameter("password2");


        if (pass.equals(confirmPass)) {
            User user = new User(username, pass);
            UserDao userDao = new UserDao();
            int id = userDao.addUser(user);
            if (id != 0) {
                req.setAttribute("confirmation", "Your account has been created successfully!");
            } else {
                req.setAttribute("confirmation", "Your account was unable to be created. Please try again.");
            }
        } else {
            req.setAttribute("confirmation", "Passwords to not match.");
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("/signup.jsp");
        dispatcher.forward(req, resp);
    }

}