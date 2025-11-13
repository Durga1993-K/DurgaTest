package seleniumwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/user/Desktop/jars/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://web-locators-static-site-qa.vercel.app/Web%20Table");

		driver.manage().window().maximize();

		Thread.sleep(1000);
	 //WebElement table = driver.findElement(By.className("MuiTable-rootcss-1owb465"));
		List<WebElement> column = driver.findElements(By.tagName("th"));

		System.out.println(column.size());
		// select static
		driver.findElement(By.xpath(
				"//*[@class = 'MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary css-1q2h7u5']"))
				.click();
		Thread.sleep(2000);

		// print all names of header columns

		List<WebElement> header = driver.findElements(By.tagName("thead"));

		for (WebElement ref : header)

		{
			System.out.println(ref.getText());
		}
		
		List<WebElement> ColName = driver.findElements(By.xpath("//*[@class = 'MuiTable-root css-1owb465']//td[2]"));
		for (WebElement ref1 : ColName)

		{
			System.out.println(ref1.getText());
		}
		
		driver.close();
	}

}
