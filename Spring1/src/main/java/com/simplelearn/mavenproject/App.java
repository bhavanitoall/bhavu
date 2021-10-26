package com.simplelearn.mavenproject;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class App {

  public void sendEmail() throws EmailException {
    SimpleEmail email = new SimpleEmail();
    email.setHostName("smtphost.example.com");
    email.addTo("destination@example.com");
    email.setFrom("origin@example.com", "Bhavani Chakkra");
    email.setSubject("Some random message");
    email.setMsg("This is a random text message");
    email.send();
  }
}
