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
public class HomePage extends ProjectSpecificM {
	    
	
	public HomePage(ChromeDriver driver) {
		this.driver = driver;
	}

	public MyHomePage clickonCMSFA() {
	    	driver.findElement(By.linkText("CRM/SFA")).click();
	    	return new MyHomePage(driver);
		}

	public LoginPage Logout() {
			driver.findElement(By.className("decorativeSubmit")).click();
			return new LoginPage(driver);
			}

}
