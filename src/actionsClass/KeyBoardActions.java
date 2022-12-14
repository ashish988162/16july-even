package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MCM\\Downloads\\SOFTWARE TEATING APJ\\selenium chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement userName= driver.findElement(By.id("email"));
		//userName.sendKeys("hi good moring");
		Actions act=new Actions(driver);
		//act.moveToElement(userName).sendKeys("hello").build().perform();//use of mouse action----movetoelement
		act.sendKeys(userName,"ashish").perform();//use of keyboard action
		
		WebElement creatnewacc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		act.click(creatnewacc).perform();
		Thread.sleep(4000);
		WebElement day = driver.findElement(By.id("day"));
		act.click(day).perform();
		
		//how to handle drop down
		//act.sendKeys(Keys.ARROW_UP).perform();//use of keyboard action....keydown
		//Thread.sleep(1000);
		//act.sendKeys(Keys.ARROW_UP).perform();
		//Thread.sleep(1000);
		//act.sendKeys(Keys.ARROW_UP).perform();
		//Thread.sleep(1000);
		//act.sendKeys(Keys.ARROW_UP).perform();
		//Thread.sleep(1000);
		//act.sendKeys(Keys.ARROW_UP).perform();
		
		for(int i=1;i<=10;i++)
		{
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(1500);
		}
		act.sendKeys(Keys.ENTER).perform();
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		act.keyDown(firstname,Keys.SHIFT).sendKeys("velocity").build().perform();//write in upper case use shift
		
	}

}
