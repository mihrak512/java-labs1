package org.example;

import java.util.ArrayList;
import java.util.List;

public class CourseSystem {
    private List<Course> courses = new ArrayList<>();

    public void addCourse(Course course) {
        courses.add(course);
    }

    public Course findCourse(String name) throws CourseNotFoundException {
        for (Course c : courses) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        throw new CourseNotFoundException("Курс с названием '" + name + "' не найден в системе.");
    }
}