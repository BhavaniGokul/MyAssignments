package week4.day3assignment1;

import org.testng.annotations.Test;

public class InvocCount {
	@Test()
	public void add()
	{
		System.out.println("Addition");
	}
	@Test()
	public void sub()
	{
		System.out.println("Subtraction");
	}
	@Test(invocationCount=3)
	public void mul()
	{
		System.out.println("Multiplication");
	}
	@Test()
	public void div()
	{
		System.out.println("Divsion");
	}

}
