package testNGtest;

public class ps2class {
	int a; //global declarartion
	
	public ps2class(int a) { //parameterised constructor
		// TODO Auto-generated constructor stub
		this.a=a; 
		//global=instance variable
	}
	public int increment()
	{
		a=a+1;
		return a;
	}
	public int decrement()
	{
		a=a-1;
		return a;
	}

}
