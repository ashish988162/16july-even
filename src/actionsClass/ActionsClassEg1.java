package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionsClassEg1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MCM\\Downloads\\SOFTWARE TEATING APJ\\selenium chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		//Mouse action--> move to Element
		//1.Create object of Actions class and pass driver object as an argument
		Actions act=new Actions(driver);
		//2.By using one of the actions class methods perform required actions
		Thread.sleep(3000);
		WebElement refElement= driver.findElement(By.linkText("SALES"));
		act.moveToElement(refElement).perform();//perform method dene jeve actions class asel
		Thread.sleep(4000);
		//Mouse action--> click
		WebElement clickMe = driver.findElement(By.xpath("(//a[contains(text(),'Selenium')])[2]"));
		act.moveToElement(clickMe).perform();
		//Thread.sleep(3000);
		act.click().perform();
		//Mouse action--> Drag and Drop
		WebElement source = driver.findElement(By.xpath("//a[text()=' 5000']"));
		//WebElement target = driver.findElement(By.id("amt8"));
		//act.moveToElement(source).clickAndHold().release(target).build().perform();//multiple action taken with help of build method 
		//act.dragAndDrop(source, target).perform();
		
		//WebElement source = driver.findElement(By.xpath("//a[text()='-5000']"));
		WebElement target = driver.findElement(By.id("amt7"));
		act.dragAndDrop(source, target).perform();
	}

}
