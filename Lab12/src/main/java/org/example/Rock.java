package org.example;

public class Rock extends Music {
    private String guitarSolo;

    public Rock(String title, int id, double duration, String guitarSolo) {
        super(title, id, duration);
        this.guitarSolo = guitarSolo;
    }

    @Override
    public String toString() {
        return String.format("Rock{title='%s', id=%d, duration=%.1f, guitarSolo='%s'}",
                getTitle(), getId(), getDuration(), guitarSolo);
    }
}
