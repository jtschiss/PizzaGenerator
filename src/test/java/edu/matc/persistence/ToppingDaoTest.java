package edu.matc.persistence;

import edu.matc.entity.Role;
import edu.matc.entity.Topping;
import edu.matc.entity.User;
import edu.matc.testUtils.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ToppingDaoTest {

    ToppingDao dao;

    @BeforeEach
    void setUp() {

        Database database = Database.getInstance();
        database.runSQL("cleanRole.sql");
        database.runSQL("cleanToppings.sql");

        dao = new ToppingDao();
    }

    @Test
    void getToppingById() {
        Topping retrievedTopping = dao.getById(3);
        assertEquals(3, retrievedTopping.getId());
        assertEquals("Sausage", retrievedTopping.getTopping());
    }

    @Test
    void getAll() {
        List<Topping> toppings = dao.getAll();
        assertEquals(17, toppings.size());
    }

    @Test
    void saveOrUpdateSuccess() {
        Topping topping = dao.getById(4);
        topping.setPopularity(10);
        dao.saveOrUpdate(topping);
        Topping afterTopping = dao.getById(4);
        assertEquals(topping.getPopularity(), afterTopping.getPopularity());
    }

//    @Test
//    void deleteSuccess() {
//        dao.delete(dao.getById(4));
//        assertNull(dao.getById(4));
//    }

    @Test
    void insertSuccess() {
        Topping newTopping = new Topping("specialTopping", 0);
        int id = dao.insert(newTopping);
        assertNotEquals(0,id);
        Topping insertedTopping = dao.getById(id);
        assertEquals("specialTopping", insertedTopping.getTopping());
        assertEquals(0, insertedTopping.getPopularity());
    }

    @Test
    void getByNameTest() {
        Topping toppings = dao.getByName("Pepperoni");
        assertEquals("Pepperoni", toppings.getTopping());
    }


}