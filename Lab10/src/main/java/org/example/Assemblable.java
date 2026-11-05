package org.example;

public interface Assemblable {
    void assemble();
    void disassemble();

    static void info() {
        System.out.println("Интерфейс Assemblable: сборка/разборка мебели");
    }
}
