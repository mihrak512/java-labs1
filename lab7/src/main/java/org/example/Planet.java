package org.example;

public class Planet {
    private String name;
    private double diameter;
    private int moons;

    private static int totalPlanets = 0;
    private static int totalMoons = 0;


    public Planet(String name, double diameter, int moons) {
        this.name = name;
        this.diameter = diameter;
        this.moons = moons;

        totalPlanets++;
        totalMoons += moons;
    }

    public String getName()      { return name; }
    public double getDiameter()  { return diameter; }
    public int getMoons()        { return moons; }

    public static int getTotalPlanets() { return totalPlanets; }
    public static int getTotalMoons()   { return totalMoons; }

    public void setName(String name)         { this.name = name; }
    public void setDiameter(double diameter) { this.diameter = diameter; }

    public void setMoons(int moons) {
        totalMoons -= this.moons;
        this.moons = moons;
        totalMoons += moons;
    }
    public static void test(){
        System.out.println(getTotalMoons() + getTotalPlanets());
    }

    public void test1(){
        System.out.println(name + diameter + moons + totalPlanets + totalMoons);
    }
/*
Planet p1 = new Planet("qwert", 40.4, 34);
p1.test1();
Planet.test();
 */
    public static double getAverageMoons() {
        if (totalPlanets == 0) {
            return 0;
        }
        return (double) totalMoons / totalPlanets;
    }

    @Override
    public String toString() {
        return String.format("%-10s | %12.0f км | %2d спутн.",
                name, diameter, moons);
    }
}