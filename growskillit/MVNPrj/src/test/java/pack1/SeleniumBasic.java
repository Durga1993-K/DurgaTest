package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumBasic {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		Thread.sleep(1500);

		driver.findElement(By.id("email")).sendKeys("kpkalyanipamarthi371@gmail.com");

		driver.findElement(By.id("pass")).sendKeys("srinivasindira");

		driver.findElement(By.name("login")).click();
		
		driver.close();
	}


}
