package pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setSurname("Ivanov");
        student.setName("Oleg");
        student.setGroup("A1");
        student.setStudy(new Date());

        System.out.println(student.getSurname() + " " + student.getName() + " группа: " + student.getGroup() + " дата поступления: " + student.getStudy());
    }
}
