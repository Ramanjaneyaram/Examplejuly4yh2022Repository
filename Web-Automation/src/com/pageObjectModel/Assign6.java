package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign6 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		CreateCustomer();
		//CreateProject();

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
	private static void CreateProjectandTask()
	{
		try
		{
			oPage.getAddnew().click();
			Thread.sleep(2000);
			oPage.getnewproject().click();
			Thread.sleep(2000);
			oPage.getprojectPopup_projectNameField().sendKeys("omkar");
			Thread.sleep(2000);
			oPage.getprojectPopup_projectDescriptionField().sendKeys("ok ");
			Thread.sleep(2000);
			oPage.getcreateTasksBlockButton().click();
			Thread.sleep(2000);
			oPage.getEntertaskname().sendKeys("ram");
			Thread.sleep(2000);
			//oPage.getTaskDiscritptionmark().sendKeys("what");
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
