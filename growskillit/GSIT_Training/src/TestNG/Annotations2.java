package TestNG;
import org.testng.annotations.Test;

public class Annotations2 {

	@Test(priority=2)
	public void ts1()

	{
		System.out.println("Test scensario 1");
	}

	@Test (priority=1)
	public void ts2()

	{
		System.out.println("Test scensario 2");
	}

	@Test (invocationCount = 3)
	public void ts3() {
		System.out.println("Test scensario 3");
	}
	
	@Test (description = "Verify the login Page functionality")
	public void ts0()
	{
		System.out.println("Check login page");
		}
}
