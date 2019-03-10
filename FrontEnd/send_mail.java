package com.tcsion.FrontEnd;

import java.util.*; 
import javax.mail.*;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.*;
public class send_mail {
	public static void main(String[] args) {
		send_mail obj_send_mail=new send_mail();
		obj_send_mail.send_mail("Message Body", "divyajangid534@gmail.com");
	}
	public void send_mail(String message,String email_id) {
		String smtpServer = null; 
                String smtpPort = null;
		final String authAddress = "pandeyprachi067@gmail.com";      
		final String authPassword = "ilovemyfamily7";    
		String subject = "Subject Email ID";          
		//String message = "test by jinu";     
        smtpServer = "smtp.gmail.com";
        smtpPort = "465";    
        try{    
                Properties props = new Properties();     
                props.put("mail.smtp.host", smtpServer); 
                props.put("mail.smtp.port", smtpPort);   
                props.put("mail.smtp.auth", "true");         
            // create some properties and get the default Session
            Session sessionMail = Session.getInstance(props, new Authenticator() {
                 public PasswordAuthentication getPasswordAuthentication() {      
                         return new PasswordAuthentication(authAddress, authPassword);
                 }                                                                    
                });                                                                   
            sessionMail.setDebug(true);
            // create a message
            Message msg = new MimeMessage(sessionMail);
            // set the from and to address
            InternetAddress addressFrom = new InternetAddress(authAddress);
            msg.setFrom(addressFrom);
            InternetAddress[] addressTo = new InternetAddress[1];
            addressTo[0] = new InternetAddress(email_id);
            msg.setRecipients(Message.RecipientType.TO, addressTo);
            // Optional : You can also set your custom headers in the Email if you Want
            msg.addHeader("site", "chillyfacts.com");
            // Setting the Subject and Content Type
            msg.setSubject(subject);
            msg.setContent(message, "text/html");
            Transport.send(msg);
        }catch(Exception e){
                System.out.println(e);
        }
}
}