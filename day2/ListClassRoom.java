package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListClassRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//maximize the webpage
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phones");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		
		List<WebElement> price = driver.findElements(By.className("a-price-whole"));
		
		for(int i=0;i<price.size();i++)
		{
			System.out.println("Prices details:"+price.get(i).getText());
		}


	}

}
