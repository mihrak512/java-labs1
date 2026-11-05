package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("выберите задание:");
        System.out.println("1 - счётчик (Counter)");
        System.out.println("2 - страны (макс. население + столицы)");
        System.out.println("3 - автомобили (только SUV)");
        System.out.print("ваш выбор: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1: {
                Counter counter = new Counter();
                for (int i = 0; i < 5; i++) {
                    counter.increment();
                }
                System.out.println("После 5 increment(): " + counter.getValue());
                for (int i = 0; i < 2; i++) {
                    counter.decrement();
                }
                System.out.println("После 2 decrement(): " + counter.getValue());

                System.out.println("Итоговое значение: " + counter.getValue());
                System.out.println(counter);
                break;
            }

            case 2: {
                Country[] countries = {
                        new Country("Россия",     146_100_000, "Москва"),
                        new Country("Германия",    84_300_000, "Берлин"),
                        new Country("Франция",     68_000_000, "Париж"),
                        new Country("Италия",      59_000_000, "Рим"),
                        new Country("Испания",     47_500_000, "Мадрид")
                };

                System.out.println("+-----------------+--------------+-----------------+");
                System.out.printf("| %-15s | %12s | %-15s |%n",
                        "Страна", "Население", "Столица");
                System.out.println("+-----------------+--------------+-----------------+");

                Country maxPop = countries[0];
                for (Country c : countries) {
                    System.out.printf("| %-15s | %,12d | %-15s |%n",
                            c.getName(), c.getPopulation(), c.getCapital());
                    if (c.getPopulation() > maxPop.getPopulation()) {
                        maxPop = c;
                    }
                }
                System.out.println("+-----------------+--------------+-----------------+");

                System.out.printf("Страна с максимальным населением: %s (%,d чел.)%n",
                        maxPop.getName(), maxPop.getPopulation());

                System.out.println("\nВсе столицы:");
                for (Country c : countries) {
                    System.out.println(" - " + c.getCapital());
                }
                System.out.println(maxPop);
                break;
            }

            case 3: {
                Car[] cars = {
                        new Car("Toyota Camry",    Type.SEDAN),
                        new Car("BMW X5",          Type.SUV),
                        new Car("Volkswagen Golf", Type.HATCHBACK),
                        new Car("Audi TT",         Type.COUPE),
                        new Car("Mercedes GLE",    Type.SUV),
                        new Car("Mazda MX-5",      Type.CONVERTIBLE)
                };

                System.out.println("Все автомобили:");
                System.out.println("+-----------------+--------------+");
                System.out.printf("| %-15s | %-12s |%n", "Модель", "Тип");
                System.out.println("+-----------------+--------------+");
                for (Car c : cars) {
                    System.out.printf("| %-15s | %-12s |%n",
                            c.getModel(), c.getType());
                }
                System.out.println("+-----------------+--------------+");

                System.out.println("\nАвтомобили типа SUV:");
                for (Car c : cars) {
                    if (c.getType() == Type.SUV) {
                        System.out.println(" - " + c.getModel());
                    }
                }
                break;
            }

            default:
                System.out.println("неверный выбор!");
        }
    }
}