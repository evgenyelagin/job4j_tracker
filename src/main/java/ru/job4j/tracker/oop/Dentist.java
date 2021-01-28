package ru.job4j.tracker.oop;

public class Dentist extends Doctor{
    public Dentist(String name, String surname, String education, String birthday, String instrument, String сaries) {
        super(name, surname, education, birthday, instrument);
        this.сaries = сaries;
    }

    public String getСaries() {
        return сaries;
    }

    public void setСaries(String сaries) {
        this.сaries = сaries;
    }

    private String сaries;

}
