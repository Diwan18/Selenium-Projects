/**
 * 
 */
package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectSpecificM;

/**
 * @author Admin
 *
 */
public class CreateLeadPage extends ProjectSpecificM{
	
	public CreateLeadPage(ChromeDriver driver) {
		this.driver = driver ;
		
	}

	public CreateLeadPage entercname(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	return this;
	}
	
	public CreateLeadPage enterFname(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;
		}
	
	public CreateLeadPage enterlastname(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		return this;
		}
	
	public ViewLeadPage clickcreateleadbtn() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
		}
	
	
	
	
}
