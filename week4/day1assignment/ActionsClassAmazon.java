package week4.day1assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassAmazon {

	public static void main(String[] args) throws IOException {
		
		//load the amazon url
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.amazon.com.au/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement conditiontext = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
		//actions class;
		Actions builder=new Actions(driver);
		builder.scrollToElement(conditiontext).perform();
		
		
		
		String textitle=conditiontext.getText();
		System.out.println("The text of the element is: "+textitle);
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination= new File("./snapshot/001.png");
		FileUtils.copyFile(source, destination);
		
	}

}
