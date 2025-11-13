package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FB_LoginPage2 {

	WebDriver driver;

	@BeforeMethod
	public void launchApp() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/user/Desktop/jars/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

	}

	@AfterMethod
	public void closeApp() {
		driver.close();
	}
	
	@Test
	public void ts1()
	{
		boolean EmailDisp = driver.findElement(By.id("email")).isDisplayed();
		if (EmailDisp == true)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("True");
		}
	}
		//Apply Hard Assertion

		@Test
		public void ts2()
		{
			boolean PassDisp = driver.findElement(By.id("pass")).isDisplayed();
			Assert.assertEquals(PassDisp, true);
	}
		
		@Test
		public void ts3()
		{
			boolean EmailEnab = driver.findElement(By.id("email")).isEnabled();
			SoftAssert obj = new SoftAssert();
			obj.assertEquals(EmailEnab, true);
			obj.assertAll();
		}
}
