package dropDown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsUse{//multiple element find karte

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MCM\\Downloads\\SOFTWARE TEATING APJ\\selenium chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		// how many links are there in webpage
		List<WebElement> links = driver.findElements(By.tagName("a"));//storing in reference element
		System.out.println(links.size());//hiden links are not show
		//what are these links?
		Iterator<WebElement> it = links.iterator();//use of iterator method
		while(it.hasNext())
		{System.out.println(it.next().getText());}//to print method use .gettextmethod
		
	}

}
