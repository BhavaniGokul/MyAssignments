package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MararthonTcs1 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Select Chennai
		WebElement ch=driver.findElement(By.xpath("//div[@class='cities-names']/h6[text()='Chennai']"));
		driver.executeScript("arguments[0].click();",ch);

		driver.findElement(By.xpath("//div[@class='quick-book-m']//span[@class='cinemas-inactive']")).click();
		
		//Select cinema under quick book
		driver.findElement(By.xpath("//div[@id='cinema']/span[text()='Select Cinema']")).click();
		
		//Search for cinema
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[3]")).click();
		
		//select tomorrow
		driver.findElement(By.xpath("//li[contains(text(),'Tomorrow')]")).click();
		
		driver.findElement(By.xpath("//li[contains(text(),'ARANMANAI')]")).click();
		
		//select time
		driver.findElement(By.xpath("//span[text()='07:20 PM']")).click();
		//click book
		driver.findElement(By.xpath("//span[text()='Book']")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Accept')]")).click();
		driver.findElement(By.id("CL.CLUB|M:16")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		//get seat info
		String seatinfo=driver.findElement(By.xpath("//div[@class='seat-info']/p[text()='CLUB']")).getText();
		System.out.println("The seat info is:"+seatinfo);
		String seatno=driver.findElement(By.xpath("//div[@class='seat-number']/p")).getText();
		System.out.println("The seat number is: "+seatno);
		String grandtotal=driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']")).getText();
		System.out.println(grandtotal);
		
		//proceed
		driver.findElement(By.xpath("//div[@class='register-btn col-md-3']/button")).click();
		driver.findElement(By.id("mobileInput")).sendKeys("9876543210");
		driver.findElement(By.xpath("//div[@class='register-btn']/button[1]")).click();
		
		driver.findElement(By.xpath("//i[@class='pi pi-times']")).click();
		
		String title = driver.getTitle();
		System.out.println("The Title of the page is "+title);
		driver.close();
	}

}
