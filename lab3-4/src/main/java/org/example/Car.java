package org.example;

public class Car {
    private String model;
    private Type type;

    public Car() {
    }

    public Car(String model, Type type) {
        this.model = model;
        this.type = type;
    }

    public String getModel() { return model; }
    public Type getType()    { return type; }

    public void setModel(String model) { this.model = model; }
    public void setType(Type type)     { this.type = type; }

    @Override
    public String toString() {
        return String.format("%-15s | %-12s", model, type);
    }
}