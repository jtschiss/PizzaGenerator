package edu.matc.persistence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Zip code api dao test.
 */
class ZipCodeAPIDaoTest {

    /**
     * Gets zip code info.
     */
    @Test
    void getZipCodeInfo() {
        ZipCodeAPIDao zipCodeAPIDao = new ZipCodeAPIDao();
        assertEquals("Madison", zipCodeAPIDao.getZipCodeInfo("53713").getCity());
    }
}