package org.example;
public class Main {
    public static void main(String[] args) {

        Meal[] meals = new Meal[5];
        meals[0] = new Soup("Борщ", 300, 45, "Свекла, капуста, говядина, картофель");
        meals[1] = new Soup("Грибной крем-суп", 250, 30, "Шампиньоны, сливки, лук");
        meals[2] = new Pasta("Карбонара", 350, 15, "Спагетти");
        meals[3] = new Pasta("Болоньезе", 400, 20, "Тальятелле");
        meals[4] = new Pasta("Песто", 300, 12, "Пенне");

        for (Meal meal : meals) {
            meal.displayInfo();
            meal.cook();
            System.out.println("Калорийность на 100г: " + meal.getCaloriesPer100g() + " ккал");
            System.out.println("-------------------------------------------------");
        }
    }
}
