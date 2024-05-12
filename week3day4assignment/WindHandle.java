package week3day4assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindHandle {

	public static void main(String[] args) throws InterruptedException {
		//launching browser
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();

		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//login page credentials
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();

		//From contact widget from contacts tab
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		driver.findElement(By.xpath("(//table[@class='twoColumnForm']//tr/td[2]/a)[1]")).click();

		//getting parent window title
		String parentwin = driver.getWindowHandle();
		String parenttitle = driver.getTitle();
		System.out.println("Title of parent window: "+parenttitle);

		//switch control to new window
		Set<String> openwin = driver.getWindowHandles();
		System.out.println("No. of window: "+openwin.size());
		List<String> childwin=new ArrayList<String>(openwin);
		driver.switchTo().window(childwin.get(1));

		//title of sub window
		String childwintitle = driver.getTitle();
		System.out.println("Second window title: "+childwintitle);
		
		//clicking first displaying contact
		driver.findElement(By.xpath("(//div[@class='x-grid3-row   ']/table//td/div/a)[1]")).click();

		//control switch to parentwindow
		driver.switchTo().window(parentwin);

		//Clicking To contact widget
		//driver.findElement(By.xpath("(//table[@class='twoColumnForm']//tr/td[2]/a)[2]")).click();
		driver.findElement(By.xpath("//table[@id='widget_ComboBox_partyIdTo']/following-sibling::a")).click();

		//Clicking second listing contact		
		Set<String> openwin2 = driver.getWindowHandles();
		List<String> newwin2=new ArrayList<String>(openwin2);
		driver.switchTo().window(newwin2.get(1));

		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();

		driver.switchTo().window(parentwin);
		
		//clicking merger button
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		Thread.sleep(2000);
		//switching control to alert
		Alert confirmalert = driver.switchTo().alert();
		confirmalert.accept();
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println("After merge the title is:"+title);
	}

}
