package edu.matc.controller;

import edu.matc.entity.LikedToppings;
import edu.matc.entity.Topping;
import edu.matc.entity.User;
import edu.matc.persistence.LikedToppingsDao;
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
import java.util.List;

/**
 * gets a list of the user's liked toppings and all toppings for the profile page
 */
@WebServlet(
        name="Profile",
        urlPatterns = {"/user/profile"}
)
public class Profile extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserDao userDao = new UserDao();
        User user = userDao.getByName(req.getRemoteUser());
        req.setAttribute("user", user);

        LikedToppingsDao LikedToppingsDao = new LikedToppingsDao();
        List<String> likedToppingsList = LikedToppingsDao.getLikedToppingsByUser(user);
        List<String> likedToppings = new ArrayList<>();
        if(!likedToppingsList.isEmpty()){
            for(String topping : likedToppingsList) {
                likedToppings.add(topping);
            }
        }

        req.setAttribute("likedToppings", likedToppings);

        ToppingDao toppingDao = new ToppingDao();
        List<Topping> toppingsList = toppingDao.getAll();
        List<String> toppings = new ArrayList<>();
        for(Topping topping : toppingsList) {
            toppings.add(topping.getTopping());
        }
        req.setAttribute("allToppings", toppings);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/user/profile.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);

    }

}