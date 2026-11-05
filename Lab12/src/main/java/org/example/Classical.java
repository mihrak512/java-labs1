package org.example;

public class Classical extends Music {
    private String orchestra;

    public Classical(String title, int id, double duration, String orchestra) {
        super(title, id, duration);
        this.orchestra = orchestra;
    }

    @Override
    public String toString() {
        return String.format("Classical{title='%s', id=%d, duration=%.1f, orchestra='%s'}",
                getTitle(), getId(), getDuration(), orchestra);
    }
}