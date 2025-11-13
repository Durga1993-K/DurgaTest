package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverExplicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver", "C:/Users/user/Desktop/jars/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
		
			driver.get("https://www.facebook.com/");
			//App title length should be greater than url length
			
			WebDriverWait w =new WebDriverWait(driver , 5);
			
			w.until(ExpectedConditions.numberOfElementsToBe(By.tagName("a"), 43));
			
			driver.close();
			
	}

}
