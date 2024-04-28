package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		//login page credentials
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Create leads
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Company1");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Firstname1");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Lastname1");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Title1");
		driver.findElement(By.className("smallSubmit")).click();
		
		//Checking title
		String title = driver.getTitle();
		System.out.println(title);
	if (title.contains("View Lead"))
		{System.out.println("Title displayed promptly");}
		else
		{System.out.println("Inappropriate page");}
		}

}
