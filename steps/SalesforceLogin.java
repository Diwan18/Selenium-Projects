package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesforceLogin {
	public ChromeDriver driver;
	
	@Given("Launch the Browser and the URL")
	public void launch_the_browser_and_the_url() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://login.salesforce.com/");
		
		
	}

	@When("enter the username as {string}")
	public void enter_the_username_as(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@When("enter the password as {string}")
	public void enter_the_password_as(String passwd) {
		driver.findElement(By.id("password")).sendKeys(passwd);
	}
	
	@When("click the login button")
	public void click_the_login_button() {
		driver.findElement(By.id("Login")).click();
	}
	
	
	@When("Click on toggle menu button from the left corner")
	public void click_on_toggle_menu_button_from_the_left_corner() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();		
	}
	
	
	@When("Click view All")
	public void Click_view_All() {
		Actions action = new Actions(driver);
		WebElement ClickView_All = driver.findElement(By.xpath("//button[text()='View All']"));
		action.moveToElement(ClickView_All).click().perform();
	}
	@When("click Sales from App Launcher")
	public void click_Sales_from_App_Launcher() {
		
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
	}

	
	

	@When("Click on Accounts tab")
	public void click_on_accounts_tab() {
		
		WebElement AccountsB = driver.findElement(By.xpath("(//span[text()='Accounts'])[1]"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", AccountsB);
		
	}

	@When("Click on New button")
	public void click_on_new_button() {
		
		driver.findElement(By.xpath("//div[text()='New']")).click();
	}
	

	@When("Enter {string} as account name")
	public void enter_as_account_name(String name) throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
		Thread.sleep(3000);
	}
	
	

	@When("Select Ownership as Public")
	public void select_ownership_as_public() throws InterruptedException {
		
		WebElement Ownership =  driver.findElement(By.xpath("(//span[text()='--None--'])[3]"));
		
		driver.executeScript("arguments[0].click();", Ownership);
		Thread.sleep(3000);
		WebElement Public = driver.findElement(By.xpath("//span[text()='Public']"));
		driver.executeScript("arguments[0].click();", Public);		
		
		
		
	}

	@When("Click save")
	public void click_save() {
		
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}

	@Then("verify Account name")
	public void verify_account_name() {
		
		String AccountName = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']")).getText();
		Assert.assertEquals(AccountName, "Diwan");
		
		driver.close();
	}
	
	

}
