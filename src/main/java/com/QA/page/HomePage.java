package com.QA.page;

import org.openqa.selenium.support.PageFactory;

import com.QA.util.TestBase;

public class HomePage extends TestBase{
	public HomePage ()
	{
		PageFactory.initElements(driver, this);
	}
	

}
