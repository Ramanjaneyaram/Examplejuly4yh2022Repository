package com.testngpackage;

import static org.testng.Assert.assertEquals;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




public class Assign1 {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
	}
	@Test(priority=1)
	
	private static void launchbrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "F:\\ECLIPSEAUTOMATIONTOOL\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	private static void navigate()  
	{
		try
		{ 
			
			String expected="actiTIME - Login";
			oBrowser.get("http://localhost:85/login.do");
			Thread.sleep(2000);
			String actual=oBrowser.getTitle();
			assertEquals(expected, actual);
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=3,dataProvider="getCredential")
	private static void login(String User,String password)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys(User);
			oBrowser.findElement(By.name("pwd")).sendKeys(password);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(5000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	private static void minimize()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(5000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5,dataProvider="UserDetails")
	private static void createuser(String fname,String lname,String mail,String Uname,String Pword,String RetypePword)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys(fname);
			oBrowser.findElement(By.name("lastName")).sendKeys(lname);
			oBrowser.findElement(By.name("email")).sendKeys(mail);
			oBrowser.findElement(By.name("username")).sendKeys(Uname);
			oBrowser.findElement(By.name("password")).sendKeys(Pword);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys(RetypePword);
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	private static void Deleteuser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='kumar, rakes']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	private static void close() 
	{
		try
		{
			oBrowser.quit();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	} 
	@DataProvider
	public Object[][] getCredential()
	{
		Object obj[][]={{"admin","manager"}};
		return obj;
		
	}
	@DataProvider
	public Object[][] UserDetails()
	{
		Object obj[][]={{"rakes","kumar","rakesh23@gmail.com","raki","rak123","rak123"}};
		return obj;
	}

}
