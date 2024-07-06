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
public class MyLeadsPage extends ProjectSpecificM {
	
	
	public MyLeadsPage(ChromeDriver driver) {
		this.driver = driver ;
		
	}
	
	public CreateLeadPage clickcreatelead() {
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		return new CreateLeadPage(driver) ;
		}
	
	
	
	
	

}
