package Academy.E2EProject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Resources.base;
import pageObject.LandingPage;
import pageObject.PracticePage;

public class ValidatePractice  extends base {
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());	
	
	@BeforeTest
	public void StartUp() throws IOException 
	{
		driver=initializeDriver();
		log.info("Driver is initialize");
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		log.info("Navigated to Home Page");
	}
	
/*	@Test 
	public void validateElementsDisplayed() throws InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		LandingPage l = new LandingPage(driver);
		l.getPractice().click();
		Thread.sleep(2000);
		PracticePage pp= new PracticePage(driver);
		Thread.sleep(2000);
		pp.getHideBtn().click();		
		Thread.sleep(2000);		
		if (pp.getElementDisplayed().isDisplayed())
		{
			log.info("Test Case failed");
		}
		else 
		{
			log.info("Test Case passed");
		}		
	}
	*/
	
	@Test
	public void validatePracticePage() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		LandingPage l = new LandingPage(driver);
		l.getPractice().click();
		Thread.sleep(2000);
		PracticePage pp= new PracticePage(driver);
		Thread.sleep(2000);
		pp.getText().click();
		pp.getText().sendKeys(prop.getProperty("ValueSwitchtoAlert"));
		Thread.sleep(1000);
		pp.getAlert().click();
		Thread.sleep(1000);
		pp.driver.switchTo().alert().accept();
		Thread.sleep(1000);		
		Select s= new Select(pp.getDropDown());
		s.selectByIndex(2);						
		Thread.sleep(1000);
		pp.getOpenWindow().click();	
		
	}
	
	@AfterTest
	public void tearDown()
	{		
		driver.quit();
	}
	
}
