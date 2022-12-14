package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndGetCurrentUrl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MCM\\Downloads\\SOFTWARE TEATING APJ\\selenium chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		String myTitle = driver.getTitle();
		System.out.println("Title of webPage is "+myTitle);
		System.out.println(driver.getCurrentUrl());
		String myUrl = driver.getCurrentUrl();
		System.out.println("My current url is "+myUrl);
	}

}
