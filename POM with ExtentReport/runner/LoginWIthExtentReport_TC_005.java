package runner;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class LoginWIthExtentReport_TC_005 extends BaseClass{
	@BeforeTest
	public void getData() {
		dataFile="LoginPage";
		testName="LoginPage";
		testAuthor="Diwan";
		testCategory="Smoke";
		testDescription="Login Scenario";
	}
	
	
	
	
	@Test(dataProvider = "getValue")
	public void login(String uname,String pass) throws IOException {
		
		LoginPage lp=new LoginPage();

		lp.enterTheUsername(uname)
		.enterThePassword(pass)
		.clickOnLoginButton()
		.clickonCRMSFA();
	
	}
}
