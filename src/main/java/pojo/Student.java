package pojo;

import java.util.Date;

public class Student {
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getStudy() {
        return study;
    }

    public void setStudy(Date study) {
        this.study = study;
    }

    private String surname;
    private String name;
    private String group;
    private Date study;
}
