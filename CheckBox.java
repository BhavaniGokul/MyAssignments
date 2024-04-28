package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
//**Done partially ..have doubts		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		// Click on the "Basic Checkbox.” -
		//Click on the "Notification Checkbox." - 
		
		driver.findElement(By.id("j_idt87:j_idt89")).click();
		driver.findElement(By.id("j_idt87:j_idt91")).click();
		driver.findElement(By.id("j_idt87:basic")).click();
		driver.findElement(By.id("j_idt87:ajaxTriState")).click();
		driver.findElement(By.id("jj_idt87:j_idt100")).click();
		driver.close();
	}

}
