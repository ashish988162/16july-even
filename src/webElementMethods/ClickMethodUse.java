package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethodUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MCM\\Downloads\\SOFTWARE TEATING APJ\\selenium chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//created object of chrome
		//1. get- to enter url in browser or to open an application.
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
	}

}
