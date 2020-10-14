package edu.matc.persistence;

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

public class UserDao {

    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    /**
     * Get User by id
     */
    public User getById(int id) {
        Session session = sessionFactory.openSession();
        User user = session.get( User.class, id );
        session.close();
        return user;
    }

    /**
     * update User
     * @param User  User to be inserted or updated
     */
    public void saveOrUpdate(User User) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(User);
        transaction.commit();
        session.close();
    }

    /**
     * insert User
     * @param book  User to be inserted
     */
    public int insert(User book) {
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(book);
        transaction.commit();
        session.close();
        return id;
    }

    /**
     * Delete a User
     * @param book User to be deleted
     */
    public void delete(User book) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(book);
        transaction.commit();
        session.close();
    }


    /** Return a list of all Users
     *
     * @return All Users
     */
    public List<User> getAll() {

        Session session = sessionFactory.openSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<User> query = builder.createQuery( User.class );
        Root<User> root = query.from( User.class );
        List<User> books = session.createQuery( query ).getResultList();

        session.close();

        return books;
    }

}
