package org.example;

public class Chair implements Assemblable, Usable {
    private String name;
    private String material;
    private String backrest;
    private boolean assembled;

    public Chair(String name, String material, String backrest) {
        this.name = name;
        this.material = material;
        this.backrest = backrest;
        this.assembled = false;
    }

    @Override
    public void assemble() {
        assembled = true;
        System.out.println("Стул \"" + name + "\" собран (спинка: " + backrest + ", материал: " + material + ")");
    }

    @Override
    public void disassemble() {
        assembled = false;
        System.out.println("Стул \"" + name + "\" разобран");
    }

    @Override
    public void use() {
        if (assembled) {
            System.out.println("Сижу на стуле \"" + name + "\"");
        } else {
            System.out.println("Стул \"" + name + "\" не собран!");
        }
    }

    @Override
    public String getPurpose() {
        return "Стул \"" + name + "\" — для сидения";
    }

    public String getName() { return name; }
    public boolean isAssembled() { return assembled; }
}
