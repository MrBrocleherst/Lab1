package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class VillageTest {

    @Test
    void testSetName() {
        Village village = new Village("Зелене", 500, 20.5);

        village.setName("Смарагдове");
        assertEquals("Смарагдове", village.getName());
    }

    @Test
    void testSetPopulation() {
        Village village = new Village("Зелене", 500, 20.5);

        village.setPopulation(600);
        assertEquals(600, village.getPopulation());
    }

    @Test
    void testSetArea() {
        Village village = new Village("Зелене", 500, 20.5);

        village.setArea(25.0);
        assertEquals(25.0, village.getArea());
    }

    @Test
    void testCalculateDensity() {
        Village village = new Village("Зелене", 500, 20.5);
        double expectedDensity = 500 / 20.5;
        assertEquals(expectedDensity, LocalityUtils.calculateDensity(village));
    }

    @Test
    void testIllegalArgumentExceptionOnInvalidPopulation() {
        Village village = new Village("Зелене", 500, 20.5);

        assertThrows(IllegalArgumentException.class, () -> village.setPopulation(-100));
    }
}
