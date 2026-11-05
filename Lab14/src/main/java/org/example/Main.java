package org.example;

import java.io.*;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int choice = -1;

        while (choice != 0) {
            System.out.println("\n=========================================");
            System.out.println("       ЛАБОРАТОРНАЯ РАБОТА №14 ");
            System.out.println("=========================================");
            System.out.println("1. Задание 1: Любимый праздник (инфо о файле)");
            System.out.println("2. Задание 2: 10 чисел (подсчет от 0 до 100)");
            System.out.println("3. Задание 3: Случайные числа (кратные 6)");
            System.out.println("4. Задание 4: Мощность (5 значений, среднее)");
            System.out.println("5. Задание 5: Подсчет кратных 9");
            System.out.println("0. Выход");
            System.out.print("Выберите пункт меню: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Ошибка! Введите число от 0 до 5.");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    task1();
                    break;
                case 2:
                    task2(scanner);
                    break;
                case 3:
                    task3();
                    break;
                case 4:
                    task4(scanner);
                    break;
                case 5:
                    task5();
                    break;
                case 0:
                    System.out.println("Выход из программы. До свидания!");
                    break;
                default:
                    System.out.println("Неверный пункт меню. Попробуйте снова.");
            }
        }

        scanner.close();
    }

    public static void task1() {
        File file = new File("holiday.txt");

        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            writer.println("Мой любимый праздник - Новый год!");
            writer.println("Дата: в ночь с 31 декабря на 1 января.");
            writer.println("Традиции: запуск фейерверков, подарки и оливье.");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
            return;
        }

        System.out.println("\n--- Данные о файле ---");
        System.out.println("Имя файла: " + file.getName());
        System.out.println("Размер файла: " + file.length() + " байт");
        System.out.println("Путь к файлу: " + file.getAbsolutePath());

        System.out.println("\n--- Содержимое файла ---");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }
    }

    public static void task2(Scanner scanner) {
        File file = new File("f.txt");

        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            System.out.println("\nВведите 10 целых чисел (через пробел или Enter):");
            for (int i = 0; i < 10; i++) {
                if (scanner.hasNextInt()) {
                    writer.println(scanner.nextInt());
                } else {
                    System.out.println("Это не число. Введите число:");
                    scanner.next();
                    i--;
                }
            }
            scanner.nextLine();
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }

        int count = 0;
        System.out.print("Числа из файла: ");
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextInt()) {
                int num = fileScanner.nextInt();
                System.out.print(num + " ");
                if (num > 0 && num < 100) {
                    count++;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
        System.out.println("\nКоличество чисел > 0 и < 100: " + count);
    }

    public static void task3() {
        Random random = new Random();
        File f = new File("f.txt");
        File g = new File("g.txt");
        File h = new File("h.txt");

        try (PrintWriter fWriter = new PrintWriter(f);
             PrintWriter gWriter = new PrintWriter(g);
             PrintWriter hWriter = new PrintWriter(h)) {

            System.out.println("\nГенерация 20 случайных чисел...");
            for (int i = 0; i < 20; i++) {
                int num = random.nextInt(100);
                fWriter.print(num + " ");
                if (num % 6 == 0) {
                    gWriter.print(num + " ");
                } else {
                    hWriter.print(num + " ");
                }
            }
            System.out.println("Данные записаны в файлы f.txt, g.txt, h.txt");

            System.out.print("Файл g (кратные 6): ");
            try (Scanner sc = new Scanner(g)) {
                while(sc.hasNextInt()) System.out.print(sc.nextInt() + " ");
            }
            System.out.println();

        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлами: " + e.getMessage());
        }
    }

    public static void task4(Scanner scanner) {
        File file = new File("power.txt");

        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            System.out.println("\nВведите 5 значений мощности (дробные через точку, например 10.5):");
            for (int i = 0; i < 5; i++) {
                if (scanner.hasNextDouble()) {
                    writer.println(scanner.nextDouble());
                } else {
                    System.out.println("Некорректный ввод. Введите вещественное число:");
                    scanner.next();
                    i--;
                }
            }
            scanner.nextLine();
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }
        double sum = 0;
        int count = 0;
        try (Scanner fileScanner = new Scanner(file).useLocale(Locale.US)) {
            while (fileScanner.hasNextDouble()) {
                sum += fileScanner.nextDouble();
                count++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }

        if (count > 0) {
            System.out.printf("Средняя мощность: %.2f%n", (sum / count));
        } else {
            System.out.println("Нет данных для расчета.");
        }
    } 

    public static void task5() {
        File file = new File("f.txt");
        Random random = new Random();

        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            for (int i = 0; i < 10; i++) {
                writer.print(random.nextInt(100) + " ");
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }

        int count = 0;
        System.out.print("\nЧисла в файле: ");
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextInt()) {
                int num = fileScanner.nextInt();
                System.out.print(num + " ");
                if (num % 9 == 0) {
                    count++;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
        System.out.println("\nКоличество чисел, кратных 9: " + count);
    }
}