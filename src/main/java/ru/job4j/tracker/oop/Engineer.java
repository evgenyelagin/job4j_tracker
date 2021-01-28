package ru.job4j.tracker.oop;

public class Engineer extends Profession {
    public Engineer(String name, String surname, String education, String birthday, String projectEngineer) {
        super(name, surname, education, birthday);
        this.projectEngineer = projectEngineer;
    }

    public String getProjectEngineer() {
        return projectEngineer;
    }

    public void setProjectEngineer(String projectEngineer) {
        this.projectEngineer = projectEngineer;
    }

    private String projectEngineer;

    public void canStudy() {
        System.out.println("I can Study");

    }

}

