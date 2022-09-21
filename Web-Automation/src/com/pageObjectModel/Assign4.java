package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign4 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		CreateCustomer();
		ModifyCustomer();
		DeleteCustomer();
		logout();
		closeApplication();

	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "F:\\ECLIPSEAUTOMATIONTOOL\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
			
		}catch(Exception e)
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
	private static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void CreateCustomer()
	{
		try
		{
			oPage.getTask().click();
			Thread.sleep(4000);
			oPage.getAddnew().click();
			Thread.sleep(2000);
			oPage.getNewCustomer().click();
			Thread.sleep(2000);
			oPage.getcustomerLightBox_nameField().sendKeys("java program");
			oPage.getcustomerLightBox_descriptionField().sendKeys("laern java");
			oPage.getCreateCustomer().click();
			Thread.sleep(4000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void ModifyCustomer()
	{
		try
		{
			oPage.getmodifysetting().click();
			Thread.sleep(4000);
			oPage.getmodifyDiscription().clear();
			Thread.sleep(4000);
			oPage.getmodifyDiscription().sendKeys("its ok now");
			Thread.sleep(4000);
			oPage.getmodifyCancel().click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void DeleteCustomer()
	{
		try
		{
			oPage.getmodifysetting().click();
			Thread.sleep(4000);
			oPage.getDeleteAction().click();
			Thread.sleep(4000);
			oPage.getDeletecust().click();
			Thread.sleep(4000);
			oPage.getDeletePermenentlyCustome().click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			oPage.getLogoutLink().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
