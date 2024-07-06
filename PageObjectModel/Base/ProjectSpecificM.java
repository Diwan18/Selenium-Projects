/**
 * 
 */
package Base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

/**
 * @author Admin
 *
 */
public class ProjectSpecificM {
	
	public  ChromeDriver driver;
	
	@BeforeMethod
	public void PreSetup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		

	}
	
	@AfterMethod
	public void PostSetup() {
		driver.close();

	}

}
