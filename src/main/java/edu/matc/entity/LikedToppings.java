package edu.matc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * The type Liked toppings.
 */
@Entity(name = "LikedToppings")
@Table(name = "liked_toppings")
public class LikedToppings implements Serializable {
    @Id
    @Column(name = "user_id")
    private int user_id;
    @Id
    @Column(name = "topping_id")
    private int topping_id;

    /**
     * Instantiates a new Liked toppings.
     */
    public LikedToppings() {
    }

    /**
     * Instantiates a new Liked toppings.
     *
     * @param user_id    the user id
     * @param topping_id the topping id
     */
    public LikedToppings(int user_id, int topping_id) {
        this.user_id = user_id;
        this.topping_id = topping_id;
    }

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public int getUser_id() {
        return user_id;
    }

    /**
     * Sets user id.
     *
     * @param user_id the user id
     */
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    /**
     * Gets topping id.
     *
     * @return the topping id
     */
    public int getTopping_id() {
        return topping_id;
    }

    /**
     * Sets topping id.
     *
     * @param topping_id the topping id
     */
    public void setTopping_id(int topping_id) {
        this.topping_id = topping_id;
    }
}
