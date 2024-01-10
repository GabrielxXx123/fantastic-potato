package com.sda.cleancode.single.New_way;

public class StudentApp {
    public static void main(String[] args) {
        Student student = new Student("Mihai");

        CourseManager courseManager = new CourseManager();
        courseManager.enrollInCourse("Design Patterns" ,  student.getName());

        Repository repository = new Repository();
        repository.saveInDb(student.getName());

        EmailService emailService = new EmailService();
        emailService.sendEmail(student.getName(), "Hello ", "Course will take place at 18!");



    }
}
