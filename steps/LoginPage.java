package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.BaseClass;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends BaseClass {
	
	
	
	
//	@Given("Launch the Browser and load the URL")
//	public void launch_the_browser_and_load_the_url() {
//		driver  = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
//		driver.get("http://leaftaps.com/opentaps/");
//
//	}

	@When("Enter the Username as {string}")
	public void enter_the_username_as_demo_sales_manager(String Uname) {
		driver.findElement(By.id("username")).sendKeys(Uname);

	}

	@When("Enter the Password as {string}")
	public void enter_the_password_as_crmsfa(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);

	}

	@When("Click on LoginButton")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	
	}

	@Then("Verify the page")
	public void verify_the_page() {
		String Title =  driver.getTitle();
		if(Title.contains("TestLeaf")) {
			  System.out.println("Login is successfull");
		  }else {
			  System.out.println("Login is not Successfull");
		  }}
	
	@But("Verify the Hpage")
	public void verify_the_Hpage() {
		String Title =  driver.getTitle();
		if(Title.contains("Testleaf")) {
			  System.out.println("Login is successfull");
		  }else {
			  System.out.println("Login is not Successfull");
		  }}
	
	
	
	
		
		
	  
	}


