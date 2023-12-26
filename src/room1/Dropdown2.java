package room1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
	WebElement coursename=driver.findElement(By.id("course"));
	Select set=new Select(coursename);
	List<WebElement> setoption= set.getOptions();
	for (WebElement option : setoption) {
		System.out.println(option.getText());
		
	}
	set.selectByIndex(2);
	Thread.sleep(3000);
	set.selectByValue("Java");
	Thread.sleep(3000);
	set.selectByIndex(1);
	Thread.sleep(3000);
	String Selectedtest=set.getFirstSelectedOption().getText();
	System.out.println("Selected visible test -" + Selectedtest); 
	
	
	
	


	}

}
