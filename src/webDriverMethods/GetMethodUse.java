package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethodUse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MCM\\Downloads\\SOFTWARE TEATING APJ\\selenium chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//created object of chromeDriver
		//1. get- to enter url in browser or to open an application
		driver.get("https://paytm.com/");
		
		//2. close: to close the current tab of the browser opened by Selenium tool.
		//driver.close();
		//3.quit: to close the all the tabs present in browser opened by Selenium tool.
		//driver.quit();
		//4. maximize/minimize() - used to maximize/ minimize the browser
		//note: can't minimize the browser(we can change size & position of the browser).
		driver.manage().window().maximize();
		driver.manage().window().minimize();

		
		

	}

}
