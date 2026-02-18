package seleniumSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Day2AdvXpath {

		// TODO Auto-generated method stub
		
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/");
				
			driver.manage().window().maximize();
			
			driver.findElement(By.id("username")).sendKeys("DemoCSR2");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
			

			driver.findElement(By.xpath("//span[text()='Company Name']/following::input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
			
			Thread.sleep(4000);
			//driver.findElement(By.xpath("//span[text()='First name']/following::input[@id='createLeadForm_firstName']")).sendKeys("Srinisha");
			//driver.findElement(By.xpath("//span[text()='Last name']/following::input[@id='createLeadForm_lastName']")).sendKeys("S");

			driver.findElement(By.xpath("//span[text()='Forename']/following::input[@id='createLeadForm_firstName']")).sendKeys("Srinisha");
			driver.findElement(By.xpath("//span[text()='Surname']/following::input[@id='createLeadForm_lastName']")).sendKeys("S");


			driver.findElement(By.xpath("//span[text()='First Name (Local)']/following::input[@id='createLeadForm_firstNameLocal']")).sendKeys("local");
			

			//younger to elder cousin
			//driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']/preceding::span[text()='Department']")).sendKeys("Selenium");

			//Younger to elder cousin
				driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Testing");


				driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("kshanthigvg@yahoo.com");


				WebElement dropDownelement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select option = new Select(dropDownelement);
				option.selectByVisibleText("New York");

				driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//a[text()='Edit']")).click();
				
				driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
				driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).sendKeys("Important Testing");
				driver.findElement(By.xpath("//input[@name='submitButton']")).click();
				
				driver.getTitle();
				driver.close();


				


	}
		
		

}
