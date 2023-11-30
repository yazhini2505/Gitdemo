package testNGtest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	@Test(groups= {"smoke"})
	public void weblogincar()
	{
		System.out.println("car");
	}
	@Test(dataProvider="getdata")
	public void weblogincar1(String username, String password)
	{
		System.out.println("carrr");
		System.out.println(username);
		System.out.println(password);
	}
	@Test(timeOut=4000) //wait 40 s3cc before you throw error
	public void Mobilelogincar() //exclude this one
	{
		System.out.println("sweet");
	}
	@Parameters({"URL","APIkey/username"})  //applicable to this test case alone
	@Test
	public void Mobilelogincar1(String urlname, String value) //exclude this one
	{
		System.out.println("sweetssssss");
		System.out.println(urlname);
		System.out.println(value);
	}
	@Test
	public void APIcar()
	{
		System.out.println("car");
	}
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data=new Object[3][2]; //3 indicate how many times the test should run
		//one input = username,password, ->valid credentials
		//2nd i/p = username,password->no valid credentials
		//3rd i/p = username,password->fault credit history
		data[0][0]="firstusername";
		data[0][1]="firstpassword";
		data[1][0]="secondusername";
		data[1][1]="second password";
		data[2][0]="Thirdusername";
		data[2][1]="thirdpassword";
		return data;
	}

}
