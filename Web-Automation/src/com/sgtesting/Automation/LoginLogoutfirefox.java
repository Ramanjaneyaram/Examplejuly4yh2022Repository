package com.sgtesting.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginLogoutfirefox {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navugate();
		login();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.gecko.driver", "F:\\ECLIPSEAUTOMATIONTOOL\\Automation\\Web-Automation\\Library\\drivers\\geckodriver.exe");
			oBrowser=new FirefoxDriver();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navugate()
	{
		try
		{
			oBrowser.get("http://localhost:85/login.do");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath(""));
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
