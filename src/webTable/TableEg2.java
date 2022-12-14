package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEg2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MCM\\Downloads\\SOFTWARE TEATING APJ\\selenium chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//i need to pickup rows--->varying from -->2-11
		for(int i=2;i<=11;i++)//2
		{
		//now pick up columns from perticuler row--> varying from 1->3
		for(int j=1;j<=3;j++)//1
		{
		String text = driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]/td["+j+"]")).getText();
		System.out.print(text+" ");
		}
		System.out.println();
		}
	}

}
