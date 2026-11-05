package org.example;
import java.util.*;

class Lab12 {
    public static void main(String[] args) {

        // ---------- ЗАДАНИЕ 1 ----------
        System.out.println("========== ЗАДАНИЕ 1: Музыка ==========");
        Map<String, Music> musicMap = new HashMap<>();

        musicMap.put("Bohemian Rhapsody", new Rock("Bohemian Rhapsody", 1, 5.55, "Brian May"));
        musicMap.put("We Will Rock You", new Rock("We Will Rock You", 2, 2.01, "Brian May"));
        musicMap.put("Smells Like Teen Spirit", new Rock("Smells Like Teen Spirit", 3, 5.01, "Kurt Cobain"));

        musicMap.put("Symphony No. 5", new Classical("Symphony No. 5", 4, 7.20, "Berlin Philharmonic"));
        musicMap.put("Moonlight Sonata", new Classical("Moonlight Sonata", 5, 6.00, "Vienna Philharmonic"));
        musicMap.put("The Four Seasons", new Classical("The Four Seasons", 6, 42.00, "Academy of St Martin"));

        musicMap.put("Take Five", new Jazz("Take Five", 7, 5.24, "Paul Desmond"));
        musicMap.put("So What", new Jazz("So What", 8, 9.22, "Miles Davis"));

        System.out.println("Все ключи и значения:");

        // ИСПОЛЬЗОВАНИЕ ИТЕРАТОРА ДЛЯ MAP
        Iterator<Map.Entry<String, Music>> mapIterator = musicMap.entrySet().iterator();
        while (mapIterator.hasNext()) {
            Map.Entry<String, Music> entry = mapIterator.next();
            System.out.println("Ключ: " + entry.getKey() + " -> Значение: " + entry.getValue());
        }
        System.out.println("Всего записей: " + musicMap.size());

        // ---------- ЗАДАНИЕ 2 ----------
        System.out.println("\n========== ЗАДАНИЕ 2: Курсы ==========");
        List<Course> courses = new ArrayList<>();
        courses.add(new Course(1, "Java Programming", "IT", 4, Arrays.asList(5, 4, 5)));
        courses.add(new Course(2, "Data Science", "IT", 5, Arrays.asList(3, 2, 4)));
        courses.add(new Course(3, "Web Development", "IT", 3, Arrays.asList(2, 2, 1)));
        courses.add(new Course(4, "Machine Learning", "IT", 5, Arrays.asList(5, 5, 4)));
        courses.add(new Course(5, "English Grammar", "Language", 2, Arrays.asList(4, 4, 5)));
        courses.add(new Course(6, "History", "Humanities", 1, Arrays.asList(1, 2, 1)));
        courses.add(new Course(7, "Art", "Creative", 4, Arrays.asList(4, 3, 4)));
        courses.add(new Course(8, "Physics", "Science", 3, Arrays.asList(3, 4, 3)));

        System.out.println("Исходный список курсов:");
        printList(courses);

        Iterator<Course> removeIterator = courses.iterator();
        while (removeIterator.hasNext()) {
            Course c = removeIterator.next();
            if (c.getAverageRating() < 3) {
                removeIterator.remove();
            }
        }
        System.out.println("\nПосле удаления курсов со средним рейтингом < 3:");
        printList(courses);

        Iterator<Course> increaseIterator = courses.iterator();
        while (increaseIterator.hasNext()) {
            Course c = increaseIterator.next();
            if (c.getAverageRating() >= 4) {
                c.setRating(c.getRating() + 1);
            }
        }
        System.out.println("\nПосле повышения рейтинга курсов со средним рейтингом >= 4:");
        printList(courses);

        int targetRating = 5;
        System.out.println("\nКурсы с рейтингом " + targetRating + ":");
        printCourses(courses, targetRating);

        courses.sort(Comparator.comparingDouble(Course::getAverageRating)
                .thenComparing(Course::getTitle).reversed());

        System.out.println("\nОтсортированные курсы (по убыванию среднего рейтинга, при равенстве – по названию):");
        System.out.println("ID | Название | Средний рейтинг");

        Iterator<Course> printSortedIterator = courses.iterator();
        while (printSortedIterator.hasNext()) {
            Course c = printSortedIterator.next();
            System.out.printf("%-2d | %-20s | %.2f%n",
                    c.getId(), c.getTitle(), c.getAverageRating());
        }
    }

    public static void printList(List<Course> list) {
        Iterator<Course> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // Вспомогательный метод для печати курсов с заданным рейтингом (через итератор)
    public static void printCourses(List<Course> courses, int rating) {
        boolean found = false;
        Iterator<Course> iterator = courses.iterator();
        while (iterator.hasNext()) {
            Course c = iterator.next();
            if (c.getRating() == rating) {
                System.out.println(c);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Курсы с рейтингом " + rating + " не найдены.");
        }
    }
}