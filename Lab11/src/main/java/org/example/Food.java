package org.example;

public class Food {
    private String name;
    private int calories;
    private double weight;

    public Food(String name, int calories, double weight) {
        this.name = name;
        this.calories = calories;
        this.weight = weight;
    }

    public String getName() { return name; }
    public int getCalories() { return calories; }
    public double getWeight() { return weight; }

    public void cook() {
        System.out.println("Готовлю еду");
    }

    public void cook(int minutes) {
        System.out.println("Готовлю " + minutes + " минут");
    }

    public void cook(String method) {
        System.out.println("Готовлю методом " + method);
    }

    public String getTaste() {
        return "Нейтральный вкус";
    }
}
