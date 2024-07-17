package base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utils.IntegrationWIthTC;


public class BaseClass  extends AbstractTestNGCucumberTests{

public static ExtentReports repo;
public static ExtentTest test;

public String testName,testDescription,testAuthor,testCategory;
public String dataFile;


	private static final ThreadLocal<RemoteWebDriver> tlDriver=new ThreadLocal<RemoteWebDriver>();
	
	public void setDriver() {
		tlDriver.set(new ChromeDriver());
	}
	
	public RemoteWebDriver getDriver() {
		return tlDriver.get();
	}
	
	
	
	
	@BeforeMethod
	public void perSetUp() {
setDriver();
getDriver().manage().window().maximize();
getDriver().get("http://leaftaps.com/opentaps/control/main");
getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	
	@AfterMethod
	public void postSetUp() {
		getDriver().quit();	
	}
	
	@DataProvider(name="getValue")
	public String[][] fetchData() throws IOException {	
		
		return IntegrationWIthTC.readExcel(dataFile);
	
	}

	@BeforeSuite
	public void startReport() {
		ExtentHtmlReporter wb=new ExtentHtmlReporter("./reports/Pom.html");
		wb.setAppendExisting(true);
		repo=new ExtentReports();
		repo.attachReporter(wb);


	}
	
	@AfterSuite
	public void stopReport() {
		repo.flush();
	}
	
	
	@BeforeClass
	public void testDetails() {
		test=repo.createTest(testName, testDescription);
		test.assignAuthor(testAuthor);
		test.assignCategory(testCategory);

	}
	
	public void reportStep( String testDtls,String testStatus) throws IOException {
		if (testStatus.equalsIgnoreCase("pass")) {
			test.pass(testDtls, MediaEntityBuilder.createScreenCaptureFromPath(".././snap/img"+takeSnap()+".png").build());
		}else if(testStatus.equalsIgnoreCase("fail")) {
			test.fail(testDtls, MediaEntityBuilder.createScreenCaptureFromPath(".././snap/img"+takeSnap()+".png").build());
		}

	}
	
	public int takeSnap() throws IOException {
		int random = (int) (Math.random()*99999);

		File scr = getDriver().getScreenshotAs(OutputType.FILE);
		File dst=new File("./snap/img"+random+".png");
		FileUtils.copyFile(scr, dst);
		
		return random;
	}
	
	//img5698767-username
	//img34657-password

	
	
}
