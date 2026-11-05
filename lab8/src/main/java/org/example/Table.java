package org.example;

public class Table extends Furniture {
    private int legs;

    public Table(String name, String material, double price, int legs) {
        super(name, material, price);
        this.legs = legs;
    }

    public int getLegs()         { return legs; }
    public void setLegs(int legs){ this.legs = legs; }

    @Override
    public String getPurpose() {
        return "Служит поверхностью";
    }

    public void fold() {
        System.out.println("  >> Стол \"" + getName() + "\" складывается.");
    }

    @Override
    public void displayInfo() {
        System.out.printf("%-12s | %-10s | %10.2f руб. | %s | ножек: %d%n",
                getName(), getMaterial(), getPrice(), getPurpose(), legs);
    }
}