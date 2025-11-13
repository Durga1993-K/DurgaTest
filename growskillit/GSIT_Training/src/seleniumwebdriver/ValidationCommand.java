package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationCommand {
	public static void main(String[] args ) {
	System.setProperty("webdriver.chrome.driver", "C:/Users/user/Desktop/jars/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	//App title length should be greater than url length
	String Title = driver.getTitle();
	
	String Url = driver.getCurrentUrl();
	
	if(Title.length()>Url.length())
		
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	//login button should be available and enabled
	
	boolean button = driver.findElement(By.name("login")).isDisplayed();
	System.out.println(button);
	
	boolean bEnabled = driver.findElement(By.name("login")).isEnabled();
	System.out.println(bEnabled);
    
	Dimension dim = driver.findElement(By.id("email")).getSize();
	
	System.out.println(dim);	
	
	//Forgot password link Title of the page should not contains "password1"
	
	driver.findElement(By.className("_6ltj")).click();

	String Title1 = driver.getTitle();
	if(Title1.contains("password1") == false)
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	//Search button should be available and enabled
	
	boolean SearchDisplayed = driver.findElement(By.name("did_submit")).isDisplayed();
	
	if(SearchDisplayed == true)
		
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	
boolean SearchEnabled = driver.findElement(By.name("did_submit")).isEnabled();
	
	if(SearchEnabled == true)
		
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}

	
	
	driver.close();
	}
}
