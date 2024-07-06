
package runner;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.ProjectSpecificM;
import PageObject.LoginPage;



  @Test
 public class LoginTC_001 extends ProjectSpecificM{
	
	 public void login() {
		
		LoginPage lp = new LoginPage(driver);
		lp.enterTheUserName("Demosalesmanager")
		.enterThePass("crmsfa")
		.Clickloginbtn()
		.clickonCMSFA();
		
		
	}

}
