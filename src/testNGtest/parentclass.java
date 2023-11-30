package testNGtest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class parentclass {
	
	public void doThis()
	{
		System.out.println("I am here from parent class");
	}
	@BeforeMethod
		public void beforerun()
		{
			System.out.println("before executing testcase");
		}
	@AfterMethod
		public void afterrun()
		{
			System.out.println("after executing testcase");
		}
	

}
