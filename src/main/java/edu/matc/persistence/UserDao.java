package edu.matc.persistence;

import edu.matc.entity.Role;
import edu.matc.entity.Topping;
import edu.matc.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * The type User dao.
 */
public class UserDao extends GenericDao<User> {

    private final Logger logger = LogManager.getLogger(this.getClass());
    /**
     * The Session factory.
     */
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    /**
     * Get User by id
     *
     * @param id the id
     * @return the by id
     */
    public User getById(int id) {
        Session session = sessionFactory.openSession();
        User user = session.get( User.class, id );
        session.close();
        return user;
    }

    /**
     * Gets by name.
     *
     * @param name the name
     * @return the by name
     */
    public User getByName(String name) {
        Session session = sessionFactory.openSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<User> query = builder.createQuery( User.class );
        Root<User> root = query.from( User.class );
        query.select(root).where(builder.equal(root.get("username"), name));
        List<User> users = session.createQuery( query ).getResultList();

        session.close();
        return users.get(0);
    }

    /**
     * Add user int.
     *
     * @param user the user
     * @return the int
     */
    public int addUser(User user) {
        int id = insert(user);
        Role role = new Role(user, "user", user.getUsername());
        UserRoleDao roleDao = new UserRoleDao();
        roleDao.insert(role);
        return id;
    }

    public void delete(User user) {
        logger.info("This a temporary method to override the generic dao");
    }

    /**
     * Return a list of all Users
     *
     * @return All Users
     */
    public List<User> getAll() {

        Session session = sessionFactory.openSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<User> query = builder.createQuery( User.class );
        Root<User> root = query.from( User.class );
        List<User> users = session.createQuery( query ).getResultList();

        session.close();

        return users;
    }

}
