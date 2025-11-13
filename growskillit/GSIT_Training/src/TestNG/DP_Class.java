package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP_Class {
	WebDriver driver;

	@BeforeMethod
	public void launchApp() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/user/Desktop/jars/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
	}


	// DataProvider method
	@DataProvider(name = "loginData")
	public Object[][] getData() {
//		return new Object[][] { { "user1@gmail.com", "pass1" }, { "user2@gmail.com", "pass2" },
//				{ "user3@gmail.com", "pass3" } };
		Object[][] obj = new Object[3][2];
		obj[0][0] = "user1@gmail.com" ; obj [0][1] ="pass1";
		obj[1][0] = "user2@gmail.com" ; obj [1][1] ="pass2";
		obj[2][0] = "user3@gmail.com" ; obj [2][1] ="pass3";
		return obj;
	}
	
	@AfterMethod()
	public void CloseApp()
	{
		driver.close();
	}
	
	@Test (dataProvider = "loginData")
	public void m1(String uid, String pwd) throws InterruptedException
	{

		driver.findElement(By.id("email")).sendKeys(uid);
		
		driver.findElement(By.id("pass")).sendKeys(pwd);
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(2000);
	}
}
