package week2.day3;

import org.openqa.selenium.By;

public class LoginTestData extends TestData{
	


	public void enterUsername()
	{
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("DemoCSR2");

	}
	
	public void enterPassword()
	{
		driver.findElement(By.id("password")).clear();

		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		LoginTestData data=new LoginTestData();
		data.enterCredentials();
		Thread.sleep(4000);

		data.navigateToHomePage();
		Thread.sleep(4000);
		data.enterUsername();
		data.enterPassword();

	}

}
