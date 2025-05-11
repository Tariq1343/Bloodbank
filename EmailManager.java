package blo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailManager {

    private final JavaMailSender jms;

    @Autowired
    public EmailManager(JavaMailSender jms) {
        this.jms = jms;
    }

    public String sendEmail(Object object, String subject, String message) {
        try {
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            mailMessage.setFrom("anwartarique84786@gmail.com");
            mailMessage.setTo((String) object);
            mailMessage.setSubject(subject);
            mailMessage.setText(message);
            jms.send(mailMessage);
            return "200::Email sent successfully";
        } catch (Exception e) {
            return "401::" + e.getMessage();
        }
    }
}