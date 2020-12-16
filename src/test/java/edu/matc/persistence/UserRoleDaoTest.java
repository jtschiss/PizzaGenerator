package edu.matc.persistence;

import edu.matc.entity.Role;
import edu.matc.entity.User;
import edu.matc.testUtils.Database;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type User role dao test.
 */
class UserRoleDaoTest {

    private final Logger logger = LogManager.getLogger(this.getClass());

    /**
     * The Dao.
     */
    UserRoleDao dao;
    /**
     * The User dao.
     */
    UserDao userDao;

    /**
     * Run set up tasks before each test:
     * 1. execute sql which deletes everything from the table and inserts records)
     * 2. Create any objects needed in the tests
     */
    @BeforeEach
    void setUp() {

        Database database = Database.getInstance();
        database.runSQL("cleanRole.sql");

        dao = new UserRoleDao();
        userDao = new UserDao();
    }

    /**
     * Gets by role id.
     */
    @Test
    void getByRoleId() {
        Role retrievedRole = dao.getById(3);
        assertEquals(3, retrievedRole.getId());
        assertEquals("test", retrievedRole.getRoleName());
    }

    /**
     * Gets all test.
     */
    @Test
    void getAllTest() {
        List<Role> roles = dao.getAll();
        assertEquals(4, roles.size());
    }

    /**
     * Insert success.
     */
    @Test
    void insertSuccess() {
        User user = userDao.getById(3);
        Role newRole = new Role(user, "user", user.getUsername());
        int id = dao.insert(newRole);
        Role insertedRole = dao.getById(id);
        assertEquals(insertedRole.getUsername(), insertedRole.getUser().getUsername());
        assertEquals("user", insertedRole.getRoleName());
    }

    /**
     * Delete success.
     */
    @Test
    void deleteSuccess() {
        dao.delete(dao.getById(4));
        assertNull(dao.getById(4));
    }

    /**
     * Save or update success.
     */
    @Test
    void saveOrUpdateSuccess() {
        Role role = dao.getById(4);
        role.setRoleName("user");
        dao.saveOrUpdate(role);
        Role afterRole = dao.getById(4);
        assertEquals(role.getRoleName(), afterRole.getRoleName());
    }

}