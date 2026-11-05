package org.example;

public class Table implements Assemblable, Usable {
    private String name;
    private String material;
    private int legs;
    private boolean assembled;

    public Table(String name, String material, int legs) {
        this.name = name;
        this.material = material;
        this.legs = legs;
        this.assembled = false;
    }

    @Override
    public void assemble() {
        assembled = true;
        System.out.println("Стол \"" + name + "\" собран (" + legs + " ножек, " + material + ")");
    }

    @Override
    public void disassemble() {
        assembled = false;
        System.out.println("Стол \"" + name + "\" разобран");
    }

    @Override
    public void use() {
        if (assembled) {
            System.out.println("Использую стол \"" + name + "\" по назначению");
        } else {
            System.out.println("Стол \"" + name + "\" не собран — сначала соберите!");
        }
    }

    @Override
    public String getPurpose() {
        return "Стол \"" + name + "\" — для работы, еды и других задач";
    }

    public String getName() { return name; }
    public boolean isAssembled() { return assembled; }
}
