package org.example;

public class Main {
    public static void main(String[] args) {
        Planet earth   = new Planet("Земля",    12742, 1);
        Planet mars    = new Planet("Марс",      6779, 2);
        Planet jupiter = new Planet("Юпитер",  139820, 79);
        Planet saturn  = new Planet("Сатурн",  116460, 83);

        System.out.println("+------------+--------------+-----------+");
        System.out.printf("| %-10s | %-12s | %-9s |%n",
                "Планета", "Диаметр", "Спутники");
        System.out.println("+------------+--------------+-----------+");

        Planet[] planets = { earth, mars, jupiter, saturn };
        for (Planet p : planets) {
            System.out.printf("| %-10s | %10.0f км | %9d |%n",
                    p.getName(), p.getDiameter(), p.getMoons());
        }
        System.out.println("+------------+--------------+-----------+");

        System.out.println("\nВсего планет: " + Planet.getTotalPlanets());
        System.out.println("Всего спутников: " + Planet.getTotalMoons());
        System.out.printf("Среднее число спутников: %.2f%n",
                Planet.getAverageMoons());

        System.out.println("\n--- Создаём ещё одну планету (Нептун) ---");
        Planet neptune = new Planet("Нептун", 49244, 14);

        System.out.println("Всего планет теперь: " + Planet.getTotalPlanets());
        System.out.println("Всего спутников теперь: " + Planet.getTotalMoons());
        System.out.printf("Новое среднее число спутников: %.2f%n",
                Planet.getAverageMoons());

        System.out.println("\n--- У Земли добавили 1 спутник (через сеттер) ---");
        earth.setMoons(2);
        System.out.println("Спутников у Земли: " + earth.getMoons());
        System.out.println("Всего спутников: " + Planet.getTotalMoons());
        System.out.printf("Среднее: %.2f%n", Planet.getAverageMoons());

        System.out.println("\n(последняя созданная планета: " + neptune.getName() + ")");
        mars.test1();

    }
}