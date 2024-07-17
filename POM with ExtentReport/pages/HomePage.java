package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class HomePage extends BaseClass {

	
	public MyHomePage clickonCRMSFA() throws IOException {
		try {
			getDriver().findElement(By.linkText("CRM/SFA")).click();
			reportStep("Crmsfa is clicked", "pass");
		} catch (Exception e) {
			System.out.println(e);
			reportStep("Crmsfa is not clicked", "fail");
		}
		return new MyHomePage();

	}
	
	
	public LoginPage clickOnLogout() throws IOException {
		try {
			getDriver().findElement(By.className("decorativeSubmit")).click();
			reportStep("Logout is successful", "pass");
		} catch (Exception e) {
			System.out.println(e);
			reportStep("Logout is not successful", "fail");
		}	
		return new LoginPage();
	}
}
