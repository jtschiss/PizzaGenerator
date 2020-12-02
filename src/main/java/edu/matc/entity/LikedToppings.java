package edu.matc.entity;

import java.util.ArrayList;
import java.util.List;

public class LikedToppings {

    private List<String> likedToppings = new ArrayList<String>();

    public LikedToppings() {

    }

    public void setLikedToppings(List<String> likedToppings) {
        this.likedToppings = likedToppings;
    }

    public List<String> getLikedToppings() {
        return likedToppings;
    }
}
