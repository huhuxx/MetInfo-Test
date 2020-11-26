package com.hxy.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Admin {
	@Test
	public void admin() throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		driver = new FirefoxDriver();
		driver.get("http://localhost:99/admin/index.php");
		Thread.sleep(1000);
		driver.findElement(By.name("login_name")).sendKeys("root");
		driver.findElement(By.name("login_pass")).sendKeys("root");
		driver.findElement(By.xpath("//button[@class='btn btn-primary px-4']")).click();	
		Thread.sleep(4000);
	}
}
