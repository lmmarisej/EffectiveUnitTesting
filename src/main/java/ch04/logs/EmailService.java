package ch04.logs;

public interface EmailService {
	void sendEmail(String recipient, String subject, String message);
}
