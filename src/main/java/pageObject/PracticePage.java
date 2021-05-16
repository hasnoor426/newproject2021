package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;

public class PracticePage {
	public WebDriver driver;
	
	
	public PracticePage (WebDriver driver)
	{
		this.driver= driver;
	}
	
	By TextBox= By.id("name");
	public WebElement getText()
	{
		return driver.findElement(TextBox);
	}
	
	By Alert= By.id("alertbtn");
	public WebElement getAlert()
	{
		return driver.findElement(Alert);
	}
	

	By OpenWindow=By.id("openwindow");
	public  WebElement getOpenWindow() 
	
	{
	  return driver.findElement(OpenWindow);	
	}

	By DropDown= By.id("dropdown-class-example");
	public WebElement getDropDown()
	{
		return driver.findElement(DropDown);
	}
	
	By ElementDisplayed= By.name("show-hide");
	public WebElement getElementDisplayed()
	{
		return driver.findElement(ElementDisplayed);
	}
	
	By Hide= By.id("hide-textbox");
	public WebElement getHideBtn()
	{
		return driver.findElement(Hide);
	}
	
	By Show= By.id("show-textbox");
	public WebElement getShowBtn()
	{
		return driver.findElement(Show);
	}
	
}
