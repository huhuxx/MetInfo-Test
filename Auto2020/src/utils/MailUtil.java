package utils;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;

import java.io.FileInputStream;
import java.io.IOException;

public class MailUtil {
	public static void Mail() throws IOException {
		String sendAddress="yjl1837519045@126.com";
		//��Ȩ��
		String auth_code="YATGOUGSDVGTJSIR";
		Properties props=new Properties();
		FileInputStream fis = new FileInputStream("config.properties");
		props.load(fis);
		fis.close();
		String tomail=props.getProperty("tomail");
		props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtp.host", "smtp.126.com");
		props.put("mail.smtp.auth", true);
		//1������Session�����ʼ��Ự���󣩣����÷���������Ȩ�룬��ҪProperties����
		Session session=Session.getInstance(props, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(sendAddress, auth_code);
			}
		});
		//2�������ʼ�������Message�������� MimeMessage
		//���÷����ˡ��ռ��ˡ����⡢����
		Message message=new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(sendAddress));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress("tomail"));
			message.setSubject("�����-2018011720");
			//����HTML��ʽ���ʼ�
			MimeMultipart mimeMultipart=new MimeMultipart();
			MimeBodyPart mimeBodyPart=new MimeBodyPart();
			mimeBodyPart.setContent(mimeMultipart,"text/html;charset=utf-8");
			DataHandler dataHandler = new DataHandler(new FileDataSource("D:\\eclipse\\practical\\src\\fm\\freemarker.html"));
			mimeBodyPart.setDataHandler(dataHandler);
		    mimeBodyPart.setFileName(MimeUtility.encodeText(dataHandler.getName()));
			mimeMultipart.addBodyPart(mimeBodyPart);
			mimeMultipart.setSubType("mixed");
			message.setContent(mimeMultipart,"text/html;charset=gbk");
			message.setContent(HtmltoString.htmltoS(), "text/html; charset=utf-8");
			//���沢�������յ��ʼ�����
			message.saveChanges(); 

		//3�������ʼ�
			Transport.send(message);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
