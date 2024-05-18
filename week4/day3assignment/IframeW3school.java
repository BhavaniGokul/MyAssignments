package week4.day3assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeW3school {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//switch tryit frame
		//driver.switchTo().frame("iframeResult");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//switch to alert
		Alert confirmAlert=driver.switchTo().alert();
		confirmAlert.accept();

		String text=driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(text);
		driver.close();
	}
}
