package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKyesUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MCM\\Downloads\\SOFTWARE TEATING APJ\\selenium chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		//driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("hi good morning");
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Velocity");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@name='email']")).clear();//clear the sendkey write word
	    WebElement emailIdFiled = driver.findElement(By.xpath("//input[@name='email']"));
	    emailIdFiled.sendKeys("abcdedf");
	    Thread.sleep(100);
	    //use of clear method
	    emailIdFiled.clear();
	    Thread.sleep(100);
	    emailIdFiled.sendKeys("xyafetebh");
	}

}
