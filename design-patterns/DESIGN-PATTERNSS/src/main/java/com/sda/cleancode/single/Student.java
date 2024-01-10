package com.sda.cleancode.single;

public class Student {

    private String name;

    public Student(String name) {
        this.name = name;

    }
    public  void enrollInCourse(String courseName){
        System.out.println("Student" + name + " was enrolled in course : " + courseName);
    }

    public  void  saveInDb(){
        System.out.println("Student: " + name + " was saved in db!");
    }

    public void sendEmail(String subject, String body){
        System.out.println("Sending email Subject : " + subject + "to student: " + name+ "\n" + body);
    }


















}
