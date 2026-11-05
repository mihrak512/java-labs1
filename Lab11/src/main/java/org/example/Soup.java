package org.example;

public class Soup extends Food {
    private String broth;

    public Soup(String name, int calories, double weight, String broth) {
        super(name, calories, weight);
        this.broth = broth;
    }

    @Override
    public String getTaste() {
        return "Вкусный суп";
    }

    public void addIngredient(String ingredient) {
        System.out.println("Добавляю ингредиент: " + ingredient);
    }

    public void addIngredient(String ingredient, int grams) {
        System.out.println("Добавляю " + grams + " г " + ingredient);
    }
}
