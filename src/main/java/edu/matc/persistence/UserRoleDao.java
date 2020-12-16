package edu.matc.persistence;

import edu.matc.entity.Role;
import edu.matc.entity.Role;
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

public class UserRoleDao extends GenericDao<Role> {

    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    /**
     * Get role by id
     */
    public Role getById(int id) {
        Session session = sessionFactory.openSession();
        Role role = session.get( Role.class, id);
        session.close();
        return role;
    }


    /** Return a list of all Roles
     *
     * @return All Roles
     */
    public List<Role> getAll() {

        Session session = sessionFactory.openSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Role> query = builder.createQuery( Role.class );
        Root<Role> root = query.from( Role.class );
        List<Role> roles = session.createQuery( query ).getResultList();
        session.close();

        return roles;
    }

}
