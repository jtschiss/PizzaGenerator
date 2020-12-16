package edu.matc.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.matc.entity.placesInfo.Places;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import edu.matc.utilities.PropertiesLoader;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.util.Properties;


/**
 * The type Places api dao.
 */
public class PlacesAPIDao {

    PropertiesLoader loader = new PropertiesLoader();
    Properties properties = loader.loadProperties();
    private final Logger logger = LogManager.getLogger(this.getClass());
    private final String key = properties.getProperty("placesAPIKey");

    /**
     * Gets places info.
     *
     * @param poi    the poi
     * @param lat    the lat
     * @param lng    the lng
     * @param radius the radius
     * @return the places info
     */
    public Places getPlacesInfo(String poi, double lat, double lng, int radius) {
        Client client = ClientBuilder.newClient();
        logger.info("api key: " + key);
        WebTarget target =
                client.target("https://api.tomtom.com/search/2/search/"+poi+".json?&countrySet=US&&lat="+lat+"&lon="+lng+"&radius="+radius+"&idxSet=POI,addr&key="+key);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        Places places = null;
        try {
            places = mapper.readValue(response, Places.class);
        } catch (JsonProcessingException e) {
            logger.error("PlacesAPIDao mapper.readValue() error: " + e);
        }
        return places;
    }

}