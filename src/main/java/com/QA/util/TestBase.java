package com.QA.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					"/Users/babitathakur/Downloads/Project/com.PractiseCucumberBDDFramework/src/main/java/com/QA/config/config.properties");
			prop.load(fis);
		} catch (IOException e) {
			e.getMessage();

		}
	}
	
	@SuppressWarnings("deprecation")
	public static void intialization()
	{
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
		driver = new ChromeDriver();
		
		}
		if(browserName.equals("FF"))
		{
		driver = new FirefoxDriver();
		
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
	}

}
