package org.example;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private String teacher;
    private int duration;
    private double price;
    private int maxStudents;
    private List<String> enrolledStudents;

    public Course(String name, String teacher, int duration, double price, int maxStudents)
            throws InvalidCourseDataException {
        setName(name);
        setTeacher(teacher);
        setDuration(duration);
        setPrice(price);
        setMaxStudents(maxStudents);

        this.enrolledStudents = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public String getTeacher() {
        return teacher;
    }

    public int getDuration() {
        return duration;
    }

    public double getPrice() {
        return price;
    }

    public int getEnrolledCount() {
        return enrolledStudents.size();
    }
    public void setName(String name) throws InvalidCourseDataException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidCourseDataException("Название курса не может быть пустым.");
        }
        this.name = name;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public void setDuration(int duration) throws InvalidCourseDataException {
        if (duration <= 0) {
            throw new InvalidCourseDataException("Длительность курса должна быть больше 0.");
        }
        this.duration = duration;
    }

    public void setPrice(double price) throws InvalidCourseDataException {
        if (price < 0) {
            throw new InvalidCourseDataException("Цена курса не может быть отрицательной.");
        }
        this.price = price;
    }

    public void setMaxStudents(int maxStudents) throws InvalidCourseDataException {
        if (maxStudents <= 0) {
            throw new InvalidCourseDataException("Количество мест должно быть больше 0.");
        }
        this.maxStudents = maxStudents;
    }


    public void enroll(String student) throws EnrollmentException {
        if (student == null || student.trim().isEmpty()) {
            throw new EnrollmentException("Имя студента не может быть пустым.");
        }
        if (enrolledStudents.size() >= maxStudents) {
            throw new EnrollmentException("Ошибка записи: на курсе '" + name + "' нет свободных мест.");
        }
        if (enrolledStudents.contains(student)) {
            throw new EnrollmentException("Студент " + student + " уже записан на этот курс.");
        }

        enrolledStudents.add(student);
        System.out.println("Студент " + student + " успешно записан на курс '" + name + "'.");
    }

    public void cancelEnrollment(String student) throws EnrollmentException {
        if (!enrolledStudents.contains(student)) {
            throw new EnrollmentException("Ошибка отмены: студент " + student + " не найден на курсе.");
        }

        enrolledStudents.remove(student);
        System.out.println("Запись студента " + student + " на курс '" + name + "' отменена.");
    }


}