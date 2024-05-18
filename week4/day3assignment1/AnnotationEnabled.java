package week4.day3assignment1;

import org.testng.annotations.Test;

public class AnnotationEnabled {
	//Default value for enabled is false
	@Test()
	public void add()
	{
		System.out.println("Addition");
	}
	@Test(enabled=false)
	public void sub()
	{
		System.out.println("Subtraction");
	}
	@Test()
	public void mul()
	{
		System.out.println("Multiplication");
	}
	@Test(enabled=false)
	public void div()
	{
		System.out.println("Divsion");
	}

}
