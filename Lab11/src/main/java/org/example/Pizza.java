package org.example;

public class Pizza extends Food {
    private String topping;

    public Pizza(String name, int calories, double weight, String topping) {
        super(name, calories, weight);
        this.topping = topping;
    }

    @Override
    public String getTaste() {
        return "Вкусная пицца";
    }

    public void addTopping(String topping) {
        System.out.println("Добавляю начинку: " + topping);
    }

    public void addTopping(String topping, int amount) {
        System.out.println("Добавляю " + amount + " порций начинки: " + topping);
    }
}
