package ru.job4j.tracker.oop;

public class Surgeon extends Doctor {
    public Surgeon(String name, String surname, String education, String birthday, String instrument, String knive) {
        super(name, surname, education, birthday, instrument);
        this.knive = knive;
    }

    public String getKnive() {
        return knive;
    }

    public void setKnive(String knive) {
        this.knive = knive;
    }

    private String knive;
}
