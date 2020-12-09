package com.webtest.core;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.webtest.utils.ReadProperties;
/**
 * author:xiongjingyi
 * 
 */
public class MailUtil {
	
	public static void SendMail(String email, String subject, String body) throws IOException {
		String sender = "xiongjingyigirl@126.com";
		String auth_code = "PDOIJZPIAZHBUFOB";
		String tomail_receiver = ReadProperties.getPropertyValue("tomail");
		String[] address = tomail_receiver.split(",");
		for(String emailaddress: address) {
			Properties props = new Properties();
			props.put("mail.transport.protocol", "smtp");
			props.put("mail.smtp.host", "smtp.126.com");
			props.put("mail.smtp.auth", true);
			//1������Session����(�ʼ��Ự����)�����÷���������Ȩ�룬��ҪProperties����
			Session session = Session.getInstance(props,new Authenticator() {

				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					// TODO Auto-generated method stub
					return new PasswordAuthentication(sender,auth_code);
				}
				
			});
			
			//2�������ʼ�������Message��������MimeMessage
			//���÷����ˡ��ռ��ˡ����⡢����
			javax.mail.Message message = new MimeMessage(session);
			try {
				message.setFrom(new InternetAddress(sender));
				message.addRecipient(MimeMessage.RecipientType.TO, new InternetAddress(emailaddress));
				message.setSubject("Hello!����С��");
				//�����ı�
				message.setContent(body,"text/html;charset=utf-8");
				//3�������ʼ�
				Transport.send(message);
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
	public static void main(String args[]) throws IOException{
		MailUtil.SendMail("xiongjingyigirl@126.com", "TEST", "xiongjingyi");
	}
	
}