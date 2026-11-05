package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Course {
    private int id;
    private String title;
    private String category;
    private int rating;                // целочисленный рейтинг (1-5)
    private List<Integer> studentRatings;

    public Course(int id, String title, String category, int rating, List<Integer> studentRatings) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.rating = rating;
        this.studentRatings = new ArrayList<>(studentRatings);
    }

    // Вычисление среднего рейтинга через итератор, без Stream API
    public double getAverageRating() {
        if (studentRatings == null || studentRatings.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        int count = 0;
        Iterator<Integer> iterator = studentRatings.iterator();
        while (iterator.hasNext()) {
            sum += iterator.next();
            count++;
        }

        return (double) sum / count;
    }

    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }

    public int getId() { return id; }
    public String getTitle() { return title; }

    @Override
    public String toString() {
        return String.format("Course{id=%d, title='%s', category='%s', rating=%d, avg=%.2f}",
                id, title, category, rating, getAverageRating());
    }
}