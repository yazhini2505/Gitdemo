package testNGtest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class day2 {
	@Test(groups= {"smoke"})
	public void print()
	{
		System.out.println("class 2");
		Assert.assertTrue(false); //to make test case fail
	}

}
