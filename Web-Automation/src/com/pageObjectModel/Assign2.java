package com.pageObjectModel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign2 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		CreatUsers();
		DeleteUser();
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
	private static void CreatUsers()
	{
		try
		{
			oPage.getUsers().click();
			oPage.getAddUser().click();
			oPage.getfirstName().sendKeys("omkar");
			oPage.getlastName().sendKeys("omakr");
			oPage.getemail().sendKeys("omkar267@gmail.com");
			oPage.getusername().sendKeys("omakr");
			oPage.getusepasswordField().sendKeys("omkar267");
			oPage.getuserDataLightBox_passwordCopyField().sendKeys("omkar267");
			Thread.sleep(2000);
			oPage.getCreateuser().click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void DeleteUser()
	{
		try
		{
			oPage.getFirstNameandlastnamr().click();
			Thread.sleep(4000);
			oPage.getDeleteUser().click();
			Thread.sleep(4000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
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
