package edu.matc.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents the pizza that is generated for the user
 */
public class Pizza {

    private List<Topping> toppings = new ArrayList<>();

    public Pizza() {

    }

    public Pizza(List<Topping> toppings) {
        this.toppings = toppings;
    }


    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }
}
