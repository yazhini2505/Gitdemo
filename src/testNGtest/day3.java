package testNGtest;

import org.testng.annotations.Test;

public class day3 {
	@Test(enabled=false)
	public void webloginHome()
	{
		System.out.println("First");
	}
	@Test(groups= {"smoke"})
	public void MobileloginHome()
	{
		System.out.println("sweet");
	}
	@Test(dependsOnMethods= {"MobileloginHome"})
	public void APIhome()
	{
		System.out.println("home");
	}

}
