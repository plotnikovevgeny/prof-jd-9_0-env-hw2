package org.example;

import java.util.StringJoiner;

public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, String surName, int magicPower, int transgressDistance, int mind, int wisdom, int wit, int creativity) {
        super(name, surName, magicPower, transgressDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public int getPower() {
        return super.getPower() + creativity + wisdom + wit + mind;
    }

    public static Ravenclaw getBestOfTheBest(Ravenclaw student1, Ravenclaw student2) {
        if (student1.getPower() > student2.getPower()) {
            return student1;
        } else {
            return student2;
        }
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Ravenclaw.class.getSimpleName() + "[", "]")
                .add("name=" + super.getName())
                .add("surname=" + super.getSurName())
                .add("magicPower=" + super.getMagicPower())
                .add("transgressDistance=" + super.getTransgressDistance())
                .add("mind=" + mind)
                .add("wisdom=" + wisdom)
                .add("wit=" + wit)
                .add("creativity=" + creativity)
                .toString();
    }
}
