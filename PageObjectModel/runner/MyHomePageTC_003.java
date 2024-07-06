/**
 * 
 */
package runner;

import org.testng.annotations.Test;

import Base.ProjectSpecificM;
import PageObject.LoginPage;

/**
 * @author Admin
 *
 */
@Test
public class MyHomePageTC_003 extends ProjectSpecificM {
	
	 public void MyHomePage() {
			
			LoginPage lp = new LoginPage(driver);
			lp.enterTheUserName("Demosalesmanager")
			.enterThePass("crmsfa")
			.Clickloginbtn()
			.clickonCMSFA()
			.clickleadstab();
			}

}
