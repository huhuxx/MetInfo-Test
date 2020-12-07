//package test;
//
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.Test;
//import driver.BaseTest;
//
////@Listeners(JavaMailTestListener.class)
//public class TestAuto extends BaseTest {
//	// ������������
//	public void email() throws InterruptedException {
//		webtest.open("http://localhost:99/admin");
//		webtest.type("xpath=//input[@name='login_name']", "root");
//		webtest.type("xpath=//input[@name='login_pass']", "root");
//		webtest.click("xpath=//button[@class='btn btn-primary px-4']");
//		webtest.click("xpath=//button[@class='btn btn-default no-prompt']");
//		webtest.enterFrame(0);
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[@title='��������']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[@class='editable-click']");
//		Thread.sleep(1000);
//		webtest.mouseToElement("xpath=//div[@m-id='message_form']");
//		webtest.down(4);
//		Thread.sleep(1000);
//	}
//
//	// �ύ����
//	public void sub() throws InterruptedException {
//		webtest.mouseToElement("xpath=//div[@class='form-group m-b-0']");
//		webtest.runJs(
//				"document.getElementsByClassName('btn btn-primary btn-block btn-squared editable-click set')[0].className=''");
//		webtest.mouseToElementandClick("xpath=//button[text()='??????']");
//		Thread.sleep(3000);
//	}
//
//	// �������߷�������
//	public void email1() throws InterruptedException {
//		WebElement element = null;
//		webtest.open("http://localhost:99/admin/index.php");
//		webtest.type("xpath=//input[@name='login_name']", "root");
//		webtest.type("xpath=//input[@name='login_pass']", "root");
//		webtest.click("xpath=//button[@class='btn btn-primary px-4']");
//		webtest.click("xpath=//button[@class='btn btn-default no-prompt']");
//		webtest.enterFrame(0);
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[@title='��������']");
//		Thread.sleep(1000);
//		element = webtest.back("editable-click").get(36);
//		webtest.click(element);
//		Thread.sleep(1000);
//	}
//
//	//1���ɹ���Ӳ�����������
//	@Test(priority = 1)
//	public void yjltest1() throws InterruptedException {
//		email();
//		webtest.type("xpath=//input[@name='para137']", "�����");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para186']", "1837519045@qq.com");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para138']", "18732338187");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para139']", "�ӱ�ʡ");
//		Thread.sleep(1000);
//		webtest.type("xpath=//textarea[@name='para140']", "��");
//		Thread.sleep(2000);
//		webtest.type("xpath=//input[@class='form-control input-codeimg']", "aaaa");
//		Thread.sleep(1000);
//		sub();
//		webtest.alertAccept();
//	}
//
//	// 2���ɹ���ǰ̨��ʾ����
//	@Test(priority = 2)
//	public void yjltest2() throws InterruptedException {
//		webtest.open("http://localhost:99/admin");
//		webtest.type("xpath=//input[@name='login_name']", "root");
//		webtest.type("xpath=//input[@name='login_pass']", "root");
//		webtest.click("xpath=//button[@class='btn btn-primary px-4']");
//		webtest.click("xpath=//button[@class='btn btn-default no-prompt']");
//		webtest.enterFrame(0);
//		webtest.click("xpath=//a[@title='��������']");
//		webtest.click("xpath=//a[@class='editable-click']");
//		webtest.click("xpath=//button[@data-index='5']");
//		webtest.leaveFrame();
////		webtest.click("xpath=//button[@class='btn btn-sm btn-primary mr-1']");
//		webtest.mouseToElementandClick("xpath=//div[@class='modal-body  oya met-scrollbar']");
//		webtest.down(3);
//		webtest.type("xpath=//textarea[@name='useinfo']", "��");
//		webtest.click("xpath=//label[text()='���ͨ������ǰ̨��ʾ']");
//		webtest.click("xpath=//button[@class='btn btn-primary']");
//		webtest.open("http://localhost:99/message/");
//	}
//
//	// 3�������������ʧ�ܣ����Email��ʽ����
//	@Test(priority = 3)
//	public void yjltest3() throws InterruptedException {
//		email();
//		webtest.type("xpath=//input[@name='para137']", "�����");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para186']", "1");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para138']", "18732338187");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para139']", "�ӱ�ʡ");
//		Thread.sleep(1000);
//		webtest.type("xpath=//textarea[@name='para140']", "��");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@class='form-control input-codeimg']", "aaaa");
//		Thread.sleep(1000);
//		sub();
//	}
//
//	// 4,�����������ʧ�ܣ�����Ϊ��
//	@Test(priority = 4)
//	public void yjltest4() throws InterruptedException {
//		email();
//		webtest.type("xpath=//input[@name='para137']", "");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para186']", "1837519045@qq.com");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para138']", "18732338187");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para139']", "�ӱ�ʡ");
//		Thread.sleep(1000);
//		webtest.type("xpath=//textarea[@name='para140']", "��");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@class='form-control input-codeimg']", "aaaa");
//		Thread.sleep(1000);
//		sub();
//	}
//
//	// 5,�����������ʧ��,��ϵ�绰��ʽ����
//	@Test(priority = 5)
//	public void yjltest5() throws InterruptedException {
//		email();
//		webtest.type("xpath=//input[@name='para137']", "�����");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para186']", "1837519045@qq.com");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para138']", "1");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para139']", "�ӱ�ʡ");
//		Thread.sleep(1000);
//		webtest.type("xpath=//textarea[@name='para140']", "��");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@class='form-control input-codeimg']", "aaaa");
//		Thread.sleep(1000);
//		sub();
//	}
//
//	// 6�������������ʧ�ܣ���ϵ��ַΪ��
//	@Test(priority = 6)
//	public void yjltest6() throws InterruptedException {
//		email();
//		webtest.type("xpath=//input[@name='para137']","�����");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para186']", "1837519045@qq.com");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para138']", "");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para139']", "�ӱ�ʡ");
//		Thread.sleep(1000);
//		webtest.type("xpath=//textarea[@name='para140']", "��");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@class='form-control input-codeimg']", "aaaa");
//		Thread.sleep(1000);
//		sub();
//	}
//
//	// 7,�����������ʧ�ܣ���ϵ��ַΪ��
//	@Test(priority = 7)
//	public void yjltest7() throws InterruptedException {
//		email();
//		webtest.type("xpath=//input[@name='para137']", "�����");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para186']", "1837519045@qq.com");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para138']", "18732338187");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para139']", "");
//		Thread.sleep(1000);
//		webtest.type("xpath=//textarea[@name='para140']", "��");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@class='form-control input-codeimg']", "aaaa");
//		Thread.sleep(1000);
//		sub();
//	}
//
//	// 8,�����������ʧ��,��������Ϊ��
//	@Test(priority = 8)
//	public void yjltest8() throws InterruptedException {
//		email();
//		webtest.type("xpath=//input[@name='para137']", "�����");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para186']", "1837519045@qq.com");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para138']", "18732338187");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para139']", "�ӱ�ʡ");
//		Thread.sleep(1000);
//		webtest.type("xpath=//textarea[@name='para140']", "");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@class='form-control input-codeimg']", "aaaa");
//		Thread.sleep(1000);
//		sub();
//	}
//
//	// 9,�����������ʧ��,Email��ʽ�����������1837519045@qq.com11111��
//	@Test(priority = 9)
//	public void yjltest9() throws InterruptedException {
//		email();
//		webtest.type("xpath=//input[@name='para137']", "�����");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para186']", "1837519045@qq.com11111");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para138']", "18732338187");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para139']", "�ӱ�ʡ");
//		Thread.sleep(1000);
//		webtest.type("xpath=//textarea[@name='para140']", "��");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@class='form-control input-codeimg']", "aaaa");
//		Thread.sleep(1000);
//		sub();
//	}
//
//	// 10�������������ʧ�ܣ���֤��Ϊ��
//	@Test(priority = 10)
//	public void yjltest10() throws InterruptedException {
//		email();
//		webtest.type("xpath=//input[@name='para137']","�����");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para186']", "1837519045@qq.com");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para138']", "18732338187");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para139']", "�ӱ�ʡ");
//		Thread.sleep(1000);
//		webtest.type("xpath=//textarea[@name='para140']", "��");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@class='form-control input-codeimg']", "");
//		Thread.sleep(1000);
//		sub();
//	}
//
//	// 11�������������ʧ�ܣ���֤�����
//	@Test(priority = 11)
//	public void yjltest11() throws InterruptedException {
//		email();
//		webtest.type("xpath=//input[@name='para137']", "�����");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para186']", "1837519045@qq.com");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para138']", "18732338187");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para139']", "�ӱ�ʡ");
//		Thread.sleep(1000);
//		webtest.type("xpath=//textarea[@name='para140']", "��");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@class='form-control input-codeimg']", "bbbb");
//		Thread.sleep(1000);
//		sub();
//	}
//
//	// 12,������ǰ̨����ʾ
//	@Test(priority = 12)
//	public void yjltest12() throws InterruptedException {
//		webtest.open("http://localhost:99/admin/index.php");
//		webtest.type("xpath=//input[@name='login_name']", "root");
//		webtest.type("xpath=//input[@name='login_pass']", "root");
//		webtest.click("xpath=//button[@class='btn btn-primary px-4']");
//		webtest.click("xpath=//button[@class='btn btn-default no-prompt']");
//		webtest.enterFrame(0);
//		webtest.click("xpath=//a[@title='��������']");
//		webtest.click("xpath=//a[@class='editable-click']");
//		webtest.click("xpath=//button[@data-index='5']");
//		webtest.leaveFrame();
//		webtest.click("xpath=//button[@class='btn btn-sm btn-primary mr-1']");
//		webtest.mouseToElementandClick("xpath=//div[@class='modal-body  oya met-scrollbar']");
//		webtest.down(3);
//		webtest.click("xpath=//button[@class='btn btn-primary']");
//		webtest.open("http://localhost:99/message/");
//	}
//
//	// 13,�ظ����Բ��Ҳ���ǰ̨������ʾ
//	@Test(priority = 13)
//	public void yjltest13() throws InterruptedException {
//		webtest.open("http://localhost:99/admin/index.php");
//		webtest.type("xpath=//input[@name='login_name']", "root");
//		webtest.type("xpath=//input[@name='login_pass']", "root");
//		webtest.click("xpath=//button[@class='btn btn-primary px-4']");
//		webtest.click("xpath=//button[@class='btn btn-default no-prompt']");
//		webtest.enterFrame(0);
//		webtest.click("xpath=//a[@title='��������']");
//		webtest.click("xpath=//a[@class='editable-click']");
//		webtest.click("xpath=//button[@data-index='5']");
//		webtest.leaveFrame();
//		webtest.click("xpath=//button[@class='btn btn-sm btn-primary mr-1']");
//		webtest.mouseToElementandClick("xpath=//div[@class='modal-body  oya met-scrollbar']");
//		webtest.down(3);
//		webtest.type("xpath=//textarea[@name='useinfo']", "��");
//		webtest.click("xpath=//button[@class='btn btn-primary']");
//		webtest.open("http://localhost:99/message/");
//	}
//
//	// 14,��̨�ɹ�ɾ������
//	@Test(priority = 14)
//	public void yjltest14() throws InterruptedException {
//		webtest.open("http://localhost:99/admin/index.php");
//		webtest.type("xpath=//input[@name='login_name']", "root");
//		webtest.type("xpath=//input[@name='login_pass']", "root");
//		webtest.click("xpath=//button[@class='btn btn-primary px-4']");
//		webtest.click("xpath=//button[@class='btn btn-default no-prompt']");
//		webtest.enterFrame(0);
//		webtest.click("xpath=//a[@title='��������']");
//		webtest.click("xpath=//a[@class='editable-click']");
//		webtest.click("xpath=//button[@data-index='5']");
//		webtest.leaveFrame();
//		webtest.click("xpath=//button[@class='btn btn-sm btn-default ']");
//		webtest.click("xpath=//button[@class='ok btn btn-primary']");
//		webtest.open("http://localhost:99/message/");
//	}
//
//	// 15���������Բ鿴����˵�����
//	@Test(priority = 15)
//	public void yjltest15() throws InterruptedException {
//		webtest.open("http://localhost:99/admin/index.php");
//		webtest.type("xpath=//input[@name='login_name']", "root");
//		webtest.type("xpath=//input[@name='login_pass']", "root");
//		webtest.click("xpath=//button[@class='btn btn-primary px-4']");
//		webtest.click("xpath=//button[@class='btn btn-default no-prompt']");
//		webtest.enterFrame(0);
//		webtest.click("xpath=//a[@title='��������']");
//		webtest.click("xpath=//a[@class='editable-click']");
//		webtest.click("xpath=//button[@data-index='5']");
//		webtest.leaveFrame();
//		webtest.click("xpath=//select[@name='checkok']");
//		webtest.click("xpath=//option[text()='��']");
//	}
//
//	// 16�����������в鿴δ�Ķ�����
//	@Test(priority = 16)
//	public void yjltest16() throws InterruptedException {
//		webtest.open("http://localhost:99/admin/index.php");
//		webtest.type("xpath=//input[@name='login_name']", "root");
//		webtest.type("xpath=//input[@name='login_pass']", "root");
//		webtest.click("xpath=//button[@class='btn btn-primary px-4']");
//		webtest.click("xpath=//button[@class='btn btn-default no-prompt']");
//		webtest.enterFrame(0);
//		webtest.click("xpath=//a[@title='��������']");
//		webtest.click("xpath=//a[@class='editable-click']");
//		webtest.click("xpath=//button[@data-index='5']");
//		webtest.leaveFrame();
//		webtest.click("xpath=//select[@name='search_type']");
//		webtest.click("xpath=//option[text()='δ�Ķ���Ϣ']");
//	}
//
//	// 17,�޸�ǰ̨��ʾ���Եķ�ʽ
//	@Test(priority = 17)
//	public void yjltest17() throws InterruptedException {
//		webtest.open("http://localhost:99/admin/index.php");
//		webtest.type("xpath=//input[@name='login_name']", "root");
//		webtest.type("xpath=//input[@name='login_pass']", "root");
//		webtest.click("xpath=//button[@class='btn btn-primary px-4']");
//		webtest.click("xpath=//button[@class='btn btn-default no-prompt']");
//		webtest.enterFrame(0);
//		webtest.click("xpath=//a[@title='��������']");
//		webtest.click("xpath=//a[@class='editable-click']");
//		webtest.click("xpath=//button[@data-index='6']");
//		webtest.leaveFrame();
//		webtest.click("xpath=//input[@class='custom-control-input']");
//		webtest.click("xpath=//button[@class='btn btn-primary ']");
//		webtest.open("http://localhost:99/admin/?lang=cn&n=ui_set");
//		webtest.enterFrame(0);
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[@title='��������']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[@class='editable-click']");
//		Thread.sleep(1000);
//		webtest.mouseToElement("xpath=//div[@m-id='message_form']");
//		webtest.down(4);
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para137']","�����");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para186']", "1837519045@qq.com");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para138']", "18732338187");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para139']", "�ӱ�ʡ");
//		Thread.sleep(1000);
//		webtest.type("xpath=//textarea[@name='para140']", "��");
//		Thread.sleep(2000);
//		webtest.type("xpath=//input[@class='form-control input-codeimg']", "aaaa");
//		Thread.sleep(1000);
//		sub();
//		webtest.alertAccept();
//		webtest.open("http://localhost:99/message/");
//	}
//
//	// 18,��ˢ��ʱ��
//	@Test(priority = 18)
//	public void yjltest18() throws InterruptedException {
//		webtest.open("http://localhost:99/");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[@title='��������']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[text()='��������']");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para137']", "�����");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para186']", "1837519045@qq.com");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para138']", "18732338187");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para139']", "�ӱ�ʡ");
//		Thread.sleep(1000);
//		webtest.type("xpath=//textarea[@name='para140']", "��");
//		Thread.sleep(2000);
//		webtest.type("xpath=//input[@class='form-control input-codeimg']", "aaaa");
//		Thread.sleep(1000);
//		webtest.click("xpath=//button[@class='btn btn-primary btn-block btn-squared']");
//		webtest.alertAccept();
//		Thread.sleep(2000);
//		webtest.type("xpath=//input[@name='para137']", "�����");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para186']", "1837519045@qq.com");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para138']", "18732338187");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para139']", "�ӱ�ʡ");
//		Thread.sleep(1000);
//		webtest.type("xpath=//textarea[@name='para140']", "��");
//		Thread.sleep(2000);
//		webtest.type("xpath=//input[@class='form-control input-codeimg']", "aaaa");
//		Thread.sleep(1000);
//		webtest.click("xpath=//button[@class='btn btn-primary btn-block btn-squared']");
//		webtest.alertAccept();
//	}
//
//	// 19,�޸ķ�ˢ��ʱ��Ϊ300��
//	@Test(priority = 19)
//	public void yjltest19() throws InterruptedException {
//		webtest.open("http://localhost:99/admin/index.php");
//		webtest.type("xpath=//input[@name='login_name']", "root");
//		webtest.type("xpath=//input[@name='login_pass']", "root");
//		webtest.click("xpath=//button[@class='btn btn-primary px-4']");
//		webtest.click("xpath=//button[@class='btn btn-default no-prompt']");
//		webtest.enterFrame(0);
//		webtest.click("xpath=//a[@title='��������']");
//		webtest.click("xpath=//a[@class='editable-click']");
//		webtest.click("xpath=//button[@data-index='6']");
//		webtest.leaveFrame();
//		webtest.typeAndClear("xpath=//input[@name='met_msg_time']", "300");
//		webtest.click("xpath=//button[@class='btn btn-primary ']");
//		webtest.open("http://localhost:root/");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[@title='��������']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[text()='��������']");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para137']", "�����");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para186']", "1837519045@qq.com");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para138']", "18732338187");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para139']", "�ӱ�ʡ");
//		Thread.sleep(1000);
//		webtest.type("xpath=//textarea[@name='para140']", "��");
//		Thread.sleep(2000);
//		webtest.type("xpath=//input[@class='form-control input-codeimg']", "aaaa");
//		Thread.sleep(1000);
//		webtest.click("xpath=//button[@class='btn btn-primary btn-block btn-squared']");
//		webtest.alertAccept();
//		Thread.sleep(2000);
//		webtest.type("xpath=//input[@name='para137']", "�����");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para186']", "1837519045@qq.com");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para138']", "18732338187");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para139']", "�ӱ�ʡ");
//		Thread.sleep(1000);
//		webtest.type("xpath=//textarea[@name='para140']", "��");
//		Thread.sleep(2000);
//		webtest.type("xpath=//input[@class='form-control input-codeimg']", "aaaa");
//		Thread.sleep(1000);
//		webtest.click("xpath=//button[@class='btn btn-primary btn-block btn-squared']");
//		webtest.alertAccept();
//	}
//
//	// 20���ɹ�����������ԣ�ǰ������Ϊ��¼����ǰ�˵�¼ִ�У�
//	@Test(priority = 20)
//	public void yjltest20() throws InterruptedException {
//		webtest.open("http://localhost:99/");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[@class='met_navbtn']");
//		webtest.type("xpath=//input[@name='username']", "user");
//		webtest.type("xpath=//input[@name='password']", "password");
////		webtest.type("xpath=//input[@name='code']", "aaaa");
//		webtest.click("xpath=//button[@class='btn btn-lg btn-primary btn-squared btn-block']");
//		webtest.click("xpath=//a[@title='��������']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[text()='��������']");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para137']", "�����");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para186']", "1837519045@qq.com");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para138']", "18732338187");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para139']", "�ӱ�ʡ");
//		Thread.sleep(1000);
//		webtest.type("xpath=//textarea[@name='para140']", "��");
//		Thread.sleep(2000);
//		webtest.type("xpath=//input[@class='form-control input-codeimg']", "aaaa");
//		Thread.sleep(1000);
//		webtest.click("xpath=//button[@class='btn btn-primary btn-block btn-squared']");
//		webtest.alertAccept();
//	}
//
//	// 21���ɹ���ǰ̨��ʾ���ԣ�ǰ��������ǰ�˵�¼��
//	@Test(priority = 21)
//	public void yjltest21() throws InterruptedException {
//		webtest.open("http://localhost:99/admin/index.php");
//		webtest.type("xpath=//input[@name='login_name']", "root");
//		webtest.type("xpath=//input[@name='login_pass']", "root");
////		webtest.type("xpath=//input[@name='code']", "aaaa");
//		webtest.click("xpath=//button[@class='btn btn-primary px-4']");
//		webtest.click("xpath=//button[@class='btn btn-default no-prompt']");
//		webtest.enterFrame(0);
//		webtest.click("xpath=//a[@title='��������']");
//		webtest.click("xpath=//a[@class='editable-click']");
//		webtest.click("xpath=//button[@data-index='5']");
//		webtest.leaveFrame();
//		webtest.click("xpath=//button[@class='btn btn-sm btn-primary mr-1']");
//		webtest.mouseToElementandClick("xpath=//div[@class='modal-body  oya met-scrollbar']");
//		webtest.down(3);
//		webtest.type("xpath=//textarea[@name='useinfo']", "��");
//		webtest.click("xpath=//label[text()='���ͨ������ǰ̨��ʾ']");
//		webtest.click("xpath=//button[@class='btn btn-primary']");
//		webtest.open("http://localhost:99");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[@class='met_navbtn']");
//		webtest.type("xpath=//input[@name='username']", "user");
//		webtest.type("xpath=//input[@name='password']", "password");
//		webtest.click("xpath=//button[@class='btn btn-lg btn-primary btn-squared btn-block']");
//		webtest.click("xpath=//a[@title='��������']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[text()='��������']");
//		Thread.sleep(1000);
//	}
//
//	// 22���޸����Ե��������ã���������Ϊ�Ǳ����
//	@Test(priority = 22)
//	public void yjltest22() throws InterruptedException {
//		webtest.open("http://localhost:99/admin/index.php");
//		webtest.type("xpath=//input[@name='login_name']", "root");
//		webtest.type("xpath=//input[@name='login_pass']", "root");
//		webtest.click("xpath=//button[@class='btn btn-primary px-4']");
//		webtest.click("xpath=//button[@class='btn btn-default no-prompt']");
//		webtest.enterFrame(0);
//		webtest.click("xpath=//a[@title='��������']");
//		webtest.click("xpath=//a[@class='editable-click']");
////		webtest.click("xpath=//div[@data-index='6']//button[2]");
//		webtest.leaveFrame();
//		webtest.click("xpath=//select[@name='wr_ok-137']");
//		webtest.click("xpath=//option[text()='??']");
//		webtest.click("xpath=//button[@class='btn btn-primary']");
//		webtest.open("http://localhost:99/");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[@title='��������']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[text()='��������']");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para137']", "");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para186']", "1837519045@qq.com");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para138']", "18732338187");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para139']", "�ӱ�ʡ");
//		Thread.sleep(1000);
//		webtest.type("xpath=//textarea[@name='para140']", "��");
//		Thread.sleep(2000);
//		webtest.type("xpath=//input[@class='form-control input-codeimg']", "aaaa");
//		Thread.sleep(1000);
//		webtest.click("xpath=//button[@class='btn btn-primary btn-block btn-squared']");
//		webtest.alertAccept();
//	}
//
//	// 23���޸��������ֶ�����Ϊ�ı�
//	@Test(priority = 23)
//	public void yjltest23() throws InterruptedException {
//		webtest.open("http://localhost:99/admin/index.php");
//		webtest.type("xpath=//input[@name='login_name']", "root");
//		webtest.type("xpath=//input[@name='login_pass']", "root");
//		webtest.click("xpath=//button[@class='btn btn-primary px-4']");
//		webtest.click("xpath=//button[@class='btn btn-default no-prompt']");
//		webtest.enterFrame(0);
//		webtest.click("xpath=//a[@title='��������']");
//		webtest.click("xpath=//a[@class='editable-click']");
//		webtest.click("xpath=//div[@data-index='6']//button[2]");
//		webtest.leaveFrame();
//		webtest.click("xpath=//select[@name='type-137']");
//		webtest.click("xpath=//option[text()='�ı�']");
//		webtest.click("xpath=//button[text()='����']");
//	}
//
//	// 24���޸������ķ���Ȩ��Ϊ��ͨ��Ա
//	@Test(priority = 24)
//	public void yjltest24() throws InterruptedException {
//		webtest.open("http://localhost:99/admin/index.php");
//		webtest.type("xpath=//input[@name='login_name']", "root");
//		webtest.type("xpath=//input[@name='login_pass']", "root");
//		webtest.click("xpath=//button[@class='btn btn-primary px-4']");
//		webtest.click("xpath=//button[@class='btn btn-default no-prompt']");
//		webtest.enterFrame(0);
//		webtest.click("xpath=//a[@title='��������']");
//		webtest.click("xpath=//a[@class='editable-click']");
//		webtest.click("xpath=//div[@data-index='6']//button[2]");
//		webtest.leaveFrame();
//		webtest.click("xpath=//select[@name='access-137']");
//		webtest.click("xpath=//option[text()='��ͨ��Ա']");
//		webtest.click("xpath=//button[text()='����']");
//	}
//
//	// 25,��̨����ɾ�����������
//	@Test(priority = 25)
//	public void yjltest25() throws InterruptedException {
//		webtest.open("http://localhost:99/admin/index.php");
//		webtest.type("xpath=//input[@name='login_name']", "root");
//		webtest.type("xpath=//input[@name='login_pass']", "root");
//		webtest.click("xpath=//button[@class='btn btn-primary px-4']");
//		webtest.click("xpath=//button[@class='btn btn-default no-prompt']");
//		webtest.enterFrame(0);
//		webtest.click("xpath=//a[@title='��������']");
//		webtest.click("xpath=//a[@class='editable-click']");
//		webtest.click("xpath=//div[@data-index='6']//button[2]");
//		webtest.leaveFrame();
//		webtest.click("xpath=//input[@name='id']");
//		webtest.click("xpath=//button[text()='ɾ��']");
//		webtest.click("xpath=//button[@class='ok btn btn-primary']");
//		webtest.open("http://localhost:99/");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[@title='��������']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[text()='��������']");
//	}
//
//	// 26����̨����������������
//	@Test(priority = 26)
//	public void yjltest26() throws InterruptedException {
//		webtest.open("http://localhost:99/admin/index.php");
//		webtest.type("xpath=//input[@name='login_name']", "root");
//		webtest.type("xpath=//input[@name='login_pass']", "root");
//		webtest.click("xpath=//button[@class='btn btn-primary px-4']");
//		webtest.click("xpath=//button[@class='btn btn-default no-prompt']");
//		webtest.enterFrame(0);
//		webtest.click("xpath=//a[@title='��������']");
//		webtest.click("xpath=//a[@class='editable-click']");
//		webtest.click("xpath=//div[@data-index='6']//button[2]");
//		webtest.leaveFrame();
//		webtest.click("xpath=//button[text()='���']");
//		webtest.type("xpath=//input[@name='name-new-0']", "????");
//		webtest.click("xpath=//button[@class='btn btn-primary']");
//		webtest.open("http://localhost:99/");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[@title='��������']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[text()='��������']");
//	}
//
//	// 27�����������ʾ����
//	@Test(priority = 27)
//	public void yjltest27() throws InterruptedException {
//		webtest.open("http://localhost:99/admin/index.php");
//		webtest.type("xpath=//input[@name='login_name']", "root");
//		webtest.type("xpath=//input[@name='login_pass']", "root");
//		webtest.click("xpath=//button[@class='btn btn-primary px-4']");
//		webtest.click("xpath=//button[@class='btn btn-default no-prompt']");
//		webtest.enterFrame(0);
//		webtest.click("xpath=//a[@title='��������']");
//		webtest.click("xpath=//a[@class='editable-click']");
//		webtest.click("xpath=//div[@data-index='6']//button[2]");
//		webtest.leaveFrame();
//		webtest.type("xpath=//input[@name='description-195']", "��ʵ����");
//		webtest.click("xpath=//button[@class='btn btn-primary']");
//		webtest.open("http://localhost:99/");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[@title='��������']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[text()='��������']");
//	}
//
//	// 28,�ɹ�������߷���
//	@Test(priority = 28)
//	public void yjltest28() throws InterruptedException {
//		email1();
//		webtest.click("xpath=//select[@name='para141']");
//		webtest.click("xpath=//option[@value='��ȡ����']");
//		webtest.type("xpath=//input[@name='para142']", "�����");
//		webtest.type("xpath=//input[@name='para143']", "��");
//		webtest.type("xpath=//input[@name='para144']", "1837519045@qq.com");
//		webtest.type("xpath=//input[@name='para176']", "18732338187");
//		webtest.type("xpath=//input[@name='para177']", "�ӱ�ʦ����ѧ");
//		webtest.type("xpath=//input[@name='para178']", "�ӱ�ʡ");
//		webtest.type("xpath=//textarea[@name='para179']", "��");
//		webtest.socll();
//		webtest.type("xpath=//input[@name='code']", "aaaa");
//		webtest.mouseToElement("xpath=//div[@class='form-group m-b-0']");
//		webtest.runJs(
//				"document.getElementsByClassName('btn btn-primary btn-lg btn-block btn-squared editable-click set')[0].className=''");
//		webtest.mouseToElementandClick("xpath=//button[text()='�ύ��Ϣ']");
//		Thread.sleep(1000);
//		webtest.alertAccept();
//	}
//
//	// 29��������߷���ʧ�ܣ���ѡ�������⣩
//	@Test(priority = 29)
//	public void yjltest29() throws InterruptedException {
//		email1();
//		webtest.type("xpath=//input[@name='para142']", "�����");
//		webtest.type("xpath=//input[@name='para143']", "��");
//		webtest.type("xpath=//input[@name='para144']", "1837519045@qq.com");
//		webtest.type("xpath=//input[@name='para176']", "18732338187");
//		webtest.type("xpath=//input[@name='para177']", "�ӱ�ʦ����ѧ");
//		webtest.type("xpath=//input[@name='para178']", "�ӱ�ʡ");
//		webtest.type("xpath=//textarea[@name='para179']", "��");
//		webtest.socll();
//		webtest.type("xpath=//input[@name='code']", "aaaa");
//		webtest.mouseToElement("xpath=//div[@class='form-group m-b-0']");
//		webtest.runJs(
//				"document.getElementsByClassName('btn btn-primary btn-lg btn-block btn-squared editable-click set')[0].className=''");
//		webtest.mouseToElementandClick("xpath=//button[text()='�ύ��Ϣ']");
//		Thread.sleep(1000);
//	}
//
//	// 30��������߷���ʧ�ܣ�Email�����Ϊ�գ�
//	@Test(priority = 30)
//	public void yjltest30() throws InterruptedException {
//		email1();
//		webtest.click("xpath=//select[@name='para141']");
//		webtest.click("xpath=//option[@value='��ȡ����']");
//		webtest.type("xpath=//input[@name='para142']", "�����");
//		webtest.type("xpath=//input[@name='para143']", "��");
//		webtest.type("xpath=//input[@name='para176']", "18732338187");
//		webtest.type("xpath=//input[@name='para177']", "�ӱ�ʦ����ѧ");
//		webtest.type("xpath=//input[@name='para178']", "�ӱ�ʡ");
//		webtest.type("xpath=//textarea[@name='para179']", "��");
//		webtest.socll();
//		webtest.type("xpath=//input[@name='code']", "aaaa");
//		webtest.mouseToElement("xpath=//div[@class='form-group m-b-0']");
//		webtest.runJs(
//				"document.getElementsByClassName('btn btn-primary btn-lg btn-block btn-squared editable-click set')[0].className=''");
//		webtest.mouseToElementandClick("xpath=//button[text()='�ύ��Ϣ']");
//		Thread.sleep(1000);
//	}
//
//	// 31��������߷���ʧ�ܣ�Email��ʽ�������롰123����
//	@Test(priority = 31)
//	public void yjltest31() throws InterruptedException {
//		email1();
//		webtest.click("xpath=//select[@name='para141']");
//		webtest.click("xpath=//option[@value='��ȡ����']");
//		webtest.type("xpath=//input[@name='para142']", "�����");
//		webtest.type("xpath=//input[@name='para143']", "��");
//		webtest.type("xpath=//input[@name='para144']", "123");
//		webtest.type("xpath=//input[@name='para176']", "18732338187");
//		webtest.type("xpath=//input[@name='para177']", "�ӱ�ʦ����ѧ");
//		webtest.type("xpath=//input[@name='para178']", "�ӱ�ʡ");
//		webtest.type("xpath=//textarea[@name='para179']", "��");
//		webtest.socll();
//		webtest.type("xpath=//input[@name='code']", "aaaa");
//		webtest.mouseToElement("xpath=//div[@class='form-group m-b-0']");
//		webtest.runJs(
//				"document.getElementsByClassName('btn btn-primary btn-lg btn-block btn-squared editable-click set')[0].className=''");
//		webtest.mouseToElementandClick("xpath=//button[text()='�ύ��Ϣ']");
//		Thread.sleep(1000);
//	}
//
//	// 32��������߷���ʧ�ܣ�Email��ʽ����������롰1837519045@qq.com11111����
//	@Test(priority = 32)
//	public void yjltest32() throws InterruptedException {
//		email1();
//		webtest.click("xpath=//select[@name='para141']");
//		webtest.click("xpath=//option[@value='��ȡ����']");
//		webtest.type("xpath=//input[@name='para142']", "�����");
//		webtest.type("xpath=//input[@name='para143']", "��");
//		webtest.type("xpath=//input[@name='para144']", "1837519045@qq.com11111");
//		webtest.type("xpath=//input[@name='para176']", "18732338187");
//		webtest.type("xpath=//input[@name='para177']", "�ӱ�ʦ����ѧ");
//		webtest.type("xpath=//input[@name='para178']", "�ӱ�ʡ");
//		webtest.type("xpath=//textarea[@name='para179']", "��");
//		webtest.socll();
//		webtest.type("xpath=//input[@name='code']", "aaaa");
//		webtest.mouseToElement("xpath=//div[@class='form-group m-b-0']");
//		webtest.runJs(
//				"document.getElementsByClassName('btn btn-primary btn-lg btn-block btn-squared editable-click set')[0].className=''");
//		webtest.mouseToElementandClick("xpath=//button[text()='�ύ��Ϣ']");
//		Thread.sleep(1000);
//		webtest.alertAccept();
//	}
//
//	// 33,������߷���ʧ��,��֤��Ϊ��
//	@Test(priority = 33)
//	public void yjltest33() throws InterruptedException {
//		email1();
//		webtest.click("xpath=//select[@name='para141']");
//		webtest.click("xpath=//option[@value='']");
//		webtest.type("xpath=//input[@name='para142']", "�����");
//		webtest.type("xpath=//input[@name='para143']", "��");
//		webtest.type("xpath=//input[@name='para144']", "1837519045@qq.com");
//		webtest.type("xpath=//input[@name='para176']", "18732338187");
//		webtest.type("xpath=//input[@name='para177']", "�ӱ�ʦ����ѧ");
//		webtest.type("xpath=//input[@name='para178']", "�ӱ�ʡ");
//		webtest.type("xpath=//textarea[@name='para179']", "��");
//		webtest.socll();
//		webtest.type("xpath=//input[@name='code']", "");
//		webtest.mouseToElement("xpath=//div[@class='form-group m-b-0']");
//		webtest.runJs(
//				"document.getElementsByClassName('btn btn-primary btn-lg btn-block btn-squared editable-click set')[0].className=''");
//		webtest.mouseToElementandClick("xpath=//button[text()='�ύ��Ϣ']");
//		Thread.sleep(1000);
//	}
//
//	// 34��������߷���ʧ�ܣ���֤�����
//	@Test(priority = 34)
//	public void yjltest34() throws InterruptedException {
//		email1();
//		webtest.click("xpath=//select[@name='para141']");
//		webtest.click("xpath=//option[@value='��ȡ����']");
//		webtest.type("xpath=//input[@name='para142']", "�����");
//		webtest.type("xpath=//input[@name='para143']", "��");
//		webtest.type("xpath=//input[@name='para144']", "1837519045@qq.com");
//		webtest.type("xpath=//input[@name='para176']", "18732338187");
//		webtest.type("xpath=//input[@name='para177']", "�ӱ�ʦ����ѧ");
//		webtest.type("xpath=//input[@name='para178']", "�ӱ�ʡ");
//		webtest.type("xpath=//textarea[@name='para179']", "��");
//		webtest.socll();
//		webtest.type("xpath=//input[@name='code']", "bbbb");
//		webtest.mouseToElement("xpath=//div[@class='form-group m-b-0']");
//		webtest.runJs(
//				"document.getElementsByClassName('btn btn-primary btn-lg btn-block btn-squared editable-click set')[0].className=''");
//		webtest.mouseToElementandClick("xpath=//button[text()='�ύ��Ϣ']");
//		Thread.sleep(1000);
//		webtest.alertAccept();
//	}
//
//	// 35,��ˢ��ʱ��
//	@Test(priority = 35)
//	public void yjltest35() throws InterruptedException {
//		webtest.open("http://localhost:99/");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[@title='��������']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[text()='���߷���']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//select[@name='para141']");
//		webtest.click("xpath=//option[@value='��ȡ����']");
//		webtest.type("xpath=//input[@name='para142']", "�����");
//		webtest.type("xpath=//input[@name='para143']", "��");
//		webtest.type("xpath=//input[@name='para144']", "1837519045@qq.com");
//		webtest.type("xpath=//input[@name='para176']", "18732338187");
//		webtest.type("xpath=//input[@name='para177']", "�ӱ�ʦ����ѧ");
//		webtest.type("xpath=//input[@name='para178']", "�ӱ�ʡ");
//		webtest.type("xpath=//textarea[@name='para179']", "��");
//		webtest.socll();
//		webtest.type("xpath=//input[@name='code']", "aaaa");
//		webtest.click("xpath=//button[text()='�ύ��Ϣ']");
//		Thread.sleep(1000);
//		webtest.alertAccept();
//		Thread.sleep(1000);
//		webtest.click("xpath=//select[@name='para141']");
//		webtest.click("xpath=//option[@value='��ȡ����']");
//		webtest.type("xpath=//input[@name='para142']", "�����");
//		webtest.type("xpath=//input[@name='para143']", "��");
//		webtest.type("xpath=//input[@name='para144']", "1837519045@qq.com");
//		webtest.type("xpath=//input[@name='para176']", "18732338187");
//		webtest.type("xpath=//input[@name='para177']", "�ӱ�ʦ����ѧ");
//		webtest.type("xpath=//input[@name='para178']", "�ӱ�ʡ");
//		webtest.type("xpath=//textarea[@name='para179']", "��");
//		webtest.socll();
//		webtest.type("xpath=//input[@name='code']", "aaaa");
//		webtest.click("xpath=//button[text()='�ύ��Ϣ']");
//		Thread.sleep(1000);
//		webtest.alertAccept();
//	}
//
//	// 36,�޸ķ�ˢ��ʱ��Ϊ300��
//	@Test(priority = 36)
//	public void yjltest36() throws InterruptedException {
//		email1();
//		webtest.click("xpath=//button[@data-index='5']");
//		webtest.leaveFrame();
//		webtest.typeAndClear("xpath=//input[@name='met_fd_time']", "300");
//		webtest.click("xpath=//button[@class='btn btn-primary ']");
//		webtest.open("http://localhost:99/");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[@title='��������']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[text()='���߷���']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//select[@name='para141']");
//		webtest.click("xpath=//option[@value='��ȡ����']");
//		webtest.type("xpath=//input[@name='para142']", "�����");
//		webtest.type("xpath=//input[@name='para143']", "��");
//		webtest.type("xpath=//input[@name='para144']", "1837519045@qq.com");
//		webtest.type("xpath=//input[@name='para176']", "18732338187");
//		webtest.type("xpath=//input[@name='para177']", "�ӱ�ʦ����ѧ");
//		webtest.type("xpath=//input[@name='para178']", "�ӱ�ʡ");
//		webtest.type("xpath=//textarea[@name='para179']", "��");
//		webtest.socll();
//		webtest.type("xpath=//input[@name='code']", "aaaa");
//		webtest.click("xpath=//button[text()='�ύ��Ϣ']");
//		Thread.sleep(1000);
//		webtest.alertAccept();
//		Thread.sleep(1000);
//		webtest.click("xpath=//select[@name='para141']");
//		webtest.click("xpath=//option[@value='��ȡ����']");
//		webtest.type("xpath=//input[@name='para142']", "�����");
//		webtest.type("xpath=//input[@name='para143']", "��");
//		webtest.type("xpath=//input[@name='para144']", "1837519045@qq.com");
//		webtest.type("xpath=//input[@name='para176']", "18732338187");
//		webtest.type("xpath=//input[@name='para177']", "�ӱ�ʦ����ѧ");
//		webtest.type("xpath=//input[@name='para178']", "�ӱ�ʡ");
//		webtest.type("xpath=//textarea[@name='para179']", "��");
//		webtest.socll();
//		webtest.type("xpath=//input[@name='code']", "aaaa");
//		webtest.click("xpath=//button[text()='�ύ��Ϣ']");
//		Thread.sleep(1000);
//		webtest.alertAccept();
//	}
//
//	// 37���ɹ�������߷�����ǰ������ǰ�˵�¼��
//	@Test(priority = 37)
//	public void yjltest37() throws InterruptedException {
//		webtest.open("http://localhost:99/");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[@class='met_navbtn']");
//		webtest.type("xpath=//input[@name='username']", "user");
//		webtest.type("xpath=//input[@name='password']", "password");
////		webtest.type("xpath=//input[@name='code']", "aaaa");
//		webtest.click("xpath=//button[@class='btn btn-lg btn-primary btn-squared btn-block']");
//		webtest.click("xpath=//a[@title='��������']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[text()='���߷���']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//select[@name='para141']");
//		webtest.click("xpath=//option[@value='��ȡ����']");
//		webtest.type("xpath=//input[@name='para142']", "�����");
//		webtest.type("xpath=//input[@name='para143']", "��");
//		webtest.type("xpath=//input[@name='para144']", "1837519045@qq.com");
//		webtest.type("xpath=//input[@name='para176']", "18732338187");
//		webtest.type("xpath=//input[@name='para177']", "�ӱ�ʦ����ѧ");
//		webtest.type("xpath=//input[@name='para178']", "�ӱ�ʡ");
//		webtest.type("xpath=//textarea[@name='para179']", "��");
//		webtest.socll();
//		webtest.type("xpath=//input[@name='code']", "aaaa");
//		webtest.click("xpath=//button[text()='�ύ��Ϣ']");
//		Thread.sleep(1000);
//		webtest.alertAccept();
//	}
//
//	// 38����̨�ɹ�ɾ������
//	@Test(priority = 38)
//	public void yjltest38() throws InterruptedException {
//		email1();
//		webtest.click("xpath=//div[@data-index='5']//button[2]");
//		webtest.leaveFrame();
//		webtest.click("xpath=//a[text()='������Ϣ����']");
//		webtest.click("xpath=//input[@class='checkall-item custom-control-input']");
//		webtest.click("xpath=//button[text()='ɾ��']");
//		webtest.click("xpath=//button[@class='ok btn btn-primary']");
//	}
//
//	// 39,�鿴���߷�����δ�Ķ�����Ϣ
//	@Test(priority = 39)
//	public void yjltest39() throws InterruptedException {
//		email1();
//		webtest.click("xpath=//div[@data-index='5']//button[2]");
//		webtest.leaveFrame();
//		webtest.click("xpath=//a[text()='������Ϣ����']");
//		webtest.click("xpath=//select[@name='search_type']");
//		webtest.click("xpath=//option[text()='δ�Ķ�']");
//	}
//
//	// 40���鿴��������Ϊ���в�Ʒ�����߷���
//	@Test(priority = 40)
//	public void yjltest40() throws InterruptedException {
//		email1();
//		webtest.click("xpath=//div[@data-index='5']//button[2]");
//		webtest.leaveFrame();
//		webtest.click("xpath=//a[text()='������Ϣ����']");
//		webtest.click("xpath=//select[@name='para_141']");
//		webtest.click("xpath=//option[text()='���в�Ʒ']");
//	}
//
//	// 41���޸ķ����������ã���������������Ϊ�Ǳ����?
//	@Test(priority = 41)
//	public void yjltest41() throws InterruptedException {
//		email1();
//		webtest.click("xpath=//div[@data-index='5']//button[2]");
//		webtest.leaveFrame();
//		webtest.click("xpath=//select[@name='wr_ok-141']");
//		webtest.click("xpath=//option[text()='��']");
//		webtest.click("xpath=//button[@class='btn btn-primary']");
//		webtest.open("http://localhost:99/");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[@title='��������']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[text()='���߷���']");
//		Thread.sleep(1000);
//		webtest.type("xpath=//input[@name='para142']", "�����");
//		webtest.type("xpath=//input[@name='para143']", "��");
//		webtest.type("xpath=//input[@name='para144']", "1837519045@qq.com");
//		webtest.type("xpath=//input[@name='para176']", "18732338187");
//		webtest.type("xpath=//input[@name='para177']", "�ӱ�ʦ����ѧ");
//		webtest.type("xpath=//input[@name='para178']", "�ӱ�ʡ");
//		webtest.type("xpath=//textarea[@name='para179']", "��");
//		webtest.socll();
//		webtest.type("xpath=//input[@name='code']", "aaaa");
//		webtest.click("xpath=//button[text()='�ύ��Ϣ']");
//		Thread.sleep(1000);
//		webtest.alertAccept();
//	}
//
//	// 42���޸��������ֶ�����Ϊ�ı�
//	@Test(priority = 42)
//	public void yjltest42() throws InterruptedException {
//		email1();
//		webtest.click("xpath=//div[@data-index='5']//button[2]");
//		webtest.leaveFrame();
//		webtest.click("xpath=//select[@name='type-142']");
//		webtest.click("xpath=//option[text()='�ı�']");
//		webtest.click("xpath=//button[text()='����']");
//	}
//
//	// 43,�޸�������������ĿΪ���߷���
//	@Test(priority = 43)
//	public void yjltest43() throws InterruptedException {
//		email1();
//		webtest.click("xpath=//div[@data-index='5']//button[2]");
//		webtest.leaveFrame();
//		webtest.click("xpath=//select[@name='class-142']");
//		webtest.click("xpath=//option[text()='���߷���']");
//		webtest.click("xpath=//button[text()='����']");
//	}
//
//	// 44,�޸������ķ���Ȩ��Ϊ��ͨ��Ա
//	@Test(priority = 44)
//	public void yjltest44() throws InterruptedException {
//		email1();
//		webtest.click("xpath=//div[@data-index='5']//button[2]");
//		webtest.leaveFrame();
//		webtest.click("xpath=//select[@name='access-142']");
//		webtest.click("xpath=//option[text()='��ͨ��Ա']");
//		webtest.click("xpath=//button[text()='����']");
//	}
//
//	// 45,�޸ķ����������ã�ɾ��������
//	@Test(priority = 45)
//	public void yjltest45() throws InterruptedException {
//		email1();
//		webtest.click("xpath=//div[@data-index='5']//button[2]");
//		webtest.leaveFrame();
//		webtest.click("xpath=//input[@value='142']");
//		webtest.click("xpath=//button[text()='ɾ��']");
//		webtest.click("xpath=//button[@class='ok btn btn-primary']");
//		webtest.open("http://localhost:99/");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[@title='��������']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[text()='���߷���']");
//		Thread.sleep(1000);
//	}
//
//	// 46,�޸ķ����������ã����������
//	@Test(priority = 46)
//	public void yjltest46() throws InterruptedException {
//		email1();
//		webtest.click("xpath=//div[@data-index='5']//button[2]");
//		webtest.leaveFrame();
//		webtest.click("xpath=//button[text()='���']");
//		webtest.type("xpath=//input[@name='name-new-0']", "����");
//		webtest.click("xpath=//button[@class='btn btn-primary']");
//		webtest.open("http://localhost:99/");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[@title='��������']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[text()='���߷���']");
//	}
//
//	// 47��ְ�������ʾ����
//	@Test(priority = 47)
//	public void yjltest47() throws InterruptedException {
//		email1();
//		webtest.click("xpath=//div[@data-index='5']//button[2]");
//		webtest.leaveFrame();
//		webtest.type("xpath=//input[@name='description-143']", "����ְ��");
//		webtest.click("xpath=//button[@class='btn btn-primary']");
//		webtest.open("http://localhost:99/");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[@title='��������']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[text()='���߷���']");
//	}
//
//	// 48���޸Ĺ�˾���Ϊ��˾����
//	@Test(priority = 48)
//	public void yjltest48() throws InterruptedException {
//		webtest.open("http://localhost:99/admin/index.php");
//		webtest.type("xpath=//input[@name='login_name']", "root");
//		webtest.type("xpath=//input[@name='login_pass']", "root");
//		webtest.click("xpath=//button[@class='btn btn-primary px-4']");
//		webtest.click("xpath=//button[@class='btn btn-default no-prompt']");
//		webtest.enterFrame(0);
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[@title='��������']");
//		Thread.sleep(1000);
//		webtest.mouseToElement("xpath=//a[@met-id='39']");
//		webtest.click("xpath=//button[@data-index='34']");
//		webtest.typeAndClear("xpath=//input[@class='form-control input-sm']", "��˾����");
//		webtest.click("xpath=//button[@class='btn btn-primary btn-xs editable-submit']");
//	}
//
//	// 49���޸���ϵ���ǵı���ͼ��ɫ
//	@Test(priority = 49)
//	public void yjltest49() throws InterruptedException {
//		webtest.open("http://localhost:99/admin/index.php");
//		webtest.type("xpath=//input[@name='login_name']", "root");
//		webtest.type("xpath=//input[@name='login_pass']", "root");
//		webtest.click("xpath=//button[@class='btn btn-primary px-4']");
//		webtest.click("xpath=//button[@class='btn btn-default no-prompt']");
//		webtest.enterFrame(0);
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[@title='��������']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[@met-id='77']");
//		webtest.click("xpath=//button[@data-index='3']");
//		webtest.leaveFrame();
//		webtest.typeAndClear("xpath=//input[@name='36_metinfo']", "#edb4ea");
//		webtest.click("xpath=//button[@class='btn btn-primary']");
//		webtest.open("http://localhost:99/");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[@title='��������']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[text()='��ϵ����']");
//	}
//
//	// 50���޸����߷����ı���ͼ�е�����Ϊ����
//	@Test(priority = 50)
//	public void yjltest50() throws InterruptedException {
//		webtest.open("http://localhost:99/admin/index.php");
//		webtest.type("xpath=//input[@name='login_name']", "root");
//		webtest.type("xpath=//input[@name='login_pass']", "root");
//		webtest.click("xpath=//button[@class='btn btn-primary px-4']");
//		webtest.click("xpath=//button[@class='btn btn-default no-prompt']");
//		webtest.enterFrame(0);
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[@title='��������']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[@met-id='44']");
//		webtest.mouseToElement("xpath=//h3[@class='vertical-align-middle editable-click']");
//		webtest.click("xpath=//button[@data-index='33']");
//		webtest.typeAndClear("xpath=//input[@class='form-control input-sm']", "����");
//		webtest.click("xpath=//button[@class='btn btn-primary btn-xs editable-submit']");
//	}
//}
