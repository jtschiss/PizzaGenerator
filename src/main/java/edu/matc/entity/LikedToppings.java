package edu.matc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity(name = "LikedToppings")
@Table(name = "liked_toppings")
public class LikedToppings implements Serializable {
    @Id
    @Column(name = "user_id")
    private int user_id;
    @Id
    @Column(name = "topping_id")
    private int topping_id;

    public LikedToppings() {
    }

    public LikedToppings(int user_id, int topping_id) {
        this.user_id = user_id;
        this.topping_id = topping_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getTopping_id() {
        return topping_id;
    }

    public void setTopping_id(int topping_id) {
        this.topping_id = topping_id;
    }
}
