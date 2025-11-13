package seleniumwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/user/Desktop/jars/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
//		WebElement f1 =driver.findElement(By.name("packageListFrame"));
		
//		driver.switchTo().frame(f1).findElement(By.xpath("//a[@href = 'java/applet/package-frame.html']")).click();
//		Thread.sleep(3000);
		
//		List<WebElement> linkcount = driver.switchTo().frame(f1).findElements(By.tagName("a"));
//		System.out.println(linkcount.size());
//		
//		
//		
//		for(WebElement ref : linkcount)
//		{
//			//System.out.println(ref.getText());
//			
//			String linkName =ref.getText();
//			
//			if(linkName.startsWith("org"))
//			{
//				System.out.println(linkName);	
//			}
//		}
		
		//total No of links in Frame 2
		
		WebElement f2 =driver.findElement(By.name("packageFrame"));
		
		List<WebElement> linkcount2 = driver.switchTo().frame(f2).findElements(By.tagName("a"));
		System.out.println(linkcount2.size());
			
		int i;
		for(i=0;i<=linkcount2.size();i++)
		{
			String linkName = linkcount2.get(i).getText(); 	

			if(linkName.startsWith("Abstract"))
			{
				System.out.println(linkName);
			}
		}
		
		driver.close();

	}

}
