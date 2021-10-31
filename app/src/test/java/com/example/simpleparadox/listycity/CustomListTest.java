package com.example.simpleparadox.listycity;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    @BeforeEach
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Jasper", "AB"));
        assertEquals(list.getCount(), listSize + 1);
    }

    @Test
    public void testHasCity() {
        City city = new City("Jasper", "AB");
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

    @Test
    public void testDelete(){
        City city = new City("Jasper", "AB");
        list.addCity(city);
        list.delete(city);
        assertFalse(list.hasCity(city));
    }



}