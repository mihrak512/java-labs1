package org.example;

public class Chair extends Furniture {
    private boolean backrest;

    public Chair(String name, String material, double price, boolean backrest) {
        super(name, material, price);
        this.backrest = backrest;
    }

    public boolean isBackrest()               { return backrest; }
    public void setBackrest(boolean backrest) { this.backrest = backrest; }

    @Override
    public String getPurpose() {
        return "Для сидения";
    }

    public void adjustHeight() {
        System.out.println("  >> Стул \"" + getName() + "\" регулируется по высоте.");
    }

    @Override
    public void displayInfo() {
        System.out.printf("%-12s | %-10s | %10.2f руб. | %s | спинка: %s%n",
                getName(), getMaterial(), getPrice(), getPurpose(),
                backrest ? "есть" : "нет");
    }
}