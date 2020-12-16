package edu.matc.persistence;

import edu.matc.entity.Topping;
import org.hibernate.Session;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class ToppingDao extends GenericDao<Topping> {


    /**
     * Get Topping by id
     */
    public Topping getById(int id) {
        Session session = sessionFactory.openSession();
        Topping topping = session.get( Topping.class, id );
        session.close();
        return topping;
    }

    /**
     * Get Topping by id
     */
    public Topping getByName(String name) {
        Session session = sessionFactory.openSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Topping> query = builder.createQuery( Topping.class );
        Root<Topping> root = query.from( Topping.class );
        query.select(root).where(builder.equal(root.get("topping"), name));
        List<Topping> toppings = session.createQuery( query ).getResultList();

        session.close();
        return toppings.get(0);
    }

        /** Return a list of all Toppings
     *
     * @return All Toppings
     */
    public List<Topping> getAll() {

        Session session = sessionFactory.openSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Topping> query = builder.createQuery( Topping.class );
        Root<Topping> root = query.from( Topping.class );
        List<Topping> toppings = session.createQuery( query ).getResultList();

        session.close();

        return toppings;
    }
    
}
