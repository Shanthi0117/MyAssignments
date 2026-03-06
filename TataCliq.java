package Marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class TataCliq {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("--disable-notifications");
		 ChromeDriver driver = new ChromeDriver(options);
		 
		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement brand = driver.findElement(By.xpath("//div[text()='Brands']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(brand).perform();
		
		WebElement watches = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		act.moveToElement(watches).perform();
		
		//Click on product under Featured brands
		WebElement firstProduct = driver.findElement(By.xpath("//div[@class='DesktopHeader__featureBrands']//div[2]"));
		driver.executeScript("arguments[0].click();",firstProduct);

		
		driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']/option[@value='isProductNew']")).click();
		
		WebElement men = driver.findElement(By.xpath("//div[text()='Men']/following-sibling::span"));
		driver.executeScript("arguments[0].click();",men);
		
		Thread.sleep(2000);
		String FirstPriceinPage1 = driver.findElement(By.xpath("//div[@class='ProductDescription__priceHolder']")).getText();
		//System.out.println(FirstPriceinPage1);
		
		Thread.sleep(3000);
		List<WebElement> watchPrice = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']"));
		for(WebElement price : watchPrice)
			System.out.println(price.getText());

		driver.findElement(By.xpath("//a[@class='ProductModule__base']")).click();

		Set<String> childWindow = driver.getWindowHandles();		
		//convert set to list
		List<String> childWindows = new ArrayList<String>(childWindow);
		
		//Switching between "Merge contact window" to "from contact window"
		
		driver.switchTo().window(childWindows.get(1));

		String firstPrice = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']//h3")).getText();
		String firstPrice1 = firstPrice.replace("MRP: ", "");
		System.out.println(firstPrice1);
		
		if(FirstPriceinPage1.equals(firstPrice1))
		{
			System.out.println("Prices match");
		}
		else
		{
			System.out.println("Prices does not match");
		}
		
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		
		String addToCartCount = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
		System.out.println("Cart count:"+addToCartCount);
		
		driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();
		
		Thread.sleep(3000);
		
		File source=driver.getScreenshotAs(OutputType.FILE);
		File target=new File("./Screenshot/tatawatches.png");
		FileUtils.copyFile(source, target);
		
		driver.close();
		
		

		driver.switchTo().window(childWindows.get(0));
		driver.close();

		
		
	}

}
