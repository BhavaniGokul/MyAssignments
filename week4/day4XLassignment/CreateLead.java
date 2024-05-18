package week4.day4XLassignment;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {

	@Test(dataProvider="SendData")
	public void RunCreateLead(String companyName,String firstName, String lastName) {


		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.name("submitButton")).click();
	}
		@DataProvider
		public String[][] SendData() throws IOException
		{
			ReadXL excel=new ReadXL();
			String[][] data=excel.readData();

			/*dataset[0][0]="TestLeaf";
			dataset[0][1]="Jai";
			dataset[0][2]="C";

			dataset[1][0]="HCL";
			dataset[1][1]="Tina";
			dataset[1][2]="K";

			dataset[2][0]="Quest";
			dataset[2][1]="Prem";
			dataset[2][2]="M";*/

			return data;

		}
	}