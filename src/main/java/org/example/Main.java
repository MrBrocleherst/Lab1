package org.example;

public class Main {
    public static void main(String[] args) {
        // Масив населених пунктів (поліморфізм)
        Locality[] localities = {
                new City("Kyiv", 3000000, 839.00),
                new City("New York", 5000000, 990.00),
                new City("Lviv", 720000, 182.00),
                new Town("Odesa", 1010000, 236.90),
                new Town("Dnipro", 980000, 405.00),
                new Town("Kharkiv", 1400000, 350.00),
                new Town("Zaporizhzhia", 710000, 334.00),
                new Village("Vinnytsia", 370000, 113.00),
                new Village("Poltava", 280000, 112.00),
                new Village("Chernihiv", 285000, 79.00),
        };

       // Виведення початкових даних
        System.out.println("Початкові дані населених пунктів:");
        for (Locality locality : localities) {
            LocalityUtils.displayInfo(locality);
        }

        // Проведення змін у населенні (приріст або відтік)
        System.out.println("\nЗміна населення:");
        LocalityUtils.changePopulation(localities[0], -50000); // Відтік 50 тис. з Києва
        LocalityUtils.changePopulation(localities[1],20000);   // Приріст 20 тис. у Львові
        LocalityUtils.changePopulation(localities[2], -100000); // Відтік 100 тис. з Одеси
        LocalityUtils.changePopulation(localities[3],30000);   // Приріст 30 тис. у Дніпрі
        LocalityUtils.changePopulation(localities[4], -50000);  // Відтік 50 тис. з Харкова

        // Проведення перепису населення у кількох містах
        System.out.println("\nПерепис населення:");
        LocalityUtils.conductCensus(localities[0],3100000);  // Нове населення Києва
        LocalityUtils.conductCensus(localities[3],970000);   // Нове населення Дніпра
        LocalityUtils.conductCensus(localities[7],300000);   // Нове населення Полтави

        // Виведення оновлених даних
        System.out.println("\nДані після перепису:");
        for (Locality locality : localities) {
            LocalityUtils.displayInfo(locality);
        }
    }
}