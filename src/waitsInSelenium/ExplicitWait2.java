package waitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MCM\\Downloads\\SOFTWARE TEATING APJ\\selenium chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.discoveryplus.in/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		
		//create object of WebDriverWait and pass parameter in it...1 object ...2 time
		WebDriverWait w= new WebDriverWait(driver, Duration.ofMillis(15000));
		w.until(ExpectedConditions.elementSelectionStateToBe(driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")),true));
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
	}

}
