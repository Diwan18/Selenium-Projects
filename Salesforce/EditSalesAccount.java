package project.Salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class EditSalesAccount extends BaseClass {
	
	
	@Test
	public void editsalesaccunt () throws InterruptedException {
	driver.findElement(By.xpath("//input[@name='Opportunity-search-input']")).sendKeys("SalesForce Automation By Diwan");
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//table[@role='grid']/tbody/tr[1]/td[8]/span")).click();
	
	
	Thread.sleep(5000);
	
	
	
	
	

	
	driver.findElement(By.xpath("//div[text()='Edit']/parent::a")).click();
	
	
	WebElement Closedate = driver.findElement(By.xpath("//input[@name='CloseDate']"));
	driver.executeScript("arguments[0].click();", Closedate);
	WebElement Closedateselect = driver.findElement(By.xpath("(//span[text()='5'])[1]"));
	driver.executeScript("arguments[0].click();", Closedateselect);	
//	Edit Stage 
	WebElement EditStage = driver.findElement(By.xpath("//button[@aria-label='Stage']"));
	driver.executeScript("arguments[0].click();", EditStage);
	WebElement PerceptionAnalysis = driver.findElement(By.xpath("//span[text()='Perception Analysis']"));
	driver.executeScript("arguments[0].click();", PerceptionAnalysis);	
//	Set Delivery inProgress
	WebElement Delivery = driver.findElement(By.xpath("(//span[text()='--None--'])[4]"));
	driver.executeScript("arguments[0].click();", Delivery);
	WebElement InProgress = driver.findElement(By.xpath("//span[text()='In progress']"));
	driver.executeScript("arguments[0].click();", InProgress);	
	
	
	driver.findElement(By.xpath("//textarea[@id='input-342']")).sendKeys("SalesForce");
	
	driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
	
	
	}

}
