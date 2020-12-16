package edu.matc.controller;

import edu.matc.entity.Pizza;
import edu.matc.entity.Topping;
import edu.matc.entity.User;
import edu.matc.persistence.ToppingDao;
import edu.matc.persistence.UserDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * forwards list of all users back to pizza builder page after sign in
 */
@WebServlet(
        name="BuildPizza",
        urlPatterns = {"/user/buildPizza"}
)
public class BuildPizza extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserDao userDao = new UserDao();
        List<User> usersList = new ArrayList<>();
        List<String> users = new ArrayList<String>();
        if(req.getParameterValues("users[]") != null){
            users = Arrays.asList(req.getParameterValues("users[]"));
        }

        User userToAdd;
        for(String user : users) {
            userToAdd = userDao.getByName(user);
            usersList.add(userToAdd);
        }

        ToppingDao toppingDao = new ToppingDao();
        List<Topping> toppings = toppingDao.getAll();
        List<String> stringToppings = new ArrayList<>();
        for(Topping topping : toppings) {
            stringToppings.add(topping.getTopping());
        }
        List<Topping> userLikedToppings;
        List<String> stringUserToppings;
        for(User user : usersList) {
            userLikedToppings = new ArrayList<>(user.getToppings());
            stringUserToppings = new ArrayList<>();
            for (Topping topping : userLikedToppings) {
                stringUserToppings.add(topping.getTopping());
            }
            stringToppings.retainAll(stringUserToppings);
        }

        List<Topping> pizzaToppings = new ArrayList<>();

        for(String topping: stringToppings) {
            pizzaToppings.add(toppingDao.getByName(topping));
        }

        Pizza pizza = new Pizza(pizzaToppings);

        req.setAttribute("pizza", pizza);
        req.setAttribute("usersList", usersList);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/user/results.jsp");
        dispatcher.forward(req, resp);
    }

}