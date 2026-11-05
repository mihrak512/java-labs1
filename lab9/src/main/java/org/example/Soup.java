package org.example;

class Soup extends Meal {
    private String ingredients;

    public Soup(String name, double weight, int cookingTime, String ingredients) {
        super(name, weight, cookingTime);
        this.ingredients = ingredients;
    }

    public String getIngredients() { return ingredients; }
    public void setIngredients(String ingredients) { this.ingredients = ingredients; }

    @Override
    public void cook() {
        System.out.println("Готовка: Варится 40 минут");
    }

    @Override
    public int getCaloriesPer100g() {
        return 50;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ингредиенты: " + ingredients);
    }
}