package TestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {



	@BeforeMethod
	
	public void check1()
	{
		System.out.println("This is Before Method");
	}
	
	@Test
	public void check2()
	{
		System.out.println("This is Test Scenario1");
	}
	
	@Test
	public void check3()
	{
		System.out.println("This is Test Scenario2");
	}
	
	@Test
	public void check4()
	{
		System.out.println("This is Test Scenario3");
	}

	@BeforeClass
	
	public void check5()
	{
		System.out.println("This is Before Class");
	}
	
	@AfterMethod
	public void check6()
	{
		System.out.println("This is After method");
	}
	
	@AfterClass 
	public void check7()
	{
		System.out.println("This is After Class");
	}
	
	@BeforeTest
	public void check8()
	{
		System.out.println("This is Before Test");
	}
	
	@AfterTest
	public void check9()
	{
		System.out.println("This is After Test");
	}
	
	@BeforeSuite
	public void check10()
	{
		System.out.println("This is Before Suite");
	}
	
	@AfterSuite
	public void check11()
	{
		System.out.println("This is After Suite");
	}
	
	
}
