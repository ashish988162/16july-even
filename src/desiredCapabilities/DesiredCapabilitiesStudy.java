package desiredCapabilities;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DesiredCapabilitiesStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MCM\\Downloads\\SOFTWARE TEATING APJ\\selenium chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//create object of chrome options
		ChromeOptions opt= new ChromeOptions();
		driver.manage().window().maximize();
		driver.get("https://www.justdial.com/");
		Thread.sleep(5000);
		String myText = driver.findElement(By.xpath("//span[text()='Popular Services ']")).getText();
		System.out.println("text is "+myText);

		



		

	}

}
