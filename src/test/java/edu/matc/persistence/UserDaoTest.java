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

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type User dao test.
 */
class UserDaoTest {

    private final Logger logger = LogManager.getLogger(this.getClass());

    /**
     * The Dao.
     */
    UserDao dao;

    /**
     * Run set up tasks before each test:
     * 1. execute sql which deletes everything from the table and inserts records)
     * 2. Create any objects needed in the tests
     */
    @BeforeEach
    void setUp() {

        Database database = Database.getInstance();
        database.runSQL("cleanRole.sql");

        dao = new UserDao();
    }

    /**
     * Verify successful retrieval of a User
     */
    @Test
    void getByIdSuccess() {
        User retrievedUser = dao.getById(2);
        assertEquals("Herbert", retrievedUser.getUsername());
        assertEquals("12345", retrievedUser.getPassword());
    }

    /**
     * Verify successful insert of a User
     */
    @Test
    void insertSuccess() {
        User newUser = new User("SteveRogers", "iGotTheHammer");
        int id = dao.insert(newUser);
        assertNotEquals(0,id);
        User insertedUser = dao.getById(id);
        assertEquals("SteveRogers", insertedUser.getUsername());
        assertEquals("iGotTheHammer", insertedUser.getPassword());
    }

    /**
     * Verify successful update of a User
     */
    @Test
    void updateSuccess() {
        User userToUpDate = dao.getById(2);
        userToUpDate.setUsername("Bingo");
        dao.saveOrUpdate(userToUpDate);
        User userAfterUpdate = dao.getById(2);
        assertEquals(userAfterUpdate.getUsername(), userToUpDate.getUsername());
    }

//    /**
//     * Verify successful delete of User
//     */
//    @Test
//    void deleteSuccess() {
//        User user = dao.getById(2);
//        dao.delete(user);
//        assertNull(dao.getById(2));
//    }

    /**
     * Verify successful retrieval of all Users
     */
    @Test
    void getAllSuccess() {
        List<User> Users = dao.getAll();
        assertEquals(3, Users.size());
    }

}