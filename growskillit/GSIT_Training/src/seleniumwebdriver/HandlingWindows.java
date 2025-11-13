package seleniumwebdriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/user/Desktop/jars/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		String w1 = driver.getWindowHandle();

		// System.out.println(w1);

		driver.findElement(By.xpath("//a[text() = 'Meta Pay']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[text() = 'Meta Store']")).click();
		Thread.sleep(3000);

		Set<String> wc = driver.getWindowHandles();
		System.out.println(wc.size());
		List <String> windowlist = new ArrayList<>(wc);
		
		driver.switchTo().window(windowlist.get(1));
	
		
		
		
		driver.findElement(By.xpath("//*[@aria-label = 'Empty bag']")).click();

//		for (String ref : wc) {
//			driver.switchTo().window(ref);
//			Thread.sleep(3000);
//			System.out.println(driver.getTitle());
//
//		}
		driver.quit();

	}
}
