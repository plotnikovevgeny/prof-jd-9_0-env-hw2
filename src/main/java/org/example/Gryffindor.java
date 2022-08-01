package org.example;

import java.util.StringJoiner;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String surName, int magicPower, int transgressDistance, int nobility, int honor, int bravery) {
        super(name, surName, magicPower, transgressDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public int getPower() {
        return honor + bravery + nobility + super.getPower();
    }

    public static Gryffindor getBestOfTheBest(Gryffindor student1, Gryffindor student2){
        if (student1.getPower() > student2.getPower()) {
            return student1;
        } else {
            return student2;
        }
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Gryffindor.class.getSimpleName() + "[", "]")
                .add("name=" + super.getName())
                .add("surname=" + super.getSurName())
                .add("magicPower=" + super.getMagicPower())
                .add("transgressDistance=" + super.getTransgressDistance())
                .add("")
                .add("nobility=" + nobility)
                .add("honor=" + honor)
                .add("bravery=" + bravery)
                .toString();
    }
}
