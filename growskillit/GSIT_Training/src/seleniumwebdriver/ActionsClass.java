package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/user/Desktop/jars/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.naukri.com/");

		driver.manage().window().maximize();

		Thread.sleep(1000);

		Actions a = new Actions(driver);

		WebElement jobMenu = driver.findElement(By.xpath("//*[text()='Jobs']"));

		a.moveToElement(jobMenu).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[text()='IT jobs']")).click();
		Thread.sleep(2500);

		// Sending Keys from Keyboard
		a.sendKeys(Keys.CONTROL + "n").perform();
		Thread.sleep(2000);
		
		driver.close();
	}

}
