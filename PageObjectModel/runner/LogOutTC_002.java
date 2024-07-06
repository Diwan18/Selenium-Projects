

package runner;

import org.testng.annotations.Test;

import Base.ProjectSpecificM;
import PageObject.LoginPage;


 @Test
 public class LogOutTC_002 extends ProjectSpecificM {
	
	public void LogOut() {
		LoginPage lp = new LoginPage(driver);
		lp.enterTheUserName("Demosalesmanager")
		.enterThePass("crmsfa")
		.Clickloginbtn()
		
		.Logout();
		
		
		
		
	}

}
