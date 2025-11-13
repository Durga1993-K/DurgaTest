package seleniumwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReusableMethods {

	WebDriver driver;

	public void launchApp(String Url) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/user/Desktop/jars/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get(Url);

		driver.manage().window().maximize();

		Thread.sleep(2000);

	}

	public void closeApp() {
		driver.close();
	}

	// Creating an element is available or not
	public void elementDisplayed(String loc, boolean check) {

		boolean eleDisp = driver.findElement(By.id(loc)).isDisplayed();

		if (eleDisp ==true ) {
			System.out.println("Pass");
		} else {
			System.out.println("fail");
		}
	}

	// Creating an element is Enabled or not
	public void elementEnabed(String loc) {

		boolean eleEnabled = driver.findElement(By.id("")).isEnabled();

		if (eleEnabled) {
			System.out.println("Pass");
		} else {
			System.out.println("fail");
		}
	}
	//No of links should be 20
	public void linksCount(String loc) {
		
		List<WebElement> lCount = driver.findElements(By.tagName(loc));
		
		System.out.println("LinkCount " + lCount.size());
		
	}
}
