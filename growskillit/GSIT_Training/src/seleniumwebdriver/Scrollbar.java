package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollbar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/user/Desktop/jars/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//scrollto down
//
//		driver.get("https://www.olacabs.com/");
//
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,9000)");
//		Thread.sleep(3000);
//		driver.close();
		
		//point the location
		
		driver.get("https://www.facebook.com");
		
		Point p =driver.findElement(By.xpath("//*[text()='Meta Pay']")).getLocation();
		
		Thread.sleep(3000);
		
		System.out.println(p);
	}

}
