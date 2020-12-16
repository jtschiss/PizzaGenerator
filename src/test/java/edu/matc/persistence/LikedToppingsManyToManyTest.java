package edu.matc.persistence;

import edu.matc.entity.Topping;
import edu.matc.entity.User;
import edu.matc.testUtils.Database;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LikedToppingsManyToManyTest {

    private final Logger logger = LogManager.getLogger(this.getClass());

    UserDao dao;
    ToppingDao toppingDao;
    LikedToppingsDao likedToppingsDao;

    /**
     * Run set up tasks before each test:
     * 1. execute sql which deletes everything from the table and inserts records)
     * 2. Create any objects needed in the tests
     */
    @BeforeEach
    void setUp() {

        Database database = Database.getInstance();
        database.runSQL("cleanToppings.sql");

        dao = new UserDao();
        toppingDao = new ToppingDao();
        likedToppingsDao = new LikedToppingsDao();
    }

    @Test
    void updateToppings() {
        Set<Topping> toppings = new HashSet<>();
        Topping pepperoni = toppingDao.getByName("Black Olives");
        Topping sausage = toppingDao.getByName("Feta Cheese");
        Topping cheese = toppingDao.getByName("Ham");
        User user = dao.getById(2);
        toppings.add(pepperoni);
        toppings.add(sausage);
        toppings.add(cheese);

        user.setToppings(toppings);

        dao.saveOrUpdate(user);
        User updatedUser = dao.getById(2);
        logger.info("liked toppings:" + updatedUser.getToppings().toString());

    }

    @Test
    void getAllUsersLikedToppings() {
        User user = dao.getById(3);
        List<String> toppings = likedToppingsDao.getLikedToppingsByUser(user);
        logger.info("Liked Toppings: {}", toppings);
    }
}
