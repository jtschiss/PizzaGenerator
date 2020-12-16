package edu.matc.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.matc.entity.zipCodeInfo.ZipCode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import edu.matc.utilities.PropertiesLoader;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.util.Properties;

/**
 * The type Zip code api dao.
 *
 */
public class ZipCodeAPIDao {

    /**
     * The Loader.
     */
    PropertiesLoader loader = new PropertiesLoader();
    /**
     * The Properties.
     */
    Properties properties = loader.loadProperties();
    private final Logger logger = LogManager.getLogger(this.getClass());
    private final String key = properties.getProperty("zipCodeAPIKey");

    /**
     * Gets zip codes by radius.
     *
     * @param zipCode the zip code
     * @return zipcodes zip code info
     */
    public ZipCode getZipCodeInfo(String zipCode) {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("http://www.zipcodeapi.com/rest/"+key+"/info.json/"+zipCode+"/degrees");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        ZipCode zipCodeResult = null;
        try {
            zipCodeResult = mapper.readValue(response, ZipCode.class);
        } catch (JsonProcessingException e) {
            logger.error("ZipCodeAPIDao mapper.readValue() error: " + e);
        }
        return zipCodeResult;
    }
}
