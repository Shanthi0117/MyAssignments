package week4.day2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("bags",Keys.ENTER);
		
		//Click Men radio button
		Thread.sleep(2000);
		WebElement radioButton=driver.findElement(By.xpath("//input[@value='men,men women']"));
		driver.executeScript("arguments[0].click();",radioButton);
		
		Thread.sleep(2000);

		boolean isSelected=radioButton.isSelected();
		System.out.println("Men radio botton is selected:"+isSelected);


		
		//Check laptop bags checkbox
		Thread.sleep(2000);

		WebElement checkBox=driver.findElement(By.xpath("//input[@value='Laptop Bag']"));
		driver.executeScript("arguments[0].click();",checkBox);
		
		Thread.sleep(2000);

		boolean isChecked=checkBox.isSelected();
		System.out.println("Laptop bags checkbox is checked:"+isChecked);
		
		
		WebElement totalItems=driver.findElement(By.className("title-container"));
		System.out.println("No of bags:"+totalItems.getText());
		
		List<WebElement> elements = driver.findElements(By.className("product-brand"));
		List<Integer> brandName=new ArrayList<Integer>();
		
		for(int i=0;i<elements.size();i++)
		{
			String brand=elements.get(i).getText();
			System.out.println("Brand names:"+brand);
		}
		
		List<WebElement> productName = driver.findElements(By.className("product-product"));
		List<Integer> prdName=new ArrayList<Integer>();
		
		for(int i=0;i<elements.size();i++)
		{
			String product=elements.get(i).getText();
			System.out.println("Product name:"+product);
		}
	
		
	}

}
