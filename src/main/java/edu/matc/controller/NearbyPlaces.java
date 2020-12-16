package edu.matc.controller;

import edu.matc.entity.User;
import edu.matc.entity.placesInfo.Places;
import edu.matc.entity.placesInfo.SimplePlace;
import edu.matc.persistence.UserDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * forwards list of all users back to pizza builder page after sign in
 */
@WebServlet(
        name="NearbyPlaces",
        urlPatterns = {"/user/nearbyPlaces"}
)
public class NearbyPlaces extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String zip = req.getParameter("zipcode");
        String radius = req.getParameter("radius");

        PlaceFinder placeFinder = new PlaceFinder("pizza", zip, radius);
        List<SimplePlace> places = placeFinder.findPlaces();

        req.setAttribute("nearbyPlaces", places);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/user/results.jsp");
        dispatcher.forward(req, resp);
    }

}
