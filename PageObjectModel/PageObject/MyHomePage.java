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
public class MyHomePage extends ProjectSpecificM {
	
	
	public MyHomePage(ChromeDriver driver) {
	this.driver = driver;
	}
	
	public MyLeadsPage clickleadstab() {
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		return new MyLeadsPage(driver);
		
	}
	

}
