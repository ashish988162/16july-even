package webTable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEg1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MCM\\Downloads\\SOFTWARE TEATING APJ\\selenium chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//1.how many rows in table?
		List<WebElement> totalRows = driver.findElements(By.xpath("//table[@id='product']//tr"));//use of relative xpath
		System.out.println("Total number of rows "+totalRows.size());
		
		//2.how many columns are there in table?
		List<WebElement> totalCoulmns = driver.findElements(By.xpath("//table[@id='product']//th"));
		//or List<WebElement> totalCoulmns = driver.findElements(By.xpath("//table[@id='product']//tr[1]//th"));
		System.out.println("Total number of columns "+totalCoulmns.size());
		
		//3.how to read specific data
		
		String myData = driver.findElement(By.xpath("//table[@id='product']//tr[7]/td[2]")).getText();
		//String myData = driver.findElement(By.xpath("//table[@id='product']//tr[2]/td[2]")).getText();
		//String myData = driver.findElement(By.xpath("//table[@id='product']//tr[3]/td[3]")).getText();
		System.out.println("My data is "+myData);
		System.out.println("=====================================");
		
		//4.how to read whole row using findElements
		List<WebElement> row10 = driver.findElements(By.xpath("//table[@id='product']//tr[10]/td"));
		//we get list then use travsing use iterator
		Iterator<WebElement> it = row10.iterator();
		while(it.hasNext())
		{
		System.out.print(it.next().getText()+" ");//use print only single line & for space while printing give +""
		}
		System.out.println();
		System.out.println("=====================================");
		
		//5.how to read whole row using findElement
		//we get list then use travsing use for loop
		for(int i=1;i<=3;i++)
		{
		String text = driver.findElement(By.xpath("//table[@id='product']//tr[10]/td["+i+"]")).getText();//add variable in string using +i+
		System.out.print(text+" ");
		}
		
	}

}
