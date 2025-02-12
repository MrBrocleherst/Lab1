package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TownTest {

    @Test
    void testTownCreation() {
        Town town = new Town("Березівка", 3000, 15.5);

        assertEquals("Березівка", town.getName());
        assertEquals(3000, town.getPopulation());
        assertEquals(15.5, town.getArea(), 0.01);
    }
}
