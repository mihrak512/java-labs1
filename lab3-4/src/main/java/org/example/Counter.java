package org.example;

public class Counter {
    private int count;

    public Counter() {
        this.count = 0;
    }

    public int getCount() {
        return count;
    }

    public int getValue() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    @Override
    public String toString() {
        return "Counter = " + count;
    }
}