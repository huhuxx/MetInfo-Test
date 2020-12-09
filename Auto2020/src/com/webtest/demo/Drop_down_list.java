package com.webtest.demo;


import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.utils.ReadProperties;

public class Drop_down_list extends BaseTest{
	@Test(priority = 3)
	public void DropdownList_Show() throws InterruptedException {
		webtest.enterFrame1("xpath=//iframe[@src='http://localhost:99/index.php?lang=cn&pageset=1']");
		webtest.mouseToElement("xpath=//span[text()='���Ŷ�̬']");
		Thread.sleep(2000);
		webtest.click("xpath=//span[text()='���Ŷ�̬']");
		Thread.sleep(2000);
		System.out.println("��������3");
		webtest.leaveFrame();
	}
	
	@Test(priority = 4)
	public void DropdownList_MediaEdit() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='��Ŀ']");
		Thread.sleep(2000);
		List<WebElement> elementDown= webtest.findElements("xpath=//i[@class='fa-angle-down h5 mb-0']");
		elementDown.get(3).click();
		Thread.sleep(2000);
		List<WebElement> elementEdit = webtest.findElements("xpath=//input[@class=' form-control']");
		webtest.typeAndClear(elementEdit.get(3), "��-����1");
		Thread.sleep(2000);
		System.out.println("��������4");
	}
	
	@Test(priority = 5)
	public void DropdownList_IndustryEdit() throws InterruptedException {
		List<WebElement> elementEdit = webtest.findElements("xpath=//input[@class=' form-control']");
		webtest.typeAndClear(elementEdit.get(4), "��-��Ѷ2");
		Thread.sleep(2000);
		System.out.println("��������5");
	}
	
	@Test(priority = 6)
	public void DropdownList_CorporateEdit() throws InterruptedException {
		List<WebElement> elementEdit = webtest.findElements("xpath=//input[@class=' form-control']");
		webtest.typeAndClear(elementEdit.get(5), "��-��ҵ3");
		Thread.sleep(2000);
		System.out.println("��������6");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//�����������·�
		js.executeScript("window.scroll(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		webtest.click("xpath=//button[text()='����']");
		webtest.click("xpath=//button[text()='�ر�']");
		Thread.sleep(2000);
	}
	
	@Test(priority = 7)
	public void DropdownList_MediaNavigation_Head() throws InterruptedException {
		webtest.click("xpath=//a[text()='��Ŀ']");
		Thread.sleep(2000);
		List<WebElement> elementDown= webtest.findElements("xpath=//i[@class='fa-angle-down h5 mb-0']");
		elementDown.get(3).click();
		Thread.sleep(2000);
		List<WebElement> elementEdit_Head = webtest.findElements("xpath=//button[@class='btn btn-sm btn-primary mr-1']");
		System.out.println("'����'�İ�ťһ����"+elementEdit_Head.size());
		elementEdit_Head.get(3).click();
		Thread.sleep(2000);
		List<WebElement> elementNavigation= webtest.findElements("xpath=//input[@class='custom-control-input']");
		elementNavigation.get(2).click();
		Thread.sleep(2000);
		List<WebElement> elementSave= webtest.findElements("xpath=//button[@class='btn btn-primary']");
		System.out.println("'����'�İ�ťһ����"+elementSave.size()+"��");
		elementSave.get(3).click();
		Thread.sleep(2000);
		System.out.println("��������7");
		webtest.click("xpath=//button[text()='�ر�']");
	}
	
	@Test(priority = 8)
	public void DropdownList_CorporateNavigation_Head() throws InterruptedException {
		webtest.click("xpath=//a[text()='��Ŀ']");
		Thread.sleep(2000);
		List<WebElement> elementDown= webtest.findElements("xpath=//i[@class='fa-angle-down h5 mb-0']");
		elementDown.get(3).click();
		Thread.sleep(2000);
		List<WebElement> elementEdit_Head = webtest.findElements("xpath=//button[@class='btn btn-sm btn-primary mr-1']");
		elementEdit_Head.get(4).click();
		Thread.sleep(2000);
		List<WebElement> elementNavigation= webtest.findElements("xpath=//input[@class='custom-control-input']");
		elementNavigation.get(2).click();
		Thread.sleep(2000);
		List<WebElement> elementSave= webtest.findElements("xpath=//button[@class='btn btn-primary']");
		//System.out.println("'����'�İ�ťһ����"+elementSave.size()+"��");
		elementSave.get(3).click();
		Thread.sleep(2000);
		System.out.println("��������8");
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//�����������·�
		//js.executeScript("window.scroll(0,document.body.scrollHeight)");
		//Thread.sleep(3000);
		//webtest.click("xpath=//button[text()='����']");
		webtest.click("xpath=//button[text()='�ر�']");
	}
	
	@Test(priority = 9)
	public void DropdownList_IndustryNavigation_Head() throws InterruptedException {
		webtest.click("xpath=//a[text()='��Ŀ']");
		Thread.sleep(2000);
		List<WebElement> elementDown= webtest.findElements("xpath=//i[@class='fa-angle-down h5 mb-0']");
		elementDown.get(3).click();
		Thread.sleep(2000);
		List<WebElement> elementEdit_Head = webtest.findElements("xpath=//button[@class='btn btn-sm btn-primary mr-1']");
		elementEdit_Head.get(5).click();
		Thread.sleep(2000);
		List<WebElement> elementNavigation= webtest.findElements("xpath=//input[@class='custom-control-input']");
		elementNavigation.get(2).click();
		Thread.sleep(2000);
		List<WebElement> elementSave= webtest.findElements("xpath=//button[@class='btn btn-primary']");
		//System.out.println("'����'�İ�ťһ����"+elementSave.size()+"��");
		elementSave.get(3).click();
		Thread.sleep(2000);
		System.out.println("��������9");
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//�����������·�
		//js.executeScript("window.scroll(0,document.body.scrollHeight)");
		//Thread.sleep(3000);
		//webtest.click("xpath=//button[text()='����']");
		webtest.click("xpath=//button[text()='�ر�']");
	}
	
	@Test(priority = 10)
	public void DropdownList_MediaNavigation_Bottom() throws InterruptedException {
		webtest.click("xpath=//a[text()='��Ŀ']");
		Thread.sleep(2000);
		List<WebElement> elementDown= webtest.findElements("xpath=//i[@class='fa-angle-down h5 mb-0']");
		elementDown.get(3).click();
		Thread.sleep(2000);
		List<WebElement> elementEdit_Head = webtest.findElements("xpath=//button[@class='btn btn-sm btn-primary mr-1']");
		elementEdit_Head.get(3).click();
		Thread.sleep(2000);
		List<WebElement> elementNavigation= webtest.findElements("xpath=//input[@class='custom-control-input']");
		elementNavigation.get(3).click();
		Thread.sleep(2000);
		List<WebElement> elementSave= webtest.findElements("xpath=//button[@class='btn btn-primary']");
		elementSave.get(3).click();
		Thread.sleep(2000);
		System.out.println("��������10");
		webtest.click("xpath=//button[text()='�ر�']");
	}
	
	@Test(priority = 11)
	public void DropdownList_CorporateNavigation_Bottom() throws InterruptedException {
		webtest.click("xpath=//a[text()='��Ŀ']");
		Thread.sleep(2000);
		List<WebElement> elementDown= webtest.findElements("xpath=//i[@class='fa-angle-down h5 mb-0']");
		elementDown.get(3).click();
		Thread.sleep(2000);
		List<WebElement> elementEdit_Head = webtest.findElements("xpath=//button[@class='btn btn-sm btn-primary mr-1']");
		elementEdit_Head.get(4).click();
		Thread.sleep(2000);
		List<WebElement> elementNavigation= webtest.findElements("xpath=//input[@class='custom-control-input']");
		elementNavigation.get(3).click();
		Thread.sleep(2000);
		List<WebElement> elementSave= webtest.findElements("xpath=//button[@class='btn btn-primary']");
		elementSave.get(3).click();
		Thread.sleep(2000);
		System.out.println("��������11");
		webtest.click("xpath=//button[text()='�ر�']");
	}
	
	@Test(priority = 12)
	public void DropdownList_IndustryNavigation_Bottom() throws InterruptedException {
		webtest.click("xpath=//a[text()='��Ŀ']");
		Thread.sleep(2000);
		List<WebElement> elementDown= webtest.findElements("xpath=//i[@class='fa-angle-down h5 mb-0']");
		elementDown.get(3).click();
		Thread.sleep(2000);
		List<WebElement> elementEdit_Head = webtest.findElements("xpath=//button[@class='btn btn-sm btn-primary mr-1']");
		elementEdit_Head.get(5).click();
		Thread.sleep(2000);
		List<WebElement> elementNavigation= webtest.findElements("xpath=//input[@class='custom-control-input']");
		elementNavigation.get(3).click();
		Thread.sleep(2000);
		List<WebElement> elementSave= webtest.findElements("xpath=//button[@class='btn btn-primary']");
		elementSave.get(3).click();
		Thread.sleep(2000);
		System.out.println("��������12");
		webtest.click("xpath=//button[text()='�ر�']");
	}
	
	@Test(priority = 13)
	public void DropdownList_MediaNavigation_All() throws InterruptedException {
		webtest.click("xpath=//a[text()='��Ŀ']");
		Thread.sleep(2000);
		List<WebElement> elementDown= webtest.findElements("xpath=//i[@class='fa-angle-down h5 mb-0']");
		elementDown.get(3).click();
		Thread.sleep(2000);
		List<WebElement> elementEdit_Head = webtest.findElements("xpath=//button[@class='btn btn-sm btn-primary mr-1']");
		elementEdit_Head.get(3).click();
		Thread.sleep(2000);
		List<WebElement> elementNavigation= webtest.findElements("xpath=//input[@class='custom-control-input']");
		elementNavigation.get(4).click();
		Thread.sleep(2000);
		List<WebElement> elementSave= webtest.findElements("xpath=//button[@class='btn btn-primary']");
		elementSave.get(3).click();
		Thread.sleep(2000);
		System.out.println("��������13");
		webtest.click("xpath=//button[text()='�ر�']");
	}
	
	@Test(priority = 14)
	public void DropdownList_CorporateNavigation_All() throws InterruptedException {
		webtest.click("xpath=//a[text()='��Ŀ']");
		Thread.sleep(2000);
		List<WebElement> elementDown= webtest.findElements("xpath=//i[@class='fa-angle-down h5 mb-0']");
		elementDown.get(3).click();
		Thread.sleep(2000);
		List<WebElement> elementEdit_Head = webtest.findElements("xpath=//button[@class='btn btn-sm btn-primary mr-1']");
		elementEdit_Head.get(4).click();
		Thread.sleep(2000);
		List<WebElement> elementNavigation= webtest.findElements("xpath=//input[@class='custom-control-input']");
		elementNavigation.get(4).click();
		Thread.sleep(2000);
		List<WebElement> elementSave= webtest.findElements("xpath=//button[@class='btn btn-primary']");
		elementSave.get(3).click();
		Thread.sleep(2000);
		System.out.println("��������14");
		webtest.click("xpath=//button[text()='�ر�']");
	}
	
	@Test(priority = 15)
	public void DropdownList_IndustryNavigation_All() throws InterruptedException {
		webtest.click("xpath=//a[text()='��Ŀ']");
		Thread.sleep(2000);
		List<WebElement> elementDown= webtest.findElements("xpath=//i[@class='fa-angle-down h5 mb-0']");
		elementDown.get(3).click();
		Thread.sleep(2000);
		List<WebElement> elementEdit_Head = webtest.findElements("xpath=//button[@class='btn btn-sm btn-primary mr-1']");
		elementEdit_Head.get(5).click();
		Thread.sleep(2000);
		List<WebElement> elementNavigation= webtest.findElements("xpath=//input[@class='custom-control-input']");
		elementNavigation.get(4).click();
		Thread.sleep(2000);
		List<WebElement> elementSave= webtest.findElements("xpath=//button[@class='btn btn-primary']");
		elementSave.get(3).click();
		Thread.sleep(2000);
		System.out.println("��������15");
		webtest.click("xpath=//button[text()='�ر�']");
	}
	
	@Test(priority = 16)
	public void DropdownList_MediaNewOpen() throws InterruptedException {
		webtest.click("xpath=//a[text()='��Ŀ']");
		Thread.sleep(2000);
		List<WebElement> elementDown= webtest.findElements("xpath=//i[@class='fa-angle-down h5 mb-0']");
		elementDown.get(3).click();
		Thread.sleep(2000);
		List<WebElement> elementEdit_Head = webtest.findElements("xpath=//button[@class='btn btn-sm btn-primary mr-1']");
		elementEdit_Head.get(3).click();
		Thread.sleep(2000);
		List<WebElement> elementNavigation= webtest.findElements("xpath=//input[@class='custom-control-input']");
		elementNavigation.get(5).click();
		Thread.sleep(2000);
		List<WebElement> elementSave= webtest.findElements("xpath=//button[@class='btn btn-primary']");
		elementSave.get(3).click();
		Thread.sleep(2000);
		System.out.println("��������16");
		webtest.click("xpath=//button[text()='�ر�']");
		
	}
	
	@Test(priority = 17)
	public void DropdownList_CorporateNewOpen() throws InterruptedException {
		webtest.click("xpath=//a[text()='��Ŀ']");
		Thread.sleep(2000);
		List<WebElement> elementDown= webtest.findElements("xpath=//i[@class='fa-angle-down h5 mb-0']");
		elementDown.get(3).click();
		Thread.sleep(2000);
		List<WebElement> elementEdit_Head = webtest.findElements("xpath=//button[@class='btn btn-sm btn-primary mr-1']");
		elementEdit_Head.get(4).click();
		Thread.sleep(2000);
		List<WebElement> elementNavigation= webtest.findElements("xpath=//input[@class='custom-control-input']");
		elementNavigation.get(5).click();
		Thread.sleep(2000);
		List<WebElement> elementSave= webtest.findElements("xpath=//button[@class='btn btn-primary']");
		elementSave.get(3).click();
		Thread.sleep(2000);
		System.out.println("��������17");
		webtest.click("xpath=//button[text()='�ر�']");
	}
	
	@Test(priority = 18)
	public void DropdownList_IndustryNewOpen() throws InterruptedException {
		webtest.click("xpath=//a[text()='��Ŀ']");
		Thread.sleep(2000);
		List<WebElement> elementDown= webtest.findElements("xpath=//i[@class='fa-angle-down h5 mb-0']");
		elementDown.get(3).click();
		Thread.sleep(2000);
		List<WebElement> elementEdit_Head = webtest.findElements("xpath=//button[@class='btn btn-sm btn-primary mr-1']");
		elementEdit_Head.get(5).click();
		Thread.sleep(2000);
		List<WebElement> elementNavigation= webtest.findElements("xpath=//input[@class='custom-control-input']");
		elementNavigation.get(5).click();
		Thread.sleep(2000);
		List<WebElement> elementSave= webtest.findElements("xpath=//button[@class='btn btn-primary']");
		elementSave.get(3).click();
		Thread.sleep(2000);
		System.out.println("��������18");
		webtest.click("xpath=//button[text()='�ر�']");
	}
	
	@Test(priority = 19)
	public void DropdownList_MediaOrder() throws InterruptedException {
		webtest.click("xpath=//a[text()='��Ŀ']");
		Thread.sleep(2000);
		List<WebElement> elementDown= webtest.findElements("xpath=//i[@class='fa-angle-down h5 mb-0']");
		elementDown.get(3).click();
		Thread.sleep(2000);
		List<WebElement> elementEdit_Head = webtest.findElements("xpath=//button[@class='btn btn-sm btn-primary mr-1']");
		elementEdit_Head.get(3).click();
		Thread.sleep(2000);
		List<WebElement> elementNavigation= webtest.findElements("xpath=//input[@class='custom-control-input']");
		//System.out.println(elementNavigation.size());
		elementNavigation.get(8).click();
		Thread.sleep(2000);
		List<WebElement> elementSave= webtest.findElements("xpath=//button[@class='btn btn-primary']");
		elementSave.get(3).click();
		Thread.sleep(2000);
		System.out.println("��������19");
		webtest.click("xpath=//button[text()='�ر�']");
		
	}
	
	@Test(priority = 20)
	public void DropdownList_CorporateOrder() throws InterruptedException {
		webtest.click("xpath=//a[text()='��Ŀ']");
		Thread.sleep(2000);
		List<WebElement> elementDown= webtest.findElements("xpath=//i[@class='fa-angle-down h5 mb-0']");
		elementDown.get(3).click();
		Thread.sleep(2000);
		List<WebElement> elementEdit_Head = webtest.findElements("xpath=//button[@class='btn btn-sm btn-primary mr-1']");
		elementEdit_Head.get(4).click();
		Thread.sleep(2000);
		List<WebElement> elementNavigation= webtest.findElements("xpath=//input[@class='custom-control-input']");
		elementNavigation.get(8).click();
		Thread.sleep(2000);
		List<WebElement> elementSave= webtest.findElements("xpath=//button[@class='btn btn-primary']");
		elementSave.get(3).click();
		Thread.sleep(2000);
		System.out.println("��������20");
		webtest.click("xpath=//button[text()='�ر�']");
	}
	
	@Test(priority = 21)
	public void DropdownList_IndustryOrder() throws InterruptedException {
		webtest.click("xpath=//a[text()='��Ŀ']");
		Thread.sleep(2000);
		List<WebElement> elementDown= webtest.findElements("xpath=//i[@class='fa-angle-down h5 mb-0']");
		elementDown.get(3).click();
		Thread.sleep(2000);
		List<WebElement> elementEdit_Head = webtest.findElements("xpath=//button[@class='btn btn-sm btn-primary mr-1']");
		elementEdit_Head.get(5).click();
		Thread.sleep(2000);
		List<WebElement> elementNavigation= webtest.findElements("xpath=//input[@class='custom-control-input']");
		elementNavigation.get(8).click();
		Thread.sleep(2000);
		List<WebElement> elementSave= webtest.findElements("xpath=//button[@class='btn btn-primary']");
		elementSave.get(3).click();
		Thread.sleep(2000);
		System.out.println("��������21");
		webtest.click("xpath=//button[text()='�ر�']");
	}
	
	@Test(priority = 22)
	public void DropdownList_AddChild() throws InterruptedException {
		webtest.click("xpath=//a[text()='��Ŀ']");
		Thread.sleep(2000);
		List<WebElement> elementEdit_More = webtest.findElements("xpath=//button[@class='btn btn-sm btn-default dropdown-toggle']");
		System.out.println("һ����'����'��ť"+elementEdit_More.size()+"��");
		elementEdit_More.get(2).click();
		Thread.sleep(2000);
		List<WebElement> elementEdit_add = webtest.findElements("xpath=//a[@class='dropdown-item btn-add-subcolumn']");
		System.out.println("һ����'�������Ŀ'��ť"+elementEdit_add.size()+"��");
		elementEdit_add.get(2).click();
		Thread.sleep(2000);
		List<WebElement> elementEdit_addtext = webtest.findElements("xpath=//input[@class=' form-control']");
		webtest.typeAndClear(elementEdit_addtext.get(6), "��-���4");
		Thread.sleep(2000);
		List<WebElement> elementSave= webtest.findElements("xpath=//button[@class='btn btn-primary']");
		elementSave.get(4).click();
		System.out.println("�������Ŀ");
		Thread.sleep(2000);
		System.out.println("��������22");
		webtest.click("xpath=//button[text()='�ر�']");
	}
	
	@Test(priority = 23)
	public void DropdownList_AddChild1() throws InterruptedException {
		webtest.click("xpath=//a[text()='��Ŀ']");
		Thread.sleep(2000);
		List<WebElement> elementEdit_More = webtest.findElements("xpath=//button[@class='btn btn-sm btn-default dropdown-toggle']");
		elementEdit_More.get(2).click();
		Thread.sleep(2000);
		List<WebElement> elementEdit_add = webtest.findElements("xpath=//a[@class='dropdown-item btn-add-subcolumn']");
		elementEdit_add.get(2).click();
		Thread.sleep(2000);
		List<WebElement> elementEdit_addtext = webtest.findElements("xpath=//input[@class=' form-control']");
		webtest.typeAndClear(elementEdit_addtext.get(6), "��-���5");
		Thread.sleep(2000);
		List<WebElement> elementSave= webtest.findElements("xpath=//button[@class='btn btn-primary']");
		elementSave.get(4).click();
		System.out.println("�������Ŀ");
		Thread.sleep(2000);
		System.out.println("��������23");
		webtest.click("xpath=//button[text()='�ر�']");
	}
	
	@Test(priority = 24)
	public void DropdownList_AddChild_child() throws InterruptedException {
		webtest.click("xpath=//a[text()='��Ŀ']");
		Thread.sleep(2000);
		List<WebElement> elementDown= webtest.findElements("xpath=//i[@class='fa-angle-down h5 mb-0']");
		elementDown.get(3).click();
		Thread.sleep(2000);
		List<WebElement> elementEdit_More = webtest.findElements("xpath=//button[@class='btn btn-sm btn-default dropdown-toggle']");
		elementEdit_More.get(4).click();
		Thread.sleep(2000);
		List<WebElement> elementEdit_add = webtest.findElements("xpath=//a[@class='dropdown-item btn-add-subcolumn']");
		elementEdit_add.get(4).click();
		Thread.sleep(2000);
		List<WebElement> elementEdit_addtext = webtest.findElements("xpath=//input[@class=' form-control']");
		System.out.println(elementEdit_addtext.size());
		webtest.typeAndClear(elementEdit_addtext.get(11), "��-���6");
		Thread.sleep(2000);
		List<WebElement> elementSave= webtest.findElements("xpath=//button[@class='btn btn-primary']");
		elementSave.get(4).click();
		System.out.println("�������Ŀ");
		Thread.sleep(2000);
		System.out.println("��������24");
		webtest.click("xpath=//button[text()='�ر�']");
	}
	
	@Test(priority = 25)
	public void DropdownList_up() throws InterruptedException {
		webtest.click("xpath=//a[text()='��Ŀ']");
		Thread.sleep(2000);
		List<WebElement> elementDown= webtest.findElements("xpath=//i[@class='fa-angle-down h5 mb-0']");
		elementDown.get(3).click();
		Thread.sleep(2000);
		List<WebElement> elementEdit_More = webtest.findElements("xpath=//button[@class='btn btn-sm btn-default dropdown-toggle']");
		elementEdit_More.get(4).click();
		Thread.sleep(2000);
		List<WebElement> elementEdit_move = webtest.findElements("xpath=//a[@class='dropdown-item dropdown-toggle btn-move-column']");
		//System.out.println("�ƶ���ť����"+elementEdit_move.size());
		elementEdit_move.get(2).click();
		Thread.sleep(2000);
		List<WebElement> elementEdit_moveUp = webtest.findElements("xpath=//a[@class='dropdown-item px-3']");
		//System.out.println("��Ϊһ����Ŀ����"+elementEdit_moveUp.size()+"��");
		elementEdit_moveUp.get(9).click();
		Thread.sleep(2000);
		List<WebElement> elementEdit_addtext = webtest.findElements("xpath=//input[@class='form-control mt-2 mb-0']");
		webtest.typeAndClear(elementEdit_addtext.get(0), "add1");
		Thread.sleep(2000);
		List<WebElement> elementSave= webtest.findElements("xpath=//button[@class='ok btn btn-primary']");
		//System.out.println("ȷ����ťһ����"+elementSave.size()+"��");
		elementSave.get(0).click();
		System.out.println("��Ŀ����");
		Thread.sleep(2000);
		System.out.println("��������25");
		webtest.click("xpath=//button[text()='�ر�']");
	}
	
	//���Զ������б��ͬ������С��ƶ���������
	@Test(priority = 26)
	public void DropdownList_Move() throws InterruptedException {
		webtest.click("xpath=//a[text()='��Ŀ']");
		Thread.sleep(2000);
		//�ҵ������Ŷ�̬�������������б�
		List<WebElement> elementDown= webtest.findElements("xpath=//i[@class='fa-angle-down h5 mb-0']");
		elementDown.get(4).click();
		Thread.sleep(2000);
		//��������ࡱ��ť
		List<WebElement> elementEdit_More = webtest.findElements("xpath=//button[@class='btn btn-sm btn-default dropdown-toggle']");
		elementEdit_More.get(4).click();
		Thread.sleep(2000);
		//�ҵ����ƶ���
		List<WebElement> elementEdit_move = webtest.findElements("xpath=//a[@class='dropdown-item dropdown-toggle btn-move-column']");
		System.out.println("�ƶ���ť����"+elementEdit_move.size());
		elementEdit_move.get(3).click();
		Thread.sleep(2000);
		//�ҵ�����-��Ѷ2��
		List<WebElement> elementEdit_moveUp = webtest.findElements("xpath=//a[@class='dropdown-item px-3']");
		System.out.println("�ƶ���Ŀ����"+elementEdit_moveUp.size()+"��");
		elementEdit_moveUp.get(19).click();
		Thread.sleep(2000);
		System.out.println("��������26");
		webtest.click("xpath=//button[text()='�ر�']");
	}
	
	//27�����Զ������б����С�ɾ����������
	@Test(priority = 27)
	public void DropdownList_Delete() throws InterruptedException {
		webtest.click("xpath=//a[text()='��Ŀ']");
		Thread.sleep(2000);
		//�ҵ�����-���4�������������б�
		List<WebElement> elementDown= webtest.findElements("xpath=//i[@class='fa-angle-down h5 mb-0']");
		elementDown.get(1).click();
		Thread.sleep(2000);
		//��������ࡱ��ť
		List<WebElement> elementEdit_More = webtest.findElements("xpath=//button[@class='btn btn-sm btn-default dropdown-toggle']");
		elementEdit_More.get(1).click();
		Thread.sleep(2000);
		//�ҵ���ɾ����
		List<WebElement> elementEdit_move = webtest.findElements("xpath=//button[@class='dropdown-item btn-del-column']");
		System.out.println("ɾ����ť����"+elementEdit_move.size());
		elementEdit_move.get(1).click();
		Thread.sleep(2000);
		//�ҵ���ȷ����
		webtest.click("xpath=//button[@class='ok btn btn-primary']");
		Thread.sleep(2000);
		System.out.println("��������27");
		webtest.click("xpath=//button[text()='�ر�']");
	}
	
	//28�����Զ�����Ŀ���顰ȫ����ѡ����б༭
	@Test(priority = 28)
	public void DropdownList_EditAll() throws InterruptedException {
		//�ҵ������
		webtest.click("xpath=//button[text()='���']");
		Thread.sleep(2000);
		//�����������á�
		webtest.click("xpath=//a[text()='�������']");
		Thread.sleep(2000);
		//�ҵ�ҳ������
		List<WebElement> elementEdit_yes = webtest.findElements("xpath=//input[@class=' form-control']");
		System.out.println("�������"+elementEdit_yes.size());
		webtest.typeAndClear(elementEdit_yes.get(9), "��-ȫ��");
		Thread.sleep(2000);
		webtest.leaveFrame();
		//����
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//�����������·�
		js.executeScript("window.scroll(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		List<WebElement> elementEdit_Save = webtest.findElements("xpath=//button[@class='btn btn-primary']");
		System.out.println("���水ť����"+elementEdit_Save.size());
		elementEdit_Save.get(5).click();
		System.out.println("��������28");
		Thread.sleep(2000);
	}
	
	
	// ���Զ�����Ŀ���顰ý�屨����ѡ�����ֽ��б༭
	@Test(priority = 29)
	public void DropdownList_EditMedia() throws InterruptedException {
		// �ҵ�����-����1�������
		webtest.refresh();
		Thread.sleep(2000);
		webtest.enterFrame1("xpath=//iframe[@src='http://localhost:99/news/?pageset=1']");
		Thread.sleep(2000);
		webtest.mouseToElement("xpath=//ul[@class='clearfix met-column-nav-ul text-xs-center']/li[2]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//i[@class='icon wb-pencil']");
		Thread.sleep(2000);
		webtest.typeAndClear("xpath=//input[@class='form-control input-sm']", "��-ý�屨��");
		Thread.sleep(2000);
		webtest.click("xpath=//button[@class='btn btn-primary btn-xs editable-submit']");
		Thread.sleep(2000);
		System.out.println("��������29");
		Thread.sleep(2000);
	}

	// ���Զ�����Ŀ���顰��ҵ��Ѷ��ѡ�����ֽ��б༭
	@Test(priority = 30)
	public void DropdownList_EditIndustry() throws InterruptedException {
		// �ҵ�����-��Ѷ2�������
		webtest.refresh();
		Thread.sleep(2000);
		webtest.enterFrame1("xpath=//iframe[@src='http://localhost:99/news/?pageset=1']");
		Thread.sleep(2000);
		webtest.mouseToElement("xpath=//ul[@class='clearfix met-column-nav-ul text-xs-center']/li[3]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//i[@class='icon wb-pencil']");
		Thread.sleep(2000);
		webtest.typeAndClear("xpath=//input[@class='form-control input-sm']", "��-��ҵ��Ѷ");
		Thread.sleep(2000);
		webtest.click("xpath=//button[@class='btn btn-primary btn-xs editable-submit']");
		Thread.sleep(2000);
		System.out.println("��������30");
		Thread.sleep(2000);
	}

	// ���Զ�����Ŀ���顰��ҵ��Ѷ��ѡ�����ֽ��б༭
	@Test(priority = 31)
	public void DropdownList_EditCorporate() throws InterruptedException {
		// �ҵ�����-��ҵ3�������
		webtest.refresh();
		Thread.sleep(2000);
		webtest.enterFrame1("xpath=//iframe[@src='http://localhost:99/news/?pageset=1']");
		Thread.sleep(2000);
		webtest.mouseToElement("xpath=//ul[@class='clearfix met-column-nav-ul text-xs-center']/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//i[@class='icon wb-pencil']");
		Thread.sleep(2000);
		webtest.typeAndClear("xpath=//input[@class='form-control input-sm']", "��-��ҵ����");
		Thread.sleep(2000);
		webtest.click("xpath=//button[@class='btn btn-primary btn-xs editable-submit']");
		Thread.sleep(2000);
		System.out.println("��������31");
		webtest.leaveFrame();
		Thread.sleep(2000);
	}
		
	//���Զ�����Ŀ����ѡ�����ֽ��б༭��ͷ�����������������������������ʾ
	@Test(priority = 32)
	public void DropdownList_Show2() throws InterruptedException {
		//webtest.leaveFrame();
		//Thread.sleep(2000);
		webtest.enterFrame1("xpath=//iframe[@src='http://localhost:99/index.php?lang=cn&pageset=1']");
		webtest.refresh();
		webtest.click("xpath=//span[text()='���Ŷ�̬']");
		Thread.sleep(2000);
		System.out.println("��������32");
		webtest.leaveFrame();
	}

	//���Զ�����Ŀ�������������йؼ�������
	@Test(priority = 33)
	public void Search_Engines() throws InterruptedException {
		webtest.enterFrame1("xpath=//iframe[@src='http://localhost:99/news/?pageset=1']");
		//�ҵ�������
		webtest.typeAndClear("xpath=//input[@class='form-control input-lg']", "Parallels");
		Thread.sleep(2000);
		//�������
		webtest.click("xpath=//button[@class='input-search-btn']");
		Thread.sleep(2000);
		System.out.println("�ؼ�������");
		System.out.println("��������33"); 
		webtest.leaveFrame();
	}
	
	// ���Զ�����Ŀ��������������������ʽ����
	@Test(priority = 34)
	public void Search_EnginesSet() throws InterruptedException, IOException {
		webtest.enterFrame1("xpath=//iframe[@src='http://localhost:99/news/?pageset=1']");
		// �ҵ�����
		webtest.mouseToElement("xpath=//input[@class='form-control input-lg']");
		Thread.sleep(2000);
		webtest.click("xpath=//button[@data-index='5']");
		Thread.sleep(2000);
		// ���"����"
		webtest.leaveFrame();
		Thread.sleep(2000);
		webtest.click("xpath=//label[text()='����']");
		Thread.sleep(2000);
		List<WebElement> elementEdit_Save = webtest.findElements("xpath=//button[@class='btn btn-primary']");
		System.out.println("���水ť����" + elementEdit_Save.size());
		elementEdit_Save.get(0).click();
		System.out.println("�ؼ���������ʽ����");
		System.out.println("��������34");
	}

	// ���Զ����ݽ����Ƽ�
	@Test(priority = 35)
	public void Search_Recommend() throws InterruptedException {
		webtest.refresh();
		Thread.sleep(2000);
		webtest.enterFrame1("xpath=//iframe[@src='http://localhost:99/news/index.php?lang=cn&stype=1&search=search&class1=3&content=Parallels&pageset=1']");
		// �ҵ�����ģ��ġ����ݡ�
		webtest.mouseToElement("xpath=//div[@class='met-news-list set']");
		Thread.sleep(2000);
		webtest.click("xpath=//button[@class='btn btn-xs btn-warning pageset-content']");
		Thread.sleep(2000);
		webtest.leaveFrame();
		webtest.click("xpath=//input[@class='checkall-item custom-control-input']");
		Thread.sleep(2000);
		webtest.click("xpath=//button[@class='btn btn-default dropdown-toggle']");
		Thread.sleep(2000);
		//�Ƽ�
		webtest.click("xpath=//a[text()='�Ƽ�']");
		Thread.sleep(2000);
		System.out.println("�Ƽ�����");
		System.out.println("��������35");
	}
	
	//���Զ�����ȡ���Ƽ�
	@Test(priority = 36)
	public void Search_CancelRecommend() throws InterruptedException {
		webtest.click("xpath=//input[@class='checkall-item custom-control-input']");
		Thread.sleep(2000);
		webtest.click("xpath=//button[@class='btn btn-default dropdown-toggle']");
		Thread.sleep(2000);
		//ȡ���Ƽ�
		webtest.click("xpath=//a[text()='ȡ���Ƽ�']");
		Thread.sleep(2000);
		System.out.println("�Ƽ�����");
		System.out.println("��������36");
	}

	
	//���Զ������ö�
	@Test(priority = 37)
	public void Search_Topping() throws InterruptedException {
		/*
		 * webtest.refresh(); Thread.sleep(2000); webtest.enterFrame1(
		 * "xpath=//iframe[@src='http://localhost:99/news/index.php?lang=cn&stype=1&search=search&class1=3&content=Parallels&pageset=1']"
		 * ); // �ҵ�����ģ��ġ����ݡ�
		 * webtest.mouseToElement("xpath=//div[@class='met-news-list set']");
		 * Thread.sleep(2000); webtest.
		 * click("xpath=//button[@class='btn btn-xs btn-warning pageset-content']");
		 * Thread.sleep(2000); // ��ѡ�ڶ��� webtest.leaveFrame();
		 */
		List<WebElement> elementEdit_article = webtest.findElements("xpath=//input[@class='checkall-item custom-control-input']");
		System.out.println("��������" + elementEdit_article.size());
		elementEdit_article.get(1).click();
		Thread.sleep(2000);
		//���״̬�޸�
		webtest.click("xpath=//button[@class='btn btn-default dropdown-toggle']");
		Thread.sleep(2000);
		//�ö�
		webtest.click("xpath=//a[text()='�ö�']");
		Thread.sleep(2000);
		//Thread.sleep(2000);
		System.out.println("�ö�");
		System.out.println("��������37");
	}

	// ���Զ�����ȡ���ö�
	@Test(priority = 38)
	public void Search_CancelTopping() throws InterruptedException {
		webtest.click("xpath=//input[@class='checkall-item custom-control-input']");
		Thread.sleep(2000);
		// ���״̬�޸�
		webtest.click("xpath=//button[@class='btn btn-default dropdown-toggle']");
		Thread.sleep(2000);
		// �ö�
		webtest.click("xpath=//a[text()='ȡ���ö�']");
		Thread.sleep(2000);
		Thread.sleep(2000);
		System.out.println("�ö�");
		System.out.println("��������38");
	}

	
	//���Զ�����ǰ̨����
	@Test(priority = 39)
	public void Search_Hide() throws InterruptedException {
		
		webtest.click("xpath=//input[@class='checkall-all custom-control-input']");
		Thread.sleep(2000);
		// ���״̬�޸�
		webtest.click("xpath=//button[@class='btn btn-default dropdown-toggle']");
		Thread.sleep(2000);
		// ǰ̨����
		webtest.click("xpath=//a[text()='ǰ̨����']");
		Thread.sleep(2000);
//		webtest.click("xpath=//button[@class='btn btn-default mr-1']");
		Thread.sleep(2000);
		System.out.println("ǰ̨����");
		System.out.println("��������39");
	}

	// ���Զ�����ǰ̨��ʾ
	@Test(priority = 40)
	public void Search_CancelHide() throws InterruptedException {
		/*
		 * //webtest.enterFrame1(
		 * "xpath=//iframe[@src='http://localhost:99/news/index.php?lang=cn&stype=1&search=search&class1=3&content=Parallels&pageset=1']"
		 * ); // �ҵ�����ģ��ġ����ݡ�
		 * webtest.mouseToElement("xpath=//div[@class='met-news-list set']");
		 * Thread.sleep(2000); webtest.
		 * click("xpath=//button[@class='btn btn-xs btn-warning pageset-content']");
		 * Thread.sleep(2000); // ��ѡ���� webtest.leaveFrame();
		 */
		webtest.click("xpath=//input[@class='checkall-all custom-control-input']");
		Thread.sleep(2000);
		// ���״̬�޸�
		webtest.click("xpath=//button[@class='btn btn-default dropdown-toggle']");
		Thread.sleep(2000);
		// ǰ̨����
		webtest.click("xpath=//a[text()='ǰ̨��ʾ']");
		Thread.sleep(2000);
//		webtest.click("xpath=//button[@class='btn btn-default mr-1']");
		Thread.sleep(2000);
		System.out.println("ǰ̨��ʾ");
		System.out.println("��������40");
	}
	
	// ���Բ��Զ����ݽ��С��������ġ�����
	@Test(priority = 41)
	public void Search_Copy() throws InterruptedException {
		/*
		 * //webtest.enterFrame1(
		 * "xpath=//iframe[@src='http://localhost:99/news/index.php?lang=cn&stype=1&search=search&class1=3&content=Parallels&pageset=1']"
		 * ); // �ҵ�����ģ��ġ����ݡ�
		 * webtest.mouseToElement("xpath=//div[@class='met-news-list set']");
		 * Thread.sleep(2000); webtest.
		 * click("xpath=//button[@class='btn btn-xs btn-warning pageset-content']");
		 * Thread.sleep(2000); // ��ѡ��һ�� webtest.leaveFrame();
		 */
		webtest.click("xpath=//input[@class='checkall-item custom-control-input']");
		Thread.sleep(2000);
		// �������
		List<WebElement> elementEdit_Copy = webtest.findElements("xpath=//button[@class='btn btn-default dropdown-toggle']");
		elementEdit_Copy.get(2).click();
		Thread.sleep(2000);
		// �����������
		webtest.click("xpath=//a[text()='��������']");
		Thread.sleep(2000);
		//������Ŷ�̬
		webtest.doubleClick("xpath=//button[text()='���Ƶ�ָ����Ŀ']");
		Thread.sleep(1000);
		webtest.click("xpath=//*[@id=\"news-list\"]/tfoot/tr/th[2]/div[5]/div/div/a[text()='���Ŷ�̬']");
		Thread.sleep(2000);
		//�����-��Ѷ2
		webtest.mouseToElement("xpath=//div[@class='dropdown-menu show']");
		Thread.sleep(2000);
		List<WebElement> elementEdit_Choose = webtest.findElements("xpath=//div[@class='dropdown dropright dropdown-submenu']");
		System.out.println(elementEdit_Choose.size());
		elementEdit_Choose.get(2).click();
		Thread.sleep(2000);
		//�����-���5
		webtest.click("xpath=//*[@id=\"news-list\"]/tfoot/tr/th[2]/div[5]/div/div/div/div/div/a[text()='��-���5']");
		Thread.sleep(2000);
//		webtest.click("xpath=//button[@class='btn btn-default mr-1']");
		Thread.sleep(2000);
		System.out.println("���������ġ�����");
		System.out.println("��������41");
	}
	
	
	// ���Բ��Զ����ݽ��С�English������
	@Test(priority = 42)
	public void Search_CopyEnglish() throws InterruptedException {
		/*
		 * // �ҵ�����ģ��ġ����ݡ�
		 * webtest.mouseToElement("xpath=//div[@class='met-news-list set']");
		 * Thread.sleep(2000); webtest.
		 * click("xpath=//button[@class='btn btn-xs btn-warning pageset-content']");
		 * Thread.sleep(2000); // ��ѡ��һ�� webtest.leaveFrame();
		 */
		webtest.click("xpath=//input[@class='checkall-item custom-control-input']");
		Thread.sleep(2000);
		// �������
		List<WebElement> elementEdit_Copy = webtest
				.findElements("xpath=//button[@class='btn btn-default dropdown-toggle']");
		elementEdit_Copy.get(2).click();
		Thread.sleep(2000);
		// ���English
		webtest.click("xpath=//a[text()='English']");
		Thread.sleep(2000);
		// ���News
		List<WebElement> elementEdit_Choose = webtest
				.findElements("xpath=//div[@class='dropdown dropright dropdown-submenu']");
		elementEdit_Choose.get(1).click();
		Thread.sleep(2000);
		// �����-���5
		webtest.click("xpath=//a[text()='Industry information']");
		Thread.sleep(2000);
//		webtest.click("xpath=//button[@class='btn btn-default mr-1']");
		Thread.sleep(2000);
		System.out.println("��English������");
		System.out.println("��������42");
	}
	
	//���Զ����ݽ��С��������վ��ɾ��
	@Test(priority = 43)
	public void Search_RecycleBin() throws InterruptedException {
		/*
		 * // �ҵ�����ģ��ġ����ݡ�
		 * webtest.mouseToElement("xpath=//div[@class='met-news-list set']");
		 * Thread.sleep(2000); webtest.
		 * click("xpath=//button[@class='btn btn-xs btn-warning pageset-content']");
		 * Thread.sleep(2000); // ��ѡ��һ�� webtest.leaveFrame();
		 */
		webtest.click("xpath=//input[@class='checkall-item custom-control-input']");
		Thread.sleep(2000);
		// ���ɾ��
		List<WebElement> elementEdit_Delete = webtest.findElements("xpath=//button[@class='btn btn-sm btn-default']");
		System.out.println(elementEdit_Delete.size());
		elementEdit_Delete.get(0).click();
		Thread.sleep(2000);
		// ����������վ
		webtest.click("xpath=//button[text()='�������վ']");
		Thread.sleep(2000);
		System.out.println("���������վ��ɾ��");
		System.out.println("��������43");
	}

	// BUG ���Զ����ݽ��С��������վ����ԭ
	@Test(priority = 44)
	public void Search_RecycleBin_Reduction() throws InterruptedException {
		/*
		 * // �ҵ�����ģ��ġ����ݡ�
		 * webtest.mouseToElement("xpath=//div[@class='met-news-list set']");
		 * Thread.sleep(2000); webtest.
		 * click("xpath=//button[@class='btn btn-xs btn-warning pageset-content']");
		 * Thread.sleep(2000); // �������վ webtest.leaveFrame();
		 */
		webtest.mouseToElement("xpath=//div[@class='py-2 d-flex align-items-center justify-content-between']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[@class='btn-content-recycle text-content']");
		Thread.sleep(2000);
		// ���ȫ������
		List<WebElement> elementEdit_all = webtest
				.findElements("xpath=//input[@class='checkall-all custom-control-input']");
		System.out.println(elementEdit_all.size());
		elementEdit_all.get(2).click();
		Thread.sleep(2000);
		// �����ԭ
		webtest.click("xpath=//button[text()='��ԭ']");
		Thread.sleep(2000);
		webtest.click("xpath=//button[text()='�ر�']");
		System.out.println("���������վ��ɾ��");
		System.out.println("��������44");
	}
	
	//���Զ����ݽ��г���ɾ��
	@Test(priority = 45)
	public void Search_Delete_completely() throws InterruptedException {
		webtest.refresh(); 
		Thread.sleep(2000); 
		webtest.enterFrame1("xpath=//iframe[@src='http://localhost:99/news/index.php?lang=cn&stype=1&search=search&class1=3&content=Parallels&pageset=1']");
		Thread.sleep(2000);
		// �ҵ�����ģ��ġ����ݡ�
		webtest.mouseToElement("xpath=//div[@class='met-news-list set']");
		Thread.sleep(2000);
		webtest.click("xpath=//button[@class='btn btn-xs btn-warning pageset-content']");
		Thread.sleep(2000); // ��ѡ��һ�� 
		webtest.leaveFrame();
		webtest.click("xpath=//input[@class='checkall-item custom-control-input']");
		Thread.sleep(2000);
		// ���ɾ��
		List<WebElement> elementEdit_Delete = webtest.findElements("xpath=//button[@class='btn btn-sm btn-default']");
		System.out.println(elementEdit_Delete.size());
		elementEdit_Delete.get(0).click();
		Thread.sleep(2000);
		// ����������վ
		webtest.click("xpath=//button[text()='����ɾ��']");
		Thread.sleep(2000);
//		webtest.click("xpath=//button[text()='�ر�']");
		System.out.println("���������վ��ɾ��");
		System.out.println("��������45");
	}
	
	//���Զ����ݽ��д��������
	@Test(priority = 46)
	public void Search_AddWord() throws InterruptedException {
		/*
		 * // �ҵ�����ģ��ġ����ݡ�
		 * webtest.mouseToElement("xpath=//div[@class='met-news-list set']");
		 * Thread.sleep(2000); webtest.
		 * click("xpath=//button[@class='btn btn-xs btn-warning pageset-content']");
		 * Thread.sleep(2000); // ���������� webtest.leaveFrame();
		 */
		webtest.click("xpath=//button[text()='�������']");
		Thread.sleep(2000);
		// ѡ��������Ŀ
		webtest.click("xpath=//select[@class='form-control mr-1 w-a prov']");
		Thread.sleep(2000);
		webtest.click("xpath=//select[@class='form-control mr-1 w-a prov']/option[text()='��-���4']");
		Thread.sleep(2000);
		// �������±���
		List<WebElement> elementEdit_add = webtest.findElements("xpath=//input[@class='form-control']");
		System.out.println(elementEdit_add.size());
		webtest.typeAndClear(elementEdit_add.get(1), "����С����ӵĵ�һƪ����");
		Thread.sleep(2000);		
		// ������������
		webtest.enterFrame("ueditor_0");
		webtest.type("xpath=//body[@class='view']", "����С����ӵĵ�һƪ���£����ż�򵥵�������");
		Thread.sleep(2000);
		webtest.leaveFrame();
		Thread.sleep(2000);
		List<WebElement> elementEdit_Save = webtest.findElements("xpath=//button[@class='btn btn-primary']");
		System.out.println(elementEdit_Save.size());
		elementEdit_Save.get(1).click();
		Thread.sleep(2000);
//		webtest.click("xpath=//button[text()='�ر�']");
		System.out.println("�������������");
		System.out.println("��������46");
	}
	
	//���Զ����ݽ��к�����ͼƬ�����
	@Test(priority = 49)
	public void Search_AddPicture() throws InterruptedException {
		webtest.refresh();
		Thread.sleep(2000);
		// �ҵ�����ģ��ġ����ݡ�
		webtest.mouseToElement("xpath=//div[@class='met-news-list set']");
		Thread.sleep(2000); webtest.
		click("xpath=//button[@class='btn btn-xs btn-warning pageset-content']");
		Thread.sleep(2000); 
		// ���������� 
		
		webtest.click("xpath=//button[text()='�������']"); 
		Thread.sleep(2000);
		webtest.leaveFrame();
		// ѡ��������Ŀ
		webtest.click("xpath=//select[@class='form-control mr-1 w-a prov']");
		Thread.sleep(2000);
		webtest.click("xpath=//select[@class='form-control mr-1 w-a prov']/option[text()='��-���4']");
		Thread.sleep(2000);
		// �������±���
		List<WebElement> elementEdit_add = webtest.findElements("xpath=//input[@class='form-control']");
		System.out.println(elementEdit_add.size());
		webtest.typeAndClear(elementEdit_add.get(1), "����С����ӵĵ�һƪ��ͼƬ������");
		webtest.leaveFrame();
		Thread.sleep(2000);
		// ������������
		
		webtest.enterFrame("ueditor_0]");
		webtest.type("xpath=//body[@class='view']", "����С����ӵĵ�һƪ��ͼƬ�����£����ż�򵥵�������");
		Thread.sleep(2000);
		webtest.leaveFrame();
		Thread.sleep(2000);
		//������·���
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//�����������·�
		js.executeScript("window.scroll(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		//�����ͼƬ��ѡ��
		webtest.click("xpath=//button[text()='��ͼƬ��ѡ��']");
		Thread.sleep(2000);
		webtest.doubleClick("xpath=//a[@data-path='/upload/201801']");
		Thread.sleep(2000);
		webtest.click("xpath=//img[@class='vertical-align-middle img-fluid']");
		Thread.sleep(2000);
		List<WebElement> elementEdit_Save0 = webtest.findElements("xpath=//button[@class='btn btn-primary']");
		System.out.println(elementEdit_Save0.size());
		elementEdit_Save0.get(2).click();
		Thread.sleep(2000);
		List<WebElement> elementEdit_Save = webtest.findElements("xpath=//button[@class='btn btn-primary']");
		System.out.println(elementEdit_Save.size());
		elementEdit_Save.get(1).click();
		Thread.sleep(2000);
		webtest.click("xpath=//button[text()='�ر�']");
		System.out.println("������ͼƬ�������");
		System.out.println("��������49");
	}
	
	// ���Զ����ݽ��к�����ͼƬ���½��б༭
	@Test(priority = 47)
	public void Search_EditPicture() throws InterruptedException {
		/*
		 * // �ҵ�����ģ��ġ����ݡ�
		 * webtest.mouseToElement("xpath=//div[@class='met-news-list set']");
		 * Thread.sleep(2000); webtest.
		 * click("xpath=//button[@class='btn btn-xs btn-warning pageset-content']");
		 * Thread.sleep(2000); // ������Ŷ�̬ webtest.leaveFrame();
		 */
		webtest.click("xpath=//span[text()='���Ŷ�̬']");
		Thread.sleep(2000);
		// ��ѡ��һ��
		webtest.click("xpath=//input[@class='checkall-item custom-control-input']");
		Thread.sleep(2000);
		// ����༭
		List<WebElement> elementEdit_Delete = webtest.findElements("xpath=//button[@class='btn btn-sm btn-primary mr-1']");
		elementEdit_Delete.get(0).click();
		Thread.sleep(2000);
		// ������·���
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// �����������·�
		js.executeScript("window.scroll(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		// ����ļ��ϴ�
		webtest.type("xpath=//input[@data-plugin='fileinput']", "E:\\workspace\\img\\01.png");
		Thread.sleep(2000);
		//����
		List<WebElement> elementEdit_Save0 = webtest.findElements("xpath=//button[@class='btn btn-primary']");
		System.out.println("����"+elementEdit_Save0.size());
		elementEdit_Save0.get(2).click();
		Thread.sleep(2000);
//		webtest.click("xpath=//button[text()='�ر�']");
		System.out.println("������ͼƬ���½���ͼƬ�༭");
		System.out.println("��������47");
	}
	
	// ���ԶԺ�����ͼƬ�����ݽ��з����ɾ��
	@Test(priority = 48)
	public void Search_EditPicture_Delete() throws InterruptedException {
		/*
		 * // �ҵ�����ģ��ġ����ݡ�
		 * webtest.mouseToElement("xpath=//div[@class='met-news-list set']");
		 * Thread.sleep(2000); webtest.
		 * click("xpath=//button[@class='btn btn-xs btn-warning pageset-content']");
		 * Thread.sleep(2000); // ������Ŷ�̬ webtest.leaveFrame();
		 */
		// ��ѡ��һ��
		webtest.click("xpath=//input[@class='checkall-item custom-control-input']");
		Thread.sleep(2000);
		// ����༭
		List<WebElement> elementEdit_Delete = webtest
				.findElements("xpath=//button[@class='btn btn-sm btn-primary mr-1']");
		elementEdit_Delete.get(0).click();
		Thread.sleep(2000);
		// ������·���
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// �����������·�
		js.executeScript("window.scroll(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		// ����ļ��ϴ�
		webtest.click("xpath=//i[@class='glyphicon glyphicon-trash text-grey']");
		Thread.sleep(2000);
		// ����
		List<WebElement> elementEdit_Save0 = webtest.findElements("xpath=//button[@class='btn btn-primary']");
		System.out.println("����" + elementEdit_Save0.size());
		elementEdit_Save0.get(2).click();
		Thread.sleep(2000);
		//webtest.click("xpath=//button[text()='�ر�']");
		System.out.println("������ͼƬ���½���ͼƬ�༭");
		System.out.println("��������48");
	}

	//���Զ������б����С����Ӣ������Ŀ��������
	@Test(priority = 50)
	public void DropdownList_English() throws InterruptedException {
		webtest.refresh();
		Thread.sleep(2000);
		webtest.enterFrame1("xpath=//iframe[@src='http://localhost:99/news/index.php?lang=cn&stype=1&search=search&class1=3&content=Parallels&pageset=1']");
		webtest.click("xpath=//span[text()='English']");
		Thread.sleep(2000);
		webtest.leaveFrame();
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='��Ŀ']");
		Thread.sleep(2000);
		List<WebElement> elementEdit_More = webtest
				.findElements("xpath=//button[@class='btn btn-sm btn-default dropdown-toggle']");
		elementEdit_More.get(3).click();
		Thread.sleep(2000);
		List<WebElement> elementEdit_add = webtest.findElements("xpath=//a[@class='dropdown-item btn-add-subcolumn']");
		System.out.println(elementEdit_add.size());
		elementEdit_add.get(3).click();
		Thread.sleep(2000);
		List<WebElement> elementEdit_addtext = webtest.findElements("xpath=//input[@class=' form-control']");
		webtest.typeAndClear(elementEdit_addtext.get(7), "Xiong-Add7");
		Thread.sleep(2000);
		List<WebElement> elementSave = webtest.findElements("xpath=//button[@class='btn btn-primary']");
		elementSave.get(3).click();
		System.out.println("�������Ŀ");
		Thread.sleep(2000);
		System.out.println("��������50");
		webtest.click("xpath=//button[text()='�ر�']");
		Thread.sleep(2000);
	}
	

}
