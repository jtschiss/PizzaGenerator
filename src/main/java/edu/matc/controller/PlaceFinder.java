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

public class PlaceFinder {

    private final Logger logger = LogManager.getLogger(this.getClass());

    private String poi;
    private String zip;
    private String radius;

    public PlaceFinder() {
    }

    public PlaceFinder(String poi, String zip, String radius) {
        this.poi = poi;
        this.zip = zip;
        this.radius = radius;
    }


    public List<SimplePlace> findPlaces() {

        ZipCodeAPIDao zipDao = new ZipCodeAPIDao();
        ZipCode zipCode = zipDao.getZipCodeInfo(this.zip);

        int miles = Integer.parseInt(this.radius)*1609;

        PlacesAPIDao placesDao = new PlacesAPIDao();
        Places placesList = placesDao.getPlacesInfo(this.poi, zipCode.getLat(), zipCode.getLng(), miles);

        List<SimplePlace> places = simplifyPlaces(placesList);
        return places;
    }

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

    public String getPoi() {
        return poi;
    }

    public void setPoi(String poi) {
        this.poi = poi;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getRadius() {
        return radius;
    }

    public void setRadius(String radius) {
        this.radius = radius;
    }
}
