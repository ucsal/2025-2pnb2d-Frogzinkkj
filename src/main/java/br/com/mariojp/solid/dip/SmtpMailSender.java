package br.com.mariojp.solid.dip;

public class SmtpMailSender implements MailSender{
  @Override
  public void send(String to, String subject, String body) {
    SmtpClient smtp = new SmtpClient();
    smtp.send(to,subject,body);
  }
}
