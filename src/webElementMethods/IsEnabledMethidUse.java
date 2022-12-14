package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethidUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MCM\\Downloads\\SOFTWARE TEATING APJ\\selenium chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.discoveryplus.in/");
		Thread.sleep(15000);//increase sleep value if error
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(5000);
		WebElement getOTPButton= driver.findElement(By.xpath("//button[text()='Get OTP']"));//store the value for reuse
		System.out.println(getOTPButton.isEnabled());//not enabled then false 
		getOTPButton.click();
		driver.findElement(By.id("mobileNumber")).sendKeys("9999999999");
		System.out.println(getOTPButton.isEnabled());
		getOTPButton.click();
			}

}
