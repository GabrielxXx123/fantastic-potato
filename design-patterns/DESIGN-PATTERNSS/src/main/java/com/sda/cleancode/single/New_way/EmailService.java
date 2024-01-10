package com.sda.cleancode.single.New_way;

public class EmailService {

    public void sendEmail(String name,String subject, String body){
        System.out.println("Sending email Subject : " + subject + "to student: " + name+ "\n" + body);
    }

}
