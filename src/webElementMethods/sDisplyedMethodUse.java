package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sDisplyedMethodUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MCM\\Downloads\\SOFTWARE TEATING APJ\\selenium chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		Thread.sleep(2000);
		WebElement textBox = driver.findElement(By.id("displayed-text")); 
		Thread.sleep(2000);
		textBox.sendKeys("Good Evening");
		WebElement hideButton = driver.findElement(By.id("hide-textbox"));
		hideButton.click();
		if(textBox.isDisplayed())
		{
		textBox.sendKeys("Good Night");
		}
		else
		{
		System.out.println("text box is not displyed, plz check");
		}

	}

}
