package edu.matc.persistence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZipCodeAPIDaoTest {

    @Test
    void getZipCodeInfo() {
        ZipCodeAPIDao zipCodeAPIDao = new ZipCodeAPIDao();
        assertEquals("Madison", zipCodeAPIDao.getZipCodeInfo("53713").getCity());
    }
}