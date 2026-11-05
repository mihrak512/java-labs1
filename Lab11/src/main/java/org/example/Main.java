package org.example;

public class Main {
        public static void main(String[] args) {
            System.out.println("===== Демонстрация перегрузки (статический полиморфизм) =====");
            Food food = new Food("Обычная еда", 100, 200);
            food.cook();
            food.cook(10);
            food.cook("варка");

            System.out.println("\n===== Демонстрация перегрузки в производных классах =====");
            Pizza pizza = new Pizza("Пепперони", 300, 500, "Пепперони");
            pizza.cook();
            pizza.cook(20);
            pizza.cook("запекание");
            pizza.addTopping("Сыр");
            pizza.addTopping("Грибы", 2);

            Soup soup = new Soup("Борщ", 150, 300, "Мясной");
            soup.cook();
            soup.cook(40);
            soup.cook("варка");
            soup.addIngredient("Свекла");
            soup.addIngredient("Капуста", 100);

            System.out.println("\n===== Демонстрация переопределения (динамический полиморфизм) =====");
            Food[] foods = {
                    new Food("Обычная еда", 100, 200),
                    new Pizza("Пепперони", 300, 500, "Пепперони"),
                    new Soup("Борщ", 150, 300, "Мясной")
            };
            for (Food f : foods) {
                System.out.println(f.getName() + " имеет вкус: " + f.getTaste());
            }

            System.out.println("\n===== Сравнение статического и динамического полиморфизма =====");
            System.out.println("Статический полиморфизм (перегрузка): выбор метода cook()");
            System.out.println("происходит на этапе компиляции в зависимости от типов аргументов.");
            System.out.println("Динамический полиморфизм (переопределение): выбор метода getTaste()");
            System.out.println("происходит во время выполнения в зависимости от фактического типа объекта.");
        }
}
