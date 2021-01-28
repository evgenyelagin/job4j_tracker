package ru.job4j.tracker.oop;

public class Builder extends Engineer {
    public Builder(String name, String surname, String education, String birthday, String projectEngineer, String excavator) {
        super(name, surname, education, birthday, projectEngineer);
        this.excavator = excavator;
    }

    public String getExcavator() {
        return excavator;
    }

    public void setExcavator(String excavator) {
        this.excavator = excavator;
    }

    private String excavator;

}
