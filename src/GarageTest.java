package com.rakovets.course.javabasics.practice.jcf.map;

import com.rakovets.course.javabasics.example.collections.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GarageTest {
    @Test
    void parkTest() {
        Map<String, List<Car>> map = new HashMap<>();
        Garage garage = new Garage(map);
        garage.park(new Sedan("Opel", "Vectra", "blue", 2008, "1234-AX-7"));
        garage.park(new Sedan("Opel", "Vectra", "black", 2004,"2345-HH-7"));
        garage.park(new Sedan("Audi", "A6", "white", 2010,"1259-KE-5"));
        garage.park(new Sedan("Audi", "A6", "black", 2012, "0987-KK-3"));
        garage.park(new Crossover("Kia","Sportage", "red", 2018, "8765-AA-2"));
        garage.park(new Coupe("Audi", "A5", "silver", 2017, "5667-BB-7"));
        garage.park(new Pickup("Nissan", "Navara", "black", 2000, "4567-BB-6"));
        Assertions.assertEquals(2, garage.getCount("Opel", "Vectra"));
        Assertions.assertEquals(2,garage.getCount("Audi", "A6"));
        Assertions.assertEquals(1,garage.getCount("Kia", "Sportage"));
        garage.leave(new Crossover("Kia", "Sportage", "red", 2018, "8765-AA-2"));
        Assertions.assertEquals(0, garage.getCount("Kia", "Sportage"));
        Assertions.assertEquals("Car: brand: Opel, model: Vectra, color: blue, year: 2008, registration number 1234-AX-7." ,garage.getByRegistrationNumber("1234-AX-7"));
        Assertions.assertTrue(garage.isExist("0987-KK-3"));
        Assertions.assertFalse(garage.isExist("8765-AA-2"));
        Assertions.assertTrue(garage.isExist("Nissan", "Navara", "4567-BB-6"));
    }
}

