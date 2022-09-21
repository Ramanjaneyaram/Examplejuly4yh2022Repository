package com.sgtesting.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class  FirefoxBrowserDemo2{
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		LaunchBrowser();
		//navigate();
		//closeApplication();

	}
	private static void LaunchBrowser()
	{
		try {
			System.setProperty("webdriver.gecko.driver", "C:\\ECLIPSEAUTOMATIONTOOL\\Automation\\Web-Automation\\Library\\drivers\\geckodriver.exe");
	
			oBrowser = new FirefoxDriver();

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void navigate()  
	{
		try
		{ 
			oBrowser.get("http://localhost:85/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{
			Thread.sleep(5000);
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}