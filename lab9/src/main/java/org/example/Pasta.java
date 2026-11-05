package org.example;

class Pasta extends Meal {
    private String type;

    public Pasta(String name, double weight, int cookingTime, String type) {
        super(name, weight, cookingTime);
        this.type = type;
    }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }


    @Override
    public void cook() {
        System.out.println("Готовка: Варится 10 минут");
    }

    @Override
    public int getCaloriesPer100g() {
        return 130;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Тип пасты: " + type);
    }
}