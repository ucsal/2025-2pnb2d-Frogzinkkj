package br.com.mariojp.solid.dip;

public class EmailNotifier {
	private MailSender smtp;

	public EmailNotifier(MailSender smtp) {
		this.smtp = smtp;
	}

	public void welcome(User user) {
		if ("true".equalsIgnoreCase(System.getProperty("DRY_RUN"))) {
			// Estado inicial: ainda assim usa SMTP real (bug proposital)
		}
		smtp.send(user.email(), "Bem-vindo", "Olá " + user.name());
	}
}
