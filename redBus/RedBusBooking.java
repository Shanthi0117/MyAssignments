package redBus;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.it.Date;

public class RedBusBooking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement Source=driver.findElement(By.id("srcinput"));
		driver.executeScript("arguments[0].click();",Source);
		Source.sendKeys("Bangalore");
		
		Thread.sleep(2000);
		WebElement Area=driver.findElement(By.xpath("//div[text()='Madiwala, Bangalore']"));
		driver.executeScript("arguments[0].click();",Area);
		
		
		
		WebElement Destination=driver.findElement(By.id("destinput"));
		Destination.click();
		Destination.sendKeys("Chennai");
		
		Thread.sleep(2000);
		WebElement DesArea=driver.findElement(By.xpath("//div[text()='Koyambedu, Chennai']"));
		driver.executeScript("arguments[0].click();",DesArea);

			
		//select tomorrows date
		WebElement DatePicker=driver.findElement(By.xpath("//div[@role='combobox']"));
		DatePicker.click();
		
		Thread.sleep(2000);
		//WebElement DateSelected=driver.findElement(By.xpath("//span[text()='26']"));
		WebElement DateSelected=driver.findElement(By.xpath("//div[@data-datetype='AVAILABLE']//span"));
		driver.executeScript("arguments[0].click();",DateSelected);

		//Click on search buses
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='Search buses']")).click();
		
		//Total number of buses displayed
		Thread.sleep(2000);
		WebElement TotalNoOfBuses=driver.findElement(By.xpath("//div[contains(@class,'busesFoundText__ind-search-styles-module-scss-PHVGD')]"));
		System.out.println("Total number of buses:"+TotalNoOfBuses.getText());
		
		//select AC checkbox
		Thread.sleep(2000);

		WebElement Ac=driver.findElement(By.xpath("//div[contains(text(),'AC')]"));
		driver.executeScript("arguments[0].click();", Ac);
		System.out.println("Clicked on AC checkbox");
		
		//Click on Bus Type
		Thread.sleep(2000);
		WebElement BusType=driver.findElement(By.xpath("//div[@data-autoid='busType']"));
		driver.executeScript("arguments[0].click();", BusType);
		System.out.println("Clicked on Bus type");
		
		//Click on Bus features
		Thread.sleep(2000);
		WebElement BusFeatures=driver.findElement(By.xpath("//h3[text()='Bus features']"));
		driver.executeScript("arguments[0].click();", BusFeatures);
		System.out.println("Clicked on Bus Features");
		
		//Click on High rated bus features
		Thread.sleep(2000);
		WebElement HighRatedBus=driver.findElement(By.xpath("//div[@class='leftContent___86eb9e']//div[text()='High Rated Buses']"));
		driver.executeScript("arguments[0].click();", HighRatedBus);
		System.out.println("Cheched High rated bus ");
		
		List<WebElement> PriceList = driver.findElements(By.xpath("//p[contains(@class,'finalFare___0b90fc')]"));
		List<Integer> BusPrice=new ArrayList<Integer>();
		for(WebElement bp:PriceList)
		{
			int price = Integer.parseInt(bp.getText().replaceAll("[^0-9]", ""));
			BusPrice.add(price);

		}
		
		BusPrice.sort(null);
		
		System.out.println("Lowest bus price:"+BusPrice.get(0));
		
		System.out.println("Title of the page is :"+driver.getTitle());
		
		
		}

}
