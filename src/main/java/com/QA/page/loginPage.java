package com.QA.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QA.util.TestBase;

public class loginPage extends TestBase {
	@FindBy(name = "Username")
	WebElement Username;
	
	@FindBy(name = "Password")
	WebElement Password;
	
	@FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
	WebElement loginButton;
	
	
	public loginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//public boolean ValidateCRMimage()
	//{
		//return crmLogo.isDisplayed();
		
	//}
	
	public HomePage login(String un, String pwd)
	{
		Username.sendKeys(un);
		Username.sendKeys(pwd);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].click", loginButton);
		
		return new HomePage();
	}
	

}
