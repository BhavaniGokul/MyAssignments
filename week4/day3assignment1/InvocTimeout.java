package week4.day3assignment1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocTimeout {
	@Test()
	public void add()
	{
		System.out.println("Addition");
	}
	@Test(timeOut=100)
	public void browseopen()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https:/google.com/");
		System.out.println("Browser opened");
		
	}
	@Test()
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
