package com.sda.cleancode.single;

public class StudentApp {
    public static void main(String[] args) {

        // We will create a student and do some work with him
        Student student = new Student("John");
        student.enrollInCourse("Design Patterns");
        student.saveInDb();
        student.sendEmail("Hello", "Course will take place at 18");

    }
}
