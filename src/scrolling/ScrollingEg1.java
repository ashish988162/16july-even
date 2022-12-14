package scrolling;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingEg1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MCM\\Downloads\\SOFTWARE TEATING APJ\\selenium chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		
		//call javascriptexecutor interface.....cast driver into it....create js object for it
		JavascriptExecutor js = (JavascriptExecutor)driver;//cast driver into javascriptexecutor
		// +ve x value--> right hand side, Y value +ve --> down 
		// +ve x value--> right hand side, Y value -ve --> up 
		// -ve x value--> left hand side, Y value +ve --> down 
		// -ve x value--> left hand side, Y value -ve --> up 

		js.executeScript("window.scrollBy(0,900)");//no autosuggetion in that....give x,y coordanate
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-700)");//give x,y coordanate
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(100,-700)");//give x,y coordanate
	}

}
