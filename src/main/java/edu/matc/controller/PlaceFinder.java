package edu.matc.controller;

import edu.matc.entity.placesInfo.Places;
import edu.matc.entity.placesInfo.ResultsItem;
import edu.matc.entity.placesInfo.SimplePlace;
import edu.matc.entity.zipCodeInfo.ZipCode;
import edu.matc.persistence.PlacesAPIDao;
import edu.matc.persistence.ZipCodeAPIDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * finds places of interest within a radius of a zip code
 */
public class PlaceFinder {

    private final Logger logger = LogManager.getLogger(this.getClass());

    private String poi;
    private String zip;
    private String radius;

    /**
     * Instantiates a new Place finder.
     */
    public PlaceFinder() {
    }

    /**
     * Instantiates a new Place finder.
     *
     * @param poi    the poi
     * @param zip    the zip
     * @param radius the radius
     */
    public PlaceFinder(String poi, String zip, String radius) {
        this.poi = poi;
        this.zip = zip;
        this.radius = radius;
    }


    /**
     * Finds places based on poi, zip code, and radius
     *
     * @return the list
     */
    public List<SimplePlace> findPlaces() {

        ZipCodeAPIDao zipDao = new ZipCodeAPIDao();
        ZipCode zipCode = zipDao.getZipCodeInfo(this.zip);

        int miles = Integer.parseInt(this.radius)*1609;

        PlacesAPIDao placesDao = new PlacesAPIDao();
        Places placesList = placesDao.getPlacesInfo(this.poi, zipCode.getLat(), zipCode.getLng(), miles);

        List<SimplePlace> places = simplifyPlaces(placesList);
        return places;
    }

    /**
     * takes data from places and simplifies it down to a simplified place
     * containing name, address, phone number, and website
     *
     * @param placesList the places list
     * @return the list
     */
    public List<SimplePlace> simplifyPlaces(Places placesList) {
        List<SimplePlace> places = new ArrayList<>();
        SimplePlace simplePlace;
        for(ResultsItem place : placesList.getResults()){
            String name = place.getPoi().getName();
            String address = place.getAddress().getFreeformAddress();
            String phone = place.getPoi().getPhone();
            String website = place.getPoi().getUrl();
            simplePlace = new SimplePlace(name, address, phone, website);
            places.add(simplePlace);
        }
        return places;
    }

    /**
     * Gets poi.
     *
     * @return the poi
     */
    public String getPoi() {
        return poi;
    }

    /**
     * Sets poi.
     *
     * @param poi the poi
     */
    public void setPoi(String poi) {
        this.poi = poi;
    }

    /**
     * Gets zip.
     *
     * @return the zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets zip.
     *
     * @param zip the zip
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * Gets radius.
     *
     * @return the radius
     */
    public String getRadius() {
        return radius;
    }

    /**
     * Sets radius.
     *
     * @param radius the radius
     */
    public void setRadius(String radius) {
        this.radius = radius;
    }
}
