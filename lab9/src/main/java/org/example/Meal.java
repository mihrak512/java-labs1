package org.example;

abstract class Meal {
    private String name;
    private double weight;
    private int cookingTime;

    public Meal(String name, double weight, int cookingTime) {
        this.name = name;
        this.weight = weight;
        this.cookingTime = cookingTime;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    public int getCookingTime() { return cookingTime; }
    public void setCookingTime(int cookingTime) { this.cookingTime = cookingTime; }

    public abstract void cook();
    public abstract int getCaloriesPer100g();

    public void displayInfo() {
        System.out.println("Блюдо: " + name + " | Вес: " + weight + " г | Время готовки: " + cookingTime + " мин.");
    }
}