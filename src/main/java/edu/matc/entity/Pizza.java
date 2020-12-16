package edu.matc.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents the pizza that is generated for the user
 */
public class Pizza {

    private List<Topping> toppings = new ArrayList<>();

    /**
     * Instantiates a new Pizza.
     */
    public Pizza() {

    }

    /**
     * Instantiates a new Pizza.
     *
     * @param toppings the toppings
     */
    public Pizza(List<Topping> toppings) {
        this.toppings = toppings;
    }


    /**
     * Gets toppings.
     *
     * @return the toppings
     */
    public List<Topping> getToppings() {
        return toppings;
    }

    /**
     * Sets toppings.
     *
     * @param toppings the toppings
     */
    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }
}
