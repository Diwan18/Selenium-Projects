package runner;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class PropertiesFile_TC003 extends BaseClass{
	@BeforeTest
	public void getData() {
		dataFile="LoginPage";
	}
	
	
	
	
	@Test(dataProvider = "getValue")
	public void login(String uName,String pass) throws IOException {
		
		LoginPage lp=new LoginPage();
		lp.enterTheUsername(uName)
		.enterThePassword(pass)
		.clickOnLoginButton()
		.clickonCRMSFA()
		.clickOnLeadsButton()
		.clickOnCreatLeadButton();
	
	}

}
