package seleniumwebdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertProgram {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/user/Desktop/jars/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://letcode.in/alert/");
		// App title length should be greater than url length
		
		
		driver.findElement(By.xpath("//button[text()  = 'Simple Alert']")).click();
		Alert A = driver.switchTo().alert();
		A.dismiss();
		driver.findElement(By.xpath("//button[text()  = 'Confirm Alert']")).click();
		A.accept();
		driver.findElement(By.xpath("//button[text()  = 'Prompt Alert']")).click();
		A.sendKeys("okay");
	//	driver.findElement(By.xpath("//button[text()  = 'Sweet Alert']")).click();
		
	}
}
