package org.example;

public class Main {
    public static void main(String[] args) {
        CourseSystem system = new CourseSystem();

        System.out.println("=== Создание курсов ===");

        try {
            Course badCourse = new Course("Java", "Иванов", -5, 100.0, 10);
        } catch (InvalidCourseDataException e) {
            System.out.println("Перехвачено исключение: " + e.getMessage());
        }

        try {
            Course javaCourse = new Course("Java для начинающих", "Иванов И.И.", 40, 1500.0, 2);
            Course pythonCourse = new Course("Python PRO", "Петров П.П.", 30, 2000.0, 5);

            system.addCourse(javaCourse);
            system.addCourse(pythonCourse);

            System.out.println("\n=== Запись студентов на курс Java ===");

            javaCourse.enroll("Алексей");
            javaCourse.enroll("Мария");
            javaCourse.enroll("Дмитрий");

        } catch (InvalidCourseDataException | EnrollmentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            System.out.println("--- Блок finally: Операции с курсами завершены ---\n");
        }

        System.out.println("=== Поиск курса в системе ===");

        try {
            Course foundCourse = system.findCourse("C++");
            System.out.println("Найден курс: " + foundCourse.getName());
        } catch (CourseNotFoundException e) {
            System.out.println("Ошибка поиска: " + e.getMessage());
        } finally {
            System.out.println("--- Блок finally: Поиск завершен ---");
        }

        System.out.println("\n=== Отмена записи ===");
        try {
            Course foundCourse = system.findCourse("Java для начинающих");

            foundCourse.cancelEnrollment("Алексей");
            foundCourse.cancelEnrollment("Олег");

        } catch (CourseNotFoundException | EnrollmentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

