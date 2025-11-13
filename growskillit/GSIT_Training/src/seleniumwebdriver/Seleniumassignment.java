package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumassignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/user/Desktop/jars/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

//		driver.get("https://www.naukri.com/");
//
//		driver.manage().window().maximize();
//
//		Thread.sleep(1000);
//		
//		WebElement Login = driver.findElement(By.xpath("//*[text() = 'Login']"));
//		
//		Thread.sleep(2000);
//		
//		System.out.print(Login.getText());
//		
//		Login.click();
//		driver.close();
//		Thread.sleep(1000);
//		//Button exercise
//		
//		driver = new ChromeDriver();

////
//
//		driver.get("https://web-locators-static-site-qa.vercel.app/Button");
//		Thread.sleep(1000);
//
//		driver.manage().window().maximize();
//		WebElement Button = driver.findElement(By.xpath("//*[text() = 'Click this button']"));
//		boolean ButtonDisp = Button.isDisplayed();
//		if (ButtonDisp == true)
//
//		{
//			System.out.println("pass");
//		} else {
//			System.out.println("fail");
//		}
//		boolean ButtonEnab = Button.isEnabled();
//		if (ButtonEnab == true)
//
//		{
//			System.out.println("pass");
//		} else {
//			System.out.println("fail");
//		}
//		Button.click();

		// Image Exercise

//		driver.get("https://web-locators-static-site-qa.vercel.app/Image");
//
//		WebElement img = driver.findElement(By.xpath("//*[@alt = 'image_screen']"));
//
//		String src = img.getAttribute("src");
//		System.out.println(src);
//		String Alt = img.getAttribute("Alt");
//		System.out.println(Alt);

		// Checkbox Excercise
		driver.get("https://web-locators-static-site-qa.vercel.app/Checkbox");

		WebElement checkBox = driver.findElement(By.xpath("//*[text() = 'QA']"));
		Thread.sleep(2000);
		boolean checkSelect = checkBox.isSelected();
		// String Checked = checkBox.getText();
		if (checkSelect)

		{
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
		WebElement dsaCheckbox = driver.findElement(By.xpath("//p[text()='To which course are you enrolled into?']/following-sibling::div//label[normalize-space()='DSA']/preceding-sibling::input"));

	if (!dsaCheckbox.isSelected()) {
	    dsaCheckbox.click();
	    System.out.println("DSA checkbox selected.");
	} else {
	    System.out.println("DSA checkbox was already selected.");
	}
		
//		WebElement dsaCheckbox1 = driver.findElement(By.xpath("//p[text()='To which course are you enrolled into?']/following :: div//p[text() ='DSA']"));
//		boolean DSASelect = dsaCheckbox1.isSelected();
//
//		if (DSASelect)
//
//		{
//			System.out.println("pass");
//		} else {
//			System.out.println("fail");
//		}
//		

		driver.close();
	}

}
