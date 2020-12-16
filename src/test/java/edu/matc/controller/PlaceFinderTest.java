package edu.matc.controller;

import edu.matc.entity.placesInfo.Places;
import edu.matc.entity.placesInfo.SimplePlace;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Place finder test.
 */
class PlaceFinderTest {

    private final Logger logger = LogManager.getLogger(this.getClass());

    /**
     * Find places.
     */
    @Test
    void findPlaces() {
        PlaceFinder placeFinder = new PlaceFinder("pizza", "53925", "3");
        List<SimplePlace> places = placeFinder.findPlaces();
        logger.info("Test Places: " + places.toString());
    }
}