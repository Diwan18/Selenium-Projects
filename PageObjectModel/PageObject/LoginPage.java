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
public class LoginPage extends ProjectSpecificM {

	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
		
		// TODO Auto-generated constructor stub
	}

	public LoginPage enterTheUserName(String usrname) {
		driver.findElement(By.id("username")).sendKeys(usrname);
		return this;
		}
	
	public LoginPage enterThePass(String Pass) {
		driver.findElement(By.id("password")).sendKeys(Pass);
		return this;
		}
	public HomePage Clickloginbtn() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage(driver);
		}
	
	
	
}
