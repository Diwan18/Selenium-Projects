package runner;

import java.io.IOException;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class LoginOut_TC002 extends BaseClass {

	
	@Test
	public void logout() throws IOException {
		LoginPage lp = new LoginPage();
		
		lp.enterTheUsername("DemoSalesManager")
		.enterThePassword("crmsfa")
		.clickOnLoginButton()
		.clickOnLogout();
		
	}
}
