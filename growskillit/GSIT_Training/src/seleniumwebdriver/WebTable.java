package seleniumwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/user/Desktop/jars/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://cosmocode.io/automation-practice-webtable//");

		driver.manage().window().maximize();

		Thread.sleep(1000);
		
		//print all countries name
//		WebElement table = driver.findElement(By.id("countries"));
//		
//		List<WebElement> cName = driver.findElements(By.xpath("//*[@id = 'countries']//td[2]"));
//		
//		System.out.println(cName.size());
//		
//		
//		for(WebElement ref : cName)
//			
//		{
//			String rowName=ref.getText();
//			
//			System.out.println(rowName);
//		}
			//count of column names
//		List<WebElement> column = table.findElements(By.tagName("th"));
//		
//		System.out.println(column.size());
		
		WebElement cName = driver.findElement(By.xpath("//*[@id = 'countries']//tr[2]//td[2]"));
		
		System.out.println(cName.getText());
		
		driver.close();
		
		
	}

}
