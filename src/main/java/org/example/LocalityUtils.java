package org.example;

public class LocalityUtils {


    // Метод для зміни кількості населення
    public void changePopulation(Locality locality, int value) {
        locality.setPopulation(locality.getPopulation() + value);
        if (locality.getPopulation() < 0)
            locality.setPopulation(0);
        System.out.println("Населення " + locality.getName() + " тепер: " + locality.getPopulation() + " осіб.");
    }

    // Метод для проведення перепису населення
    public void conductCensus(Locality locality, int newPopulation) {
        if (newPopulation >= 0) {
            locality.setPopulation(newPopulation);
            System.out.println("Перепис у " + locality.getName() + " завершено. Нове населення: " + locality.getPopulation() + " осіб.");
        } else {
            System.out.println("Помилка! Населення не може бути від'ємним.");
        }
    }

    // Метод для обчислення густоти населення
    public double calculateDensity(Locality locality) {
        if (locality.getArea() == 0) return 0;
        return locality.getPopulation() / locality.getArea();
    }


    public void displayInfo(Locality locality){
        System.out.println(locality.toString());
    }

}

