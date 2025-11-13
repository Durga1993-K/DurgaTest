package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssigmentSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/user/Desktop/jars/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://web-locators-static-site-qa.vercel.app/Dropdown");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement SelectCountry = driver.findElement(By.className("dropdown"));
		
		Select S = new Select(SelectCountry);
		
		S.selectByVisibleText("Australia");
		
		boolean mul = S.isMultiple();
		
		System.out.println(mul);
		
	//	driver.close();
		
		WebElement multipleselection =  driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div/div/div/div/button[2]"));
		
		multipleselection.click();
		
		WebElement multi = driver.findElement(By.className("multi"));
		
		Select M = new Select(multi);
		
		boolean mul2 = M.isMultiple();
		
		
	}

}
