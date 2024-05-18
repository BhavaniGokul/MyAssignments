package week4.day1assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsSnapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		//load the snapdeal url
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement menfash = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		//actions class;
		Actions builder=new Actions(driver);
		builder.moveToElement(menfash).perform();

		WebElement sportshoe = driver.findElement(By.xpath("(//span[.='Sports Shoes'])[1]"));
		builder.click(sportshoe).perform();

		//count of sport shoes
		WebElement sportshoecount = driver.findElement(By.xpath("(//div[@class='child-cat-count '])[2]"));
		String sportshoeprint=sportshoecount.getText();
		System.out.println("No. of sport shoes available for men: "+sportshoeprint);
		Thread.sleep(4000);
		//click on training shoes
		driver.findElement(By.xpath("//div[.='Training Shoes']")).click();
	
		Thread.sleep(2000);

		//checking price b4 sorting
		
		Thread.sleep(2000);
		List<WebElement> prices1 = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		
		int prices1size = prices1.size();
		System.out.println("Price list size before sorting: "+prices1size);
		
		List<Integer> prices1list=new ArrayList<Integer>();
		
		for (int i = 0; i < prices1size; i++) {
		String price1str = prices1.get(i).getText().replace("Rs. ","").replace(",", "");
			int price1int=Integer.parseInt(price1str);
			prices1list.add(price1int);
		}
		
		System.out.println("Shoes price list before sorting: "+prices1list);
		Collections.sort(prices1list);
		System.out.println("Shoes price list after script sorting: "+prices1list);
		
		//select from low to high
		driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
		driver.findElement(By.xpath("(//ul[@class='sort-value']/li)[2]")).click();

		
		//check low to high range sorted properly
		List<WebElement> prices2 = driver.findElements(By.xpath("//div[@class='lfloat marR10']/span[2]"));

		List<Integer> prices2list=new ArrayList<Integer>();

		for (int i = 0; i < prices2.size(); i++) {
			String price = prices2.get(i).getText().replace("Rs. ","").replace(",", "");
			int priceint=Integer.parseInt(price);
			prices2list.add(priceint);
		}
		System.out.println("Price list size in low to high range: "+prices2list.size());
		System.out.println("Price list from low to high range: "+prices2list);
		Integer minrange = prices2list.get(0);
		Integer maxrange = prices2list.get(prices1size-1);
		System.out.println("Minimum range of shoe price: Rs."+minrange);
		System.out.println("Maximum range of shoe price: Rs."+maxrange);
		
		//select 500-1000 range
		WebElement fromrange = driver.findElement(By.name("fromVal"));
		fromrange.clear();
		fromrange.sendKeys("500");

		WebElement torange = driver.findElement(By.name("toVal"));
		torange.clear();
		torange.sendKeys("1000");

		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();

		//select any colour
		driver.findElement(By.xpath("//label[@for='Color_s-White%20%26%20Blue']")).click();

		//?? 10. Verify all the applied filters. 
		//11. Mouse hover on the first resulting "Training Shoes". 
		WebElement firstelement = driver.findElement(By.xpath("(//picture[@class='picture-elem'])[1]"));

		Actions builder1=new Actions(driver);
		builder1.moveToElement(firstelement).perform();
		//Quick view button

		Thread.sleep(2000);
		By locator=By.xpath("(//div[@class='clearfix row-disc'])[1]");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.stalenessOf(firstelement));
		driver.findElement(locator).click();
		Thread.sleep(2000);

		WebElement cost = driver.findElement(By.xpath("//span[@class='payBlkBig']"));
		String quickviewcost = cost.getText();
		System.out.println("Shoe cost in quick view: "+quickviewcost);

		WebElement percent = driver.findElement(By.xpath("//span[@class='percent-desc ']"));
		String dispercent = percent.getText();
		System.out.println("Shoe cost in quick view: "+dispercent);
		
		//snapshot on quick view
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination= new File("./snapshot/shoe.png");
		FileUtils.copyFile(source, destination);
		
		driver.findElement(By.xpath("//div[@class='close close1 marR10']/i")).click();
	driver.close();
	}

}
