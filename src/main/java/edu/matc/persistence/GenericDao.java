package edu.matc.persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;
import javax.validation.ConstraintViolationException;
import java.util.List;

abstract class GenericDao<E> {

    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();


    /**
     * update E
     * @param e  e to be inserted or updated
     */
    public void saveOrUpdate(E e) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(e);
        transaction.commit();
        session.close();
    }

    /**
     * insert E
     * @param e  E to be inserted
     */
    public int insert(E e) {
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(e);
        transaction.commit();
        session.close();
        return id;
    }

    /**
     * Delete a E
     * @param e E to be deleted
     */
    public void delete(E e) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(e);
        transaction.commit();
        session.close();
    }

}
