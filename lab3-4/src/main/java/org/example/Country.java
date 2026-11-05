package org.example;

public class Country {
    private String name;
    private int population;
    private String capital;

    public Country() {
    }

    public Country(String name, int population, String capital) {
        this.name = name;
        this.population = population;
        this.capital = capital;
    }

    public String getName()       { return name; }
    public int getPopulation()    { return population; }
    public String getCapital()    { return capital; }

    public void setName(String name)         { this.name = name; }
    public void setPopulation(int population) { this.population = population; }
    public void setCapital(String capital)    { this.capital = capital; }

    @Override
    public String toString() {
        return getName() + getPopulation() + getCapital();
    }
}