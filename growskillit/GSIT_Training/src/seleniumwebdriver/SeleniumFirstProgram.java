package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumFirstProgram {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/user/Desktop/jars/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("kpkalyanipamarthi371@gmail.com");

		driver.findElement(By.id("pass")).sendKeys("srinivasindira");

		driver.findElement(By.name("login")).click();

		driver.manage().window().maximize();

		Thread.sleep(1000);

		driver.close();

	}

}
