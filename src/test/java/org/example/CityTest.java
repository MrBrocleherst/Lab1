package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;  // Імпортуємо assertEquals для JUnit

public class CityTest {

    @Test
    void testSetPopulation() {
        City city = new City("TestCity", 500000, 300.5);

        // Змінюємо населення на 600000
        city.setPopulation(600000);

        // Перевіряємо, чи змінилося населення
        assertEquals(600000, city.getPopulation());
    }

}
