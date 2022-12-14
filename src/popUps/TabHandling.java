package popUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MCM\\Downloads\\SOFTWARE TEATING APJ\\selenium chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		driver.findElement(By.linkText("Start Selenium Practice")).click();
		//to switch in tab  we need window ids
		//to get window ids--> use methods getWindowHandels();
		Set<String> tabs = driver.getWindowHandles();
		Iterator<String> it = tabs.iterator();
		String idOfMainPage = it.next();
		String idOfNewTab = it.next();
		//need to switch focus from main page to new tab
		driver.switchTo().window(idOfNewTab);
		String text = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText();
		System.out.println("New tab text is "+text);
		driver.close();// this will close only new tab/current window
		//need to switch focus from new tab to main page
		driver.switchTo().window(idOfMainPage);
		String textOfMainPage = driver.findElement(By.xpath("//h3[contains(text(),'For Velocity')]")).getText();
		System.out.println("Main page text is "+textOfMainPage);




	}

}
