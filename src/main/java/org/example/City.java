package org.example;

class City extends Locality {

    public City(String name, int population, double area) {
        super(name, population, area);
    }

    @Override
    public String toString() {
        return String.format("Місто: %s\n" +
                        "Населення: %d осіб\n" +
                        "Площа: %f км²\n" +
                        "Густота населення: %.2f осіб/км²",
                name, population, area, LocalityUtils.calculateDensity(this)
        );
    }
}