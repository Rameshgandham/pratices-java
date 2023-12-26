package room1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(3000);
	//	System.out.println(driver.switchTo().alert().getText());
		driver.findElement(By.id("alertBox")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println(driver.switchTo().alert().getText());

	}

}
