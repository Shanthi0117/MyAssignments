package seleniumSample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageFacebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		
		//pass the url
		driver.get("https://facebook.com/");
		
		//maximize window
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("username");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(2000);
		
		//close the page
		driver.close();
		
		

	}

}
