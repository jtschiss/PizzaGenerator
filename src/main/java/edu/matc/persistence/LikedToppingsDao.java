package edu.matc.persistence;

import edu.matc.entity.LikedToppings;
import edu.matc.entity.Topping;
import edu.matc.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.query.Query;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class LikedToppingsDao extends GenericDao<LikedToppings> {

    private final Logger logger = LogManager.getLogger(this.getClass());

    public List<String> getLikedToppingsByUser(User user) {
        Session session = sessionFactory.openSession();
        String hql = "SELECT T.topping FROM edu.matc.entity.Topping T LEFT JOIN edu.matc.entity.LikedToppings LT on T.id = LT.topping_id JOIN edu.matc.entity.User U on U.id = LT.user_id WHERE U.id = :id";
        Query query = session.createQuery(hql);
        query.setParameter("id", user.getId());
        List results = query.list();
        session.close();
        return results;
    }
}
