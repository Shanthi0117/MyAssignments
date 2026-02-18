package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestData {

	ChromeDriver driver = new ChromeDriver();

	public void enterCredentials()
	{
		
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR2");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

}
	

//Using back() navigated to previous page	
	public void navigateToHomePage()
	{
		driver.navigate().back();
	}
	
}
