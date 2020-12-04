package test;

import org.testng.annotations.Test;

import dataprovide.NSDataProvider;

public class TestDemo {
	@Test(dataProvider = "excel",dataProviderClass = NSDataProvider.class)
	public void test1(String text,String text1) throws InterruptedException {
		System.out.println(text);
		System.out.println(text1);
	}
	
}
