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
import java.util.ArrayList;
import java.util.List;

/**
 * forwards list of all users back to pizza builder page after sign in
 */
@WebServlet(
        name="ForwardUsers",
        urlPatterns = {"/user/forwardUsers"}
)
public class ForwardUsers extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserDao userDao = new UserDao();
        List<User> users = new ArrayList<>();

        users = userDao.getAll();

        req.setAttribute("usersList", users);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/user/pizzaBuilder.jsp");
        dispatcher.forward(req, resp);
    }

}