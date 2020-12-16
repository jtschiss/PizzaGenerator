package edu.matc.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.*;

/**
 * The type Properties loader.
 */
public class PropertiesLoader {

    private Properties properties;
    private final Logger logger = LogManager.getLogger(this.getClass());

    /**
     * Load properties properties.
     *
     * @return the properties
     */
    public Properties loadProperties() {
        properties = new Properties();
        try {
            properties.load(this.getClass().getResourceAsStream("/api.properties"));
        } catch (IOException ioe) {
            logger.error("apis.loadProperties()...Cannot load the properties file: " + ioe);
            //ioe.printStackTrace();
        } catch (Exception e) {
            logger.error("apis.loadProperties()..." + e);
            //e.printStackTrace();
        }
        return properties;
    }
}