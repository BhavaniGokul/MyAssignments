package week5.day1assignment;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class W3schoolXL extends BaseClass{
	
	
@Test(dataProvider="SendData")
	public void RunW3schoolXL (String fullName,String email,String address,String city,String zip,String state,String cvv,String cardno,String nameoncard) {
		
		
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(fullName);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='adr']")).sendKeys(address);
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);		
		driver.findElement(By.xpath("//input[@id='zip']")).sendKeys(zip);		
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys(state);		
		driver.findElement(By.xpath("//input[@id='ccnum']")).sendKeys(cardno);
		driver.findElement(By.xpath("//input[@id='expmonth']")).sendKeys("OCT");
		driver.findElement(By.xpath("//input[@id='cvv']")).sendKeys(cvv);
		driver.findElement(By.xpath("//input[@id='expyear']")).sendKeys("2018");
		driver.findElement(By.xpath("//input[@id='cname']")).sendKeys(nameoncard);
	
}
@DataProvider
public String[][] SendData() throws IOException 
{
	Readexcel excel=new Readexcel();
	String[][] readdata = excel.readdata();
	return readdata;

}


}
