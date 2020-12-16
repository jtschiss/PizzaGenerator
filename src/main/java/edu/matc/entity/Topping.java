package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * This class is a topping entity
 *
 * @author jtschissel
 * @version 1.0
 */
@Entity(name = "Topping")
@Table(name = "toppings")
public class Topping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    private int id;
    @Column(name = "topping")
    private String topping;
    @Column(name = "popularity")
    private int popularity;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "toppings")
    private Set<User> users = new HashSet<>();

    /**
     * Instantiates a new Topping.
     */
    public Topping() {
    }

    /**
     * Instantiates a new Topping.
     *
     * @param topping    the topping
     * @param popularity the popularity
     */
    public Topping(String topping, int popularity) {
        this.topping = topping;
        this.popularity = popularity;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets topping.
     *
     * @return the topping
     */
    public String getTopping() {
        return topping;
    }

    /**
     * Sets topping.
     *
     * @param topping the topping
     */
    public void setTopping(String topping) {
        this.topping = topping;
    }

    /**
     * Gets popularity.
     *
     * @return the popularity
     */
    public int getPopularity() {
        return popularity;
    }

    /**
     * Sets popularity.
     *
     * @param popularity the popularity
     */
    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    /**
     * Gets users.
     *
     * @return the users
     */
    public Set<User> getUsers() {
        return users;
    }

    /**
     * Sets users.
     *
     * @param users the users
     */
    public void setUsers(Set<User> users) {
        this.users = users;
    }
}