package popUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MCM\\Downloads\\SOFTWARE TEATING APJ\\selenium chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		String mainPageID = driver.getWindowHandle();//to get main page id
		System.out.println(mainPageID);
		// clicking on new window button--> will open new child browser
		driver.findElement(By.name("NewWindow")).click();
		//to get main page as well as
		Set<String> allPageIds = driver.getWindowHandles();
		System.out.println(allPageIds);
		Iterator<String> it = allPageIds.iterator();//travcing using iterator
		//getting IDs of all pages
		String idOfMainPage = it.next();// zero to 1st position i.e.id of main page
		String idOfChildPage = it.next();//  1st position to 2nd position i.e.id of child page
		//we need to switch to child page
		driver.switchTo().window(idOfChildPage);//my focus changed from Main page to child page
		driver.manage().window().maximize();
		//driver.close();
		//driver.quit();
		
		//current focus is on child page---> actions will be done on child page now
		driver.findElement(By.id("the7-search")).sendKeys("Good evening");
		Thread.sleep(5000);
		// if we want to do actions again on page then we have to switch focus form child to main page
		driver.switchTo().window(idOfMainPage);
		String myText = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']")).getText();
		System.out.println("Main page text is "+myText);

	}

}
