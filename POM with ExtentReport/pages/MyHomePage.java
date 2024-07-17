package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import config.Configuration;

public class MyHomePage extends BaseClass {

	
	public MyLeads clickOnLeadsButton() {
		
		String clickonLead = Configuration.configuartion().clickonLead();
		
		try {
			getDriver().findElement(By.linkText(clickonLead)).click();
		} catch (Exception e) {
			System.out.println(e);
		}
		return new MyLeads();
	}
}
