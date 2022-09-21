package com.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowserr();
		navigate();
		//AbsoluteXpath();

	}
	private static void launchBrowserr()
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
	private static void navigate()
	{
		try
		{
			oBrowser.get("file:///C:/Users/ramnj/AppData/Local/Temp/Rar$EXa0.816/Sample.html");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void AbsoluteXpath()
	{
		oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("ram");
	}
	private static void relativeXPathUsingTagName()
	{
		//using tag name to identify the element
		//Syntax: //<tagName>
		oBrowser.findElement(By.xpath("//input")).sendKeys("ram");
	}

}
