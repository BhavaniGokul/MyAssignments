package week4.day3assignment1;

import org.testng.annotations.Test;

public class AnnotationPriority {
	
	@Test(priority=1)
	public void add()
	{
		System.out.println("Addition");
	}
	@Test(priority=2)
	public void sub()
	{
		System.out.println("Subtraction");
	}
	@Test(priority=-1)
	public void mul()
	{
		System.out.println("Multiplication");
	}
	@Test()//default=0
	public void div()
	{
		System.out.println("Divsion");
	}
}
