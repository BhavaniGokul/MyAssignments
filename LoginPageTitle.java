package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTitle {

	public static void main(String[] args) {
		//opening browser
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//login page credentials
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Checking title
		String title = driver.getTitle();
		System.out.println(title);
	if (title.contains("taps"))
		{System.out.println("Login is successful");}
		else
		{System.out.println("Login is unsuccessful");}
	
		
	}

}
