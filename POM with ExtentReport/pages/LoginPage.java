package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends BaseClass{

	
	@Given("Enter the username as {string}")
	public LoginPage enterTheUsername(String uName) throws IOException {
		
		try {
			getDriver().findElement(By.id("username")).sendKeys(uName);
			reportStep("UserName As Enter successfully", "pass");
		} catch (Exception e) {
			System.out.println(e);
			reportStep("UserName as Not Enter", "fail");
		}
		
		return this;
	
	}
	
	@Given("Enter the password as {string}")
	public LoginPage enterThePassword(String pass) throws IOException {
		try {
			getDriver().findElement(By.id("password")).sendKeys(pass);
			reportStep("Password as Enter Successfully", "pass");
		} catch (Exception e) {
			System.out.println(e);
			reportStep("Password as Not Enter", "fail");
		}
		return this;
	}
	
	@When("Click on Login Button")
	public HomePage clickOnLoginButton() throws IOException {
		try {
			getDriver().findElement(By.className("decorativeSubmit")).click();
			reportStep("Login is Successful", "pass");
		} catch (Exception e) {
			System.out.println(e);
			reportStep("Login is not Successful", "fail");
		}
		
		return new HomePage();

	}
	
	@Then("Verify the page")
	public void verify_the_page() {
		String title = getDriver().getTitle();
		  if(title.contains("Testleaf")) {
			  System.out.println("Login is successfull");
		  }else {
			  System.out.println("Login is not Successfull");
		  }
	}
	
}
