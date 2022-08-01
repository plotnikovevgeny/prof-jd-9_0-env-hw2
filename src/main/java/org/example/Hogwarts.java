package org.example;

public class Hogwarts {
    private String name;
    private String surName;
    private int magicPower;
    private int transgressDistance;

    public Hogwarts(String name, String surName, int magicPower, int transgressDistance) {
        this.name = name;
        this.surName = surName;
        this.magicPower = magicPower;
        this.transgressDistance = transgressDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressDistance() {
        return transgressDistance;
    }

    public void setTransgressDistance(int transgressDistance) {
        this.transgressDistance = transgressDistance;
    }

    public int getPower() {
        return magicPower + transgressDistance;
    }

    public static Hogwarts getBestOfTheBest(Hogwarts student1, Hogwarts student2) {
        if (student1.getPower() > student2.getPower()) {
            return student1;
        } else {
            return student2;
        }
    }

}