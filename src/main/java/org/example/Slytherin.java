package org.example;

import java.util.StringJoiner;

public class Slytherin extends Hogwarts {
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int superpower;

    public Slytherin(String name, String surName, int magicPower, int transgressDistance, int trick, int determination, int ambition, int resourcefulness, int superpower) {
        super(name, surName, magicPower, transgressDistance);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.superpower = superpower;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getSuperpower() {
        return superpower;
    }

    public void setSuperpower(int superpower) {
        this.superpower = superpower;
    }

    @Override
    public int getPower() {
        return super.getPower() + superpower + resourcefulness + ambition + trick + determination;
    }

    public static Slytherin getBestOfTheBest(Slytherin student1, Slytherin student2){
        if (student1.getPower() > student2.getPower()) {
            return student1;
        } else {
            return student2;
        }
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Slytherin.class.getSimpleName() + "[", "]")
                .add("name=" + super.getName())
                .add("surname= " + super.getSurName())
                .add("magicPower=" + super.getMagicPower())
                .add("transgressDistance=" + super.getTransgressDistance())
                .add("trick=" + trick)
                .add("determination=" + determination)
                .add("ambition=" + ambition)
                .add("resourcefulness=" + resourcefulness)
                .add("superpower=" + superpower)
                .toString();
    }
}
