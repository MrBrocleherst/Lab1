package org.example;

// Абстрактний клас, який описує населений пункт
public abstract class Locality {

    protected static final LocalityUtils utils = new LocalityUtils();

    protected String name;
    protected int population;
    protected double area;

    // Конструктор класу
    public Locality (String name, int population, double area) {
        this.name = name;
        this.population = population;
        this.area = area;
    }


    // Геттери
    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public double getArea() {
        return area;
    }

    // Сеттери
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Назва не може бути порожньою!");
        }
    }

    public void setPopulation(int population) {
        if (population >= 0) {
            this.population = population;
        } else {
            System.out.println("Населення не може бути від'ємним!");
        }
    }

    public void setArea(double area) {
        if (area > 0) {
            this.area = area;
        } else {
            System.out.println("Площа повинна бути більше 0!");
        }
    }

}
