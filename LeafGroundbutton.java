package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundbutton {

	//private static final char[] Point = null;

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();

		driver.findElement(By.id("j_idt88:j_idt90")).click();
		driver.navigate().back();
		//Thread.sleep(2000);
		//Checking title
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("Dashboard"))
		{System.out.println("Title is correct");}
		else
		{System.out.println("Title is incorrect");}

		//Check the button Confirm is disabled. 

		boolean buttonEnabled=false;
		buttonEnabled=driver.findElement(By.id("j_idt88")).isEnabled();

		if (buttonEnabled==true)
		{System.out.println("Confirm if the button is enabled = " + buttonEnabled);
		}
		else
		{System.out.println("Confirm if the button is disabled = " + buttonEnabled);
		}

		Point buttonLoc=driver.findElement(By.id("j_idt88:j_idt94")).getLocation();
		{System.out.println("The position of the button is: "+buttonLoc);
		}

		//‘Find the Save button background color

		String btncolor = driver.findElement(By.id("j_idt88:j_idt96")).getCssValue("color");
		System.out.println("Colour of the save button is "+btncolor);

		//Find and print the height and width of the submit button.
		Dimension btnSize=driver.findElement(By.id("j_idt88:j_idt98")).getSize();
		System.out.println("The height of the submit button is :"+btnSize.height);
		System.out.println("The width of the submit button is :"+btnSize.width);
		//driver.close();
	}
}


