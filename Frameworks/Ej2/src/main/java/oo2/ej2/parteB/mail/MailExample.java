package oo2.ej2.parteB.mail;

import java.util.Properties;

import jakarta.mail.*;
import jakarta.mail.internet.*;

public class MailExample {

	public static void sendMail(String emailMesage, String emailSubject) {
		try {
			String from = "example@logger.com";
			String to = "destination@mail.com";

			// credenciales
			String username = "5f54cb9cbbc2df"; // Completar con su username de mailtrap
			String password = "c931e36b90b673"; // Completar con su password de mailtrap
			
			Properties props = new Properties();
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", "smtp.mailtrap.io");
			props.put("mail.smtp.port", "587");
			Session session = Session.getInstance(props,
				new Authenticator() {
		            protected PasswordAuthentication getPasswordAuthentication() {
		            	return new PasswordAuthentication(username, password);
		            }
			});

		    Message message = new MimeMessage(session);
		    message.setFrom(new InternetAddress(from, "Java logging mail"));
		    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
		    message.setSubject(emailSubject);
		    message.setText(emailMesage);
		    Transport.send(message);
		}
		catch (Exception e) {
			throw new RuntimeException(e);
	    }
	}
}
