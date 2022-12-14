package waitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MCM\\Downloads\\SOFTWARE TEATING APJ\\selenium chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		//Thread.sleep(10000);
		
		//using dynamic wait-->implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
	}

}
