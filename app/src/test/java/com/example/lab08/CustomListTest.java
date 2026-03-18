package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    void testDelete() {
        CustomList cityList = new CustomList();
        City city = new City("Regina", "Saskatchewan");
        cityList.addCity(city);
        assertTrue(cityList.hasCity(city));
        cityList.deleteCity(city);
        assertFalse(cityList.hasCity(city));
    }

    @Test
    void testCountCities() {
        CustomList cityList = new CustomList();
        assertEquals(0, cityList.countCities());

        City city = new City("Regina", "Saskatchewan");
        cityList.addCity(city);
        assertEquals(1, cityList.countCities());

        cityList.deleteCity(city);
        assertEquals(0, cityList.countCities());
    }
}
