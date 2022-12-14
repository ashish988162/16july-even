package scrolling;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MCM\\Downloads\\SOFTWARE TEATING APJ\\selenium chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		WebElement hideButton = driver.findElement(By.xpath("//legend[text()='Element Displayed Example']"));
		
		//scrolling into view....in specific place directly
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView(true);", referenceElement);
		js.executeScript("arguments[0].scrollIntoView(true)", hideButton);//"arguments[0].scrollIntoView(true)"is syntex no autosuggetion.....hidebutton is refrrance element
		System.out.println(hideButton.getText());
		
	}

}
