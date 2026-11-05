package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Table t1 = new Table("Обеденный", "Дуб", 4);
        Table t2 = new Table("Письменный", "Сосна", 4);
        Table t3 = new Table("Журнальный", "Стекло", 3);

        Chair c1 = new Chair("Офисный", "Металл", "Сетка");
        Chair c2 = new Chair("Кухонный", "Дерево", "Сплошная");

        Assemblable.info();

        Assemblable[] assemblables = { t1, t2, t3, c1, c2 };

        System.out.println("\n--- Сборка всей мебели ---");
        for (Assemblable a : assemblables) {
            a.assemble();
        }

        Usable[] usables = { t1, t2, t3, c1, c2 };

        System.out.println("\n--- Использование всей мебели ---");
        for (Usable u : usables) {
            u.use();
            System.out.println("  Назначение: " + u.getPurpose());
        }

        System.out.println("\n--- Разборка части мебели ---");
        t1.disassemble();
        c2.disassemble();

        System.out.println("\n--- Повторное использование (видно, что разобранное не работает) ---");
        for (Usable u : usables) {
            u.use();
        }

        System.out.println("\n--- Демонстрация instanceof + приведение ---");
        for (Assemblable a : assemblables) {
            if (a instanceof Table) {
                Table t = (Table) a;
                System.out.println("Это стол: " + t.getName() + ", собран: " + t.isAssembled());
            } else if (a instanceof Chair) {
                Chair c = (Chair) a;
                System.out.println("Это стул: " + c.getName() + ", собран: " + c.isAssembled());
            }
        }
    }
}
