package org.example;

public class Main {
    public static void main(String[] args) {
        Furniture[] items = new Furniture[5];

        items[0] = new Table("Обеденный",  "Дуб",   25000.0, 4);
        items[1] = new Table("Письменный", "Сосна", 15000.0, 4);
        items[2] = new Table("Журнальный", "Стекло", 8000.0, 3);
        items[3] = new Chair("Офисный",    "Металл",  7000.0, true);
        items[4] = new Chair("Барный",     "Кожа",   12000.0, false);

        System.out.println("+--------------+------------+---------------+-------------------------+-----------------+");
        System.out.printf("| %-12s | %-10s | %-13s | %-23s | %-15s |%n",
                "Название", "Материал", "Цена", "Назначение", "Доп. поле");
        System.out.println("+--------------+------------+---------------+-------------------------+-----------------+");

        for (Furniture f : items) {
            f.displayInfo();
        }
        System.out.println("+--------------+------------+---------------+-------------------------+-----------------+");

        System.out.println("\nДемонстрация уникальных методов:");

        for (Furniture f : items) {
            if (f instanceof Table t) {
                t.fold();
            } else if (f instanceof Chair c) {
                c.adjustHeight();
            }
        }

        System.out.println("\nПолиморфизм: getPurpose() для разных объектов:");
        for (Furniture f : items) {
            System.out.println("  " + f.getName() + " -> " + f.getPurpose());
        }

        double total = 0;
        for (Furniture f : items) {
            total += f.getPrice();
        }
        System.out.printf("%nОбщая стоимость мебели: %.2f руб.%n", total);

        Furniture f1 = new Table("вусукц", "ergfgfer" , 23.3, 4);
        Table t11 = new Table("вусукц", "ergfgfer" , 23.3, 4);
        Chair ee1 = new Chair("вусукц", "ergfgfer" , 23.3, true);



    }
}