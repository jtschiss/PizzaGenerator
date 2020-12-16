package edu.matc.persistence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlacesAPIDaoTest {

    @Test
    void getPlacesInfo() {
        PlacesAPIDao dao = new PlacesAPIDao();
        String poi = "outdoor restaurant";
        double lat = 43.0324;
        double lng = -89.3843;
        int radius = 600;

        assertEquals("Milio's", dao.getPlacesInfo(poi,lat,lng,radius).getResults().get(0).getPoi().getName());
    }
}