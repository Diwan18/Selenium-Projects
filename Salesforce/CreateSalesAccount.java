package project.Salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateSalesAccount extends BaseClass {
	
	
	@Test
	public void createsalesaccount () throws InterruptedException {
		
		
		driver.findElement(By.xpath("//div[text()='New']")).click();
		
		driver.findElement(By.xpath("(//input[@class='slds-input'])[7]")).sendKeys("SalesForce Automation By Diwan");
		
		
		driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys("75000");
		
		WebElement Closedate = driver.findElement(By.xpath("//input[@name='CloseDate']"));
		driver.executeScript("arguments[0].click();", Closedate);
		WebElement Closedateselect = driver.findElement(By.xpath("(//span[text()='4'])[1]"));
		driver.executeScript("arguments[0].click();", Closedateselect);	
		WebElement Stage = driver.findElement(By.xpath("//button[@aria-label='Stage']"));
		driver.executeScript("arguments[0].click();", Stage);
		WebElement NeedAnalysis = driver.findElement(By.xpath("//span[@class='slds-media__body']//span[text()='Needs Analysis']"));
		driver.executeScript("arguments[0].click();", NeedAnalysis);	
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
		Thread.sleep(3000);
		String getOpportunityname = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']")).getText();
		System.out.println(getOpportunityname);
		Assert.assertEquals(getOpportunityname, "SalesForce Automation By Diwan");
		Thread.sleep(3000);
		
	}

}
