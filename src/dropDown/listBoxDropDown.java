package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listBoxDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MCM\\Downloads\\SOFTWARE TEATING APJ\\selenium chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		//1.Identify list box to be handled and store it in reference variable
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		
		//2.Create an object of Select class which will accept WebElement as argument
		Select s=new Select(dropdown);//where webelement dropdown as argument 
		
		//3.By using one of the select class methods we can select values form list box like 
//		1. selectByVisibleText: selectByVisibleText(String arg0) 
//		2. selectByIndex: selectByIndex(int arg0) 
//		3. selectByValue: selectByValue(String arg0)
		s.selectByVisibleText("Option2");//visible text ghetle
		Thread.sleep(1000);
		s.selectByIndex(3);//index 0-3 paryant madhla ghetla
		Thread.sleep(500);
		s.selectByValue("option1");//value chi value ghetli


	}

}
