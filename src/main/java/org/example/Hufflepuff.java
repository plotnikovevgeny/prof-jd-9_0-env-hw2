package org.example;

import java.util.StringJoiner;

public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String surName, int magicPower, int transgressDistance, int industriousness, int loyalty, int honesty) {
        super(name, surName, magicPower, transgressDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public int getPower() {
        return super.getPower() + loyalty + honesty + industriousness;
    }

    public static Hufflepuff getBestOfTheBest(Hufflepuff student1, Hufflepuff student2){
        if (student1.getPower() > student2.getPower()) {
            return student1;
        } else {
            return student2;
        }
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Hufflepuff.class.getSimpleName() + "[", "]")
                .add("name=" + super.getName())
                .add("surname=" + super.getSurName())
                .add("magicPower=" + super.getMagicPower())
                .add("transgressDistance=" + super.getTransgressDistance())
                .add("industriousness=" + industriousness)
                .add("loyalty=" + loyalty)
                .add("honesty=" + honesty)
                .toString();
    }
}
