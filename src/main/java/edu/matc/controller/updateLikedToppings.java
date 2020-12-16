package edu.matc.controller;

import edu.matc.entity.Topping;
import edu.matc.entity.User;
import edu.matc.persistence.ToppingDao;
import edu.matc.persistence.UserDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

/**
 * updates the user's liked toppings
 */
@WebServlet(
        name="UpdateLikedToppings",
        urlPatterns = {"/updateLikedToppings"}
)
public class updateLikedToppings extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> toppings = new ArrayList<String>();
        if(req.getParameterValues("toppings[]") != null){
            toppings = Arrays.asList(req.getParameterValues("toppings[]"));
        }

        UserDao userDao = new UserDao();
        ToppingDao toppingDao = new ToppingDao();
        User user = userDao.getByName(req.getRemoteUser());
        Set<Topping> likedToppings = new HashSet<>();
        for(String topping : toppings) {
            Topping toppingToAdd = toppingDao.getByName(topping);
            likedToppings.add(toppingToAdd);
        }
        user.setToppings(likedToppings);


        userDao.saveOrUpdate(user);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/user/profile");
        dispatcher.forward(req, resp);
    }

}