package com.indium;

public class FacadePattern {
    public static void main(String[] args) {
        // Facade Pattern - Structural Pattern
        // Provides a unified interface to a set of interfaces in a subsystem

        // Send an email without a facade
//        Address address = new Address();
//        address.setTo("");
//        address.setFrom("");
//
//        Subject subject = new Subject();
//        subject.setSubject("Hello");
//
//        Attachment attachment = new Attachment();
//        attachment.setContent("../somefile.txt");
//
//        Pop3Server pop3Server = new Pop3Server();
//        pop3Server.setHost("smtp.gmail.com");
//        pop3Server.setPort(587);
//        pop3Server.setUsername("username");
//        pop3Server.setPassword("password");
//        pop3Server.connect();
//        pop3Server.sendEmail(address, subject, attachment);
//        pop3Server.disconnect();

        EmailHelper.sendMail("from", "to", "subject", "content");
    }
}

// Facade class
class EmailHelper {
    public static void sendMail(String from, String to, String subject, String content) {
        Address address = new Address();
        address.setTo(to);
        address.setFrom(from);

        Subject emailSubject = new Subject();
        emailSubject.setSubject(subject);

        Attachment attachment = new Attachment();
        attachment.setContent(content);

        Pop3Server pop3Server = new Pop3Server();
        pop3Server.setHost("smtp.gmail.com");
        pop3Server.setPort(587);
        pop3Server.setUsername("username");
        pop3Server.setPassword("password");
        pop3Server.connect();
        pop3Server.sendEmail(address, emailSubject, attachment);
        pop3Server.disconnect();
    }
}

class Address {

}

class Pop3Server {

}

class Subject {

}

class Attachment {

}
