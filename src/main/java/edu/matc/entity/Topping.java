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

    public Topping() {
    }

    public Topping(String topping, int popularity) {
        this.topping = topping;
        this.popularity = popularity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}