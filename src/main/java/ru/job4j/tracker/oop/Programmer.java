package ru.job4j.tracker.oop;

public class Programmer extends Engineer{
    public Programmer(String name, String surname, String education, String birthday, String projectEngineer, String languageOfProgramming) {
        super(name, surname, education, birthday, projectEngineer);
        this.languageOfProgramming = languageOfProgramming;
    }

    public String getLanguageOfProgramming() {
        return languageOfProgramming;
    }

    public void setLanguageOfProgramming(String languageOfProgramming) {
        this.languageOfProgramming = languageOfProgramming;
    }

    private String languageOfProgramming;



}
