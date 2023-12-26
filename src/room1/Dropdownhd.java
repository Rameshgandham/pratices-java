package room1;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.base.StandardSystemProperty;

public class Dropdownhd {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
		driver.findElement(By.id("course"));
		WebElement CourseElement = driver.findElement(By.id("course"));
		Select dropdown=new Select(CourseElement);
		dropdown.selectByIndex(0);
		Thread.sleep(3000);
		dropdown.selectByValue("Java");
		Thread.sleep(3000);
		dropdown.selectByVisibleText("Dot Net");
		Thread.sleep(3000);
		List<WebElement>dropdownooptio=dropdown.getOptions();
		for (WebElement option : dropdownooptio) 
		{
			System.out.println(option.getText());
			
		}
		
	String selectedtet=	dropdown.getFirstSelectedOption().getText();
	System.out.println("Selected visible text - " +selectedtet);


		
		

		}
		






	}


