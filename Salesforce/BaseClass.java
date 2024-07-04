package project.Salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public ChromeDriver driver ; 
	
	@Parameters({"url" , "usrnm" , "passwd"})
	@BeforeMethod
	public void preSet(String url , String usrnm , String passwd) {
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(url);
	driver.findElement(By.id("username")).sendKeys(usrnm);
	driver.findElement(By.id("password")).sendKeys(passwd);
	driver.findElement(By.id("Login")).click();
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	Actions action = new Actions(driver);
	WebElement ClickView_All = driver.findElement(By.xpath("//button[text()='View All']"));
	action.moveToElement(ClickView_All).click().perform();
	driver.findElement(By.xpath("//p[text()='Sales']")).click();
	WebElement Opportunities = driver.findElement(By.xpath("//span[text()='Opportunities']"));
	JavascriptExecutor executor = (JavascriptExecutor) driver;
	executor.executeScript("arguments[0].click();", Opportunities);
	
	
	}
	
	@AfterMethod
	public void postSet() {
//		driver.quit();
	}
	
	
	
}
