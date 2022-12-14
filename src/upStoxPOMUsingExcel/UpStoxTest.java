package upStoxPOMUsingExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpStoxTest {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MCM\\Downloads\\SOFTWARE TEATING APJ\\selenium chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/");
		Thread.sleep(2000);
		
		//read data from excel
		File myFile= new File("C:\\Users\\MCM\\Downloads\\SOFTWARE TEATING APJ\\selenium chrome\\16JulAEVEN.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet3");
		String userid = mySheet.getRow(0).getCell(0).getStringCellValue();
		
		
		//create an object of upStoxLoginPage
		UpstoxLoginPage login=new UpstoxLoginPage(driver); login.enterUserName(userid);
		login.enterPassword(mySheet.getRow(0).getCell(1).getStringCellValue());
		login.clickOnSignInButton();
		//create an object of upStoxPasscodePage
		Thread.sleep(1000);
		UpstoxPasscodePage passcode= new UpstoxPasscodePage(driver);
		passcode.sendPasscode(mySheet.getRow(0).getCell(2).getStringCellValue());
		//create an object of upStoxWelcomePage
		Thread.sleep(4000);
		UpStoxWelcomePage welcome= new UpStoxWelcomePage(driver);
		welcome.clickOnNoIamGoodButton();
		//create an object of upStoxHomePage
		Thread.sleep(1000);
		UpstoxHomePage home= new UpstoxHomePage(driver);
		home.validateUserID(mySheet.getRow(0).getCell(3).getStringCellValue());
		home.clickOnFundsButton();
		//create an object of upStoxFundsPage
		Thread.sleep(1000);
		UpStoxFundsPage fund= new UpStoxFundsPage(driver);
		fund.getMyFunds();
		Thread.sleep(1000);
		home.logout();
		driver.close();
		
		
		
	}

}
