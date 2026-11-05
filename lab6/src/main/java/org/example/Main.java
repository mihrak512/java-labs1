package org.example;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Иван", "Иванов", 1990);
        System.out.println("Человек: " + p1.getFullName());
        System.out.println("Год рождения: " + p1.getBirthYear());
        System.out.println("Возраст: " + p1.getAge() + " лет");

        System.out.println();


        Person p2 = new Person("Misha", "Rak" , 1999, 23);

        System.out.println(p2.getFullName());
        System.out.println(p2.getAge());


        Person[] people = {
                new Person("Иван",   "Иванов",   1990),
                new Person("Пётр",   "Петров",   1985),
                new Person("Анна",   "Сидорова", 2000),
                new Person("Мария",  "Кузнецова",1998),
                new Person("Сергей", "Смирнов",  1975)
        };

        System.out.println("+-----------------+-----------------+------+---------+");
        System.out.printf("| %-15s | %-15s | %-4s | %-7s |%n",
                "Имя", "Фамилия", "Год", "Возраст");
        System.out.println("+-----------------+-----------------+------+---------+");

        for (Person p : people) {
            System.out.printf("| %-15s | %-15s | %4d | %3d лет |%n",
                    p.getFirstName(),
                    p.getLastName(),
                    p.getBirthYear(),
                    p.getAge());
        }

        System.out.println("+-----------------+-----------------+------+---------+");
        Person p2 = new Person();
        p2.setFirstName("Ольга");
        p2.setLastName("Морозова");
        p2.setBirthYear(1995);
        System.out.println("\nЧерез сеттеры: " + p2);
    }
}