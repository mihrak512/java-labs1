package org.example;

public class Furniture {
    private String name;
    private String material;
    private double price;

    public Furniture(String name, String material, double price) {
        this.name = name;
        this.material = material;
        this.price = price;
    }

    public String getName()     { return name; }
    public String getMaterial() { return material; }
    public double getPrice()    { return price; }

    public void setName(String name)         { this.name = name; }
    public void setMaterial(String material) { this.material = material; }
    public void setPrice(double price)       { this.price = price; }

    public String getPurpose() {
        return "Мебель общего назначения";
    }

    public void displayInfo() {
        System.out.printf("%-12s | %-10s | %10.2f руб. | %s%n",
                name, material, price, getPurpose());
    }

    @Override
    public String toString() {
        return String.format("%s (%s, %.2f руб.)", name, material, price);
    }
}