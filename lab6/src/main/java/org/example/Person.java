package org.example;

import java.time.Year;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    private int kolvo;

    public int getKolvo() {
        return kolvo;
    }

    public void setKolvo(int kolvo) {
        this.kolvo = kolvo;
    }
    public Person(String firstName, String lastName, int birthYear, int kolvo){
        this(firstName, lastName, birthYear);
        this.kolvo = kolvo;
    }

    public Person() {
    }

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge() {
        int currentYear = Year.now().getValue();
        return currentYear - birthYear;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return String.format("%-15s | %-15s | %4d | %3d лет",
                firstName, lastName, birthYear, getAge());
    }
}