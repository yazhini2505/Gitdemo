package testNGtest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class day1 {
	@BeforeMethod
	public void bfmethod()
	{
		System.out.println(" Before Method Execute once before method in day1 classr");
	}
	@AfterClass
	public void afclass()
	{
		System.out.println(" after class");
	}
	@AfterSuite
	public void afsuite()
	{
		System.out.println(" After Suite I am No1 from last");
	}
	@BeforeClass
	public void bfclass()
	{
		System.out.println(" BEfore class");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println(" After test final output");
	}
	@Test(groups= {"smoke"})
	public void demo()
	{
		System.out.println("hello");
	}
	@Test(groups= {"smoke"})
	public void demo2()
	{
		System.out.println("welcome");
	}
	@AfterMethod
	public void afmethod()
	{
		System.out.println("AfterMethod");
	}
	@BeforeSuite
	public void bfsuite()
	{
		System.out.println("Before suite I am Number 1");
	}
	@BeforeTest
	public void prereqesite()
	{
		System.out.println(" Before test I will execute first");
	}

}
