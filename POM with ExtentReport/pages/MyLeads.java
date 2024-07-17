
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import config.Configuration;

public class MyLeads extends BaseClass {

	
	
	public CreateLeadPage clickOnCreatLeadButton() {
		
		String clickonCreateLead = Configuration.configuartion().clickonCreateLead();
		getDriver().findElement(By.partialLinkText(clickonCreateLead)).click();
		return new CreateLeadPage();
	}
}
