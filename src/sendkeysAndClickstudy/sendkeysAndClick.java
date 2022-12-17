package sendkeysAndClickstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import commonMethods.CommonlyUsedMethods;

public class sendkeysAndClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MCM\\Downloads\\SOFTWARE TEATING APJ\\selenium chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		//Thread.sleep(3000);
		CommonlyUsedMethods.implicitwait(driver, 3000);//use of implicitwait...commlyusedmethod
		
		
		
		
		
		//sendkeys using javascript
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement entername = driver.findElement(By.id("autocomplete"));
		CommonlyUsedMethods.scrollIntoView(driver, entername);
		js.executeScript("arguments[0].value ='ashishjadhao'", entername);
		//Thread.sleep(3000);
		CommonlyUsedMethods.implicitwait(driver, 3000);//use of implicitwait...commlyusedmethod
		//click using javascript
		WebElement clickonchechbox = driver.findElement(By.id("checkBoxOption1"));
		js.executeScript("arguments[0].click();",clickonchechbox);
		js.executeScript("arguments[0].click();",clickonchechbox);
	}

}
