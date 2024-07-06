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
public class CreateLeadTC_004 extends ProjectSpecificM {

	
	

		
		 public void CreateLead() {
				
				LoginPage lp = new LoginPage(driver);
				lp.enterTheUserName("Demosalesmanager")
				.enterThePass("crmsfa")
				.Clickloginbtn()
				.clickonCMSFA()
				.clickleadstab()
				.clickcreatelead()
				.entercname("abc")
				.enterFname("Diwan")
				.enterlastname("Mohammad")
				.clickcreateleadbtn();
				
				}
}
