package org.example;

public class Jazz extends Music {
    private String improvisation;

    public Jazz(String title, int id, double duration, String improvisation) {
        super(title, id, duration);
        this.improvisation = improvisation;
    }

    @Override
    public String toString() {
        return String.format("Jazz{title='%s', id=%d, duration=%.1f, improvisation='%s'}",
                getTitle(), getId(), getDuration(), improvisation);
    }
}