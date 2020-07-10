package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ivanov Ivan Ivanovich");
        student.setGroup("A2");
        student.setReceiptDate(new Date());
        System.out.println("Student: " + student.getFullName() + System.lineSeparator()
                            + "Group: " + student.getGroup() + System.lineSeparator()
                            + "Receipt date: " + student.getReceiptDate()
                            );
    }
}
