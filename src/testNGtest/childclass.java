package testNGtest;

import org.testng.annotations.Test;

public class childclass extends parentclass {
	
	
	@Test
	public void run()
	{
		int a=3;
		ps2class obj=new ps2class(3);
		doThis(); //calling method from parent w/o creating object using inheritance
	    System.out.println(obj.increment());
	    System.out.println(obj.decrement());
	}

}
