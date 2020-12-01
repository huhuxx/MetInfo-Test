package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utils.ReadProperties;

public class Test {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver;
		String firefox_driver = ReadProperties.getPropertyValue("gecko_driver");
		String firefox_path = ReadProperties.getPropertyValue("firefox_path");
		System.setProperty("webdriver.gecko.driver", firefox_driver);
		System.setProperty("webdriver.firefox.bin", firefox_path);
		driver = new FirefoxDriver();
		driver.get("http://localhost:8090/admin/index.php");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='login_name']")).sendKeys("username");
		driver.findElement(By.xpath("//input[@name='login_pass']")).sendKeys("password");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[4]/div/button")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@title='关于我们']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section[1]/div/div/ul/li[2]/a")).click();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/div[2]/div/button[2]")).click();
		Thread.sleep(10000);
	}
}
