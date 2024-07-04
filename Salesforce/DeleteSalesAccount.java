package project.Salesforce;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DeleteSalesAccount extends BaseClass {
	
	@Test
	public void Deletesalesaccunt () throws InterruptedException {
	driver.findElement(By.xpath("//input[@name='Opportunity-search-input']")).sendKeys("SalesForce Automation By Diwan");
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//table[@role='grid']/tbody/tr[1]/td[8]/span")).click();
	
	
	Thread.sleep(5000);	

	
	driver.findElement(By.xpath("//div[text()='Delete']/parent::a")).click();
	
	//span[text()='Delete']
	driver.findElement(By.xpath("//span[text()='Delete']")).click();
	
	
	
	}
}
