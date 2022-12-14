package commonMethods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class CommonlyUsedMethods {
	
	
	//screenshot method
	public static  void takeScreenShot(WebDriver driver,String name) throws IOException//parameter pass in method
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//cast driver into takescreenshot interface
		File dest= new File("D:\\software testing\\software testing apj\\screenshot\\"+name+".png");//pass parameter string name in main method
	//File dest= new File("D:\\Velocity\\Java Class\\16th July Even\\Selenium\\screenshot\\"+name+".png");
		FileHandler.copy(src, dest);
		
	}
	//scorllinto view
	public static void scrollIntoView(WebDriver driver,WebElement element )
	{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	//implicit wait
	public static void implicitwait(WebDriver driver,Integer numric)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(numric));
	}
	
	}
