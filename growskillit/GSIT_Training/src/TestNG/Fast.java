package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Fast {
	WebDriver driver;

	@BeforeMethod
	public void launchApp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/user/Desktop/jars/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://fast.com/");

		driver.manage().window().maximize();
		
		Thread.sleep(10000);

	}

	@AfterMethod
	public void CloseApp() {
		driver.close();
	}
	
	@Test 
	public void Speed() {
	WebElement SpeedValue = driver.findElement(By.id("speed-value"));
	WebElement SpeedUnits = driver.findElement(By.id("speed-units"));
	
	System.out.println("The InternetSpeed is " + SpeedValue.getText() + SpeedUnits.getText());
	}
	
}
