package org.example;

// Клас Село (наслідує Settlement)
class Village extends Locality {

    // Конструктор класу
    public Village(String name, int population, double area) {
        // Викликає конструктор батьківського класу Locality
        super(name, population, area);
    }

    // Перевизначаємо метод toString(), щоб гарно виводити інформацію
    @Override
    public String toString() {
        return String.format("🏡 Село: %s\n" +
                        "Населення: %d осіб\n" +
                        "Площа: %f км²\n" + // %f означає 2 знаки після коми
                        "Густота населення: %.2f осіб/км²", // Обчислення густоти населення
                name, population, area, LocalityUtils.calculateDensity(this) // Передаємо поточний об'єкт у метод
        );
    }
}
