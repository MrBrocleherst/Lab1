package org.example;

// Клас Містечко (наслідує Settlement)
class Town extends Locality {

    // Конструктор класу Town
    public Town(String name, int population, double area) {
        //// Викликає конструктор батьківського класу Locality
        super(name, population, area);
    }

    // Перевизначаємо метод toString(), щоб гарно виводити інформацію
    @Override
    public String toString() {
        return String.format("🌆 Містечко: %s\n" +
                        "Населення: %d осіб\n" +
                        "Площа: %f км²\n" + // %.2f означає 2 знаки після коми
                        "Густота населення: %.2f осіб/км²", // Обчислення густоти населення
                name, population, area, utils.calculateDensity(this) // Передаємо поточний об'єкт у метод
        );
    }
}