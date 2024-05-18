package week4.day1assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsMobile {

	public static void main(String[] args) throws IOException, InterruptedException {

		//load the amazon url
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.amazon.com.au/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//search for oneplus 10 pro
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 10 pro",Keys.ENTER);

		//get phone price
		WebElement phoneprice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
		String phonepriceprint=phoneprice.getText();
		System.out.println("First displayed phone price: "+phonepriceprint);
		Thread.sleep(3000);

		//get customer ratings

		By locator=By.xpath("(//span[@class='a-declarative']//i)[1]");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		driver.findElement(locator).click();
		Thread.sleep(2000);

		By locator1=By.xpath("//span[contains(@class,'base a-text-beside-button a-text-bold')]");
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait1.until(ExpectedConditions.presenceOfElementLocated(locator1));
		String ratingtext = driver.findElement(locator1).getText();

		System.out.println("Customer rating for first product: "+ratingtext);


		//click first displaying link of first image
		driver.findElement(By.xpath("(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-4']//a)[1]")).click();

		//screenshot of product displayed
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination= new File("./snapshot/002.png");
		FileUtils.copyFile(source, destination);

		//click add to cart
		driver.findElement(By.id("add-to-cart-button")).click();

		WebElement subtotal = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
		String subtotalprice = subtotal.getText();

		System.out.println("Price displayed in subtotal: "+subtotalprice);

		if(phonepriceprint.contains(subtotalprice))
		{
			System.out.println("Product price is same as subtotal: = " + phonepriceprint);
		} else 
		{
			System.out.println("Product price is not same as subtotal: = " + subtotalprice);
		}

		// Close the browser.
		//	driver.close();
	}

}
