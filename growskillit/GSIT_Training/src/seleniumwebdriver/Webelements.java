package seleniumwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver", "C:/Users/user/Desktop/jars/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.bankofamerica.com/");
			
			List<WebElement> linkcount = driver.findElements(By.tagName("a"));
			
			System.out.println("LinkCount " + linkcount.size());
			
			for(WebElement ref : linkcount)
			{
				String linkName = ref.getText();
				if(linkName.startsWith("M"))
				{
				System.out.println(linkName);
				}
			}
			
			List<WebElement> Imgcount = driver.findElements(By.tagName("img"));
			
			System.out.println("LinkCount " + Imgcount.size());
			
			Thread.sleep(1000);
			
			driver.close();
			

	}

}
