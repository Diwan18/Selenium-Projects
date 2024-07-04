package SeleniumMarathan;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TataCliq {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(chromeoptions);
		driver.manage().window().maximize();
		driver.get("https://www.tatacliq.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		Actions act = new Actions(driver);
		
//		MouseHover on Brands
		WebElement Brands = driver.findElement(By.xpath("//div[text()='Brands']"));
		
		act.moveToElement(Brands).perform();
		
		WebElement Watches = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		
		
		act.moveToElement(Watches).perform();
		
		WebElement FeaturedBrands = driver.findElement(By.xpath("//div[text()='Casio']"));
		
		act.moveToElement(FeaturedBrands).click().perform();
		
		WebElement NewArvl = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
		
//		Selecting DropDownlist Using Select Method
		
		Select DD = new Select(NewArvl);
		
		DD.selectByValue("isProductNew");
		
		driver.findElement(By.xpath("(//div[text()='Men'])[1]")).click();
		
//		ScrollDown to Load the page
		
		WebElement Scroll = driver.findElement(By.className("ShowMoreButtonPlp__viewedProductsCount"));
		
		act.scrollToElement(Scroll).perform();
		
		String FirstPrice = driver.findElement(By.xpath("(//h3[text()='₹11995'])[1]")).getText();
//		Using List Get all the Product Price
		List<WebElement> Price = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']"));
		System.out.println("List of All Product Price");
		System.out.println(Price.size());
		
		
		for(WebElement ProductPrice : Price) {
			System.out.println(ProductPrice.getText());
			
			
		}
		
		
		
		
		driver.findElement(By.xpath("(//div[@class='ProductModule__dummyDiv'])[1]")).click();
//		Getting the window Handles
		Set<String> windowhandles = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowhandles);
		
		driver.switchTo().window(windows.get(1));
		
		String Pprice = driver.findElement(By.xpath("//h3[text()='MRP:  ₹11995']")).getText();
		System.out.println(Pprice);
		
		if(Pprice.contains(FirstPrice)) {
			System.out.println("Both Prices are  Matching");
		}
		
		String AddToCart = driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).getText();
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		
		String CartCount = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
		System.out.println("Cart Count" +CartCount);
		
		driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).click();
		
		Thread.sleep(3000);
		
		File ScrnShot = driver.getScreenshotAs(OutputType.FILE);
		
		File trg = new File("./Snap/img.png");
		
		FileUtils.copyFile(ScrnShot, trg);
		
		driver.close();
		
		Thread.sleep(3000);
		
		driver.switchTo().window(windows.get(0));
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		

		

	}

}
