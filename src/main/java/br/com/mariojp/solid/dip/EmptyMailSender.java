package br.com.mariojp.solid.dip;

public class EmptyMailSender implements MailSender{
  @Override
  public void send(String to, String subject, String body) {

  }
}
