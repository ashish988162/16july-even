package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MCM\\Downloads\\SOFTWARE TEATING APJ\\selenium chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dvet.gov.in/mr/");
		Thread.sleep(1000);
		String expectedTitle="Dvet Maharashtra";
		String actualTitle = driver.getTitle();
		if(expectedTitle.equals(actualTitle))
		{
		System.out.println("Title is matching TC is passed");
		}
		else
		{
		System.out.println("Title is not matching TC is failed");
		}
		driver.close();
	}

}
