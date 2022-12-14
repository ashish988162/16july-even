package popUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MCM\\Downloads\\SOFTWARE TEATING APJ\\selenium chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		//clicking on pop up button it will show alert popup
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(1000);
		//need to switch selenium focus from main page Alert popup
		
		Alert alt= driver.switchTo().alert();
		alt.accept();//clicking on ok button
		//alt.dismiss();
		//System.out.println(alt.getText());
		String myText = driver.findElement(By.xpath("//div[text()='Alerts']")).getText();
		System.out.println(myText);
	}

}
