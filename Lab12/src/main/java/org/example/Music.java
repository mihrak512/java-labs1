package org.example;

public class Music {
    private String title;
    private int id;
    private double duration;

    public Music(String title, int id, double duration) {
        this.title = title;
        this.id = id;
        this.duration = duration;
    }

    public String getTitle() { return title; }
    public int getId() { return id; }
    public double getDuration() { return duration; }

    @Override
    public String toString() {
        return String.format("Music{title='%s', id=%d, duration=%.1f}", title, id, duration);
    }
}
