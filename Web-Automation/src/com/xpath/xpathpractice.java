package com.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathpractice {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	absoluteXPath();
	//	relativewihtagname();
		relativexpathtagnamewithindex();
	//	relativeXPathUsingTagNameWithAttributeNameValue();
	//	relativeXPathUsingAttributeNameValue();
	//	relativeXPathUsingAttributeValue();
	//	relativeXPathUsingTagNameWithMultipleAttributeNameValue();
	//	relativeXPathUsingTagNameWithMultipleAttributeNameValueUsingAndOperator();
	//	relativeXPathUsingTagNameWithMultipleAttributeNameValueUsingOROperator();
	//	relativeXPathUsingPartialMatchingOfAttributeValue();
	//	relativeXPathUsingTagNameWithAttributeName();
	//	relativeXPathUsingTagNameWithAttributeName_1();
	//	relativeXPathUsingTagNameWithAttributeName_2();
	//	relativeXPathUsingTextContent();
	//	relativeXPathUsingPartialMatchingOfTextContent();
		

	}
	private static void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\ECLIPSEAUTOMATIONTOOL\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
		oBrowser =new ChromeDriver();
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("file:///g:/Xpath/Sample.html");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void absoluteXPath()
	{
		try
		{
			oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("Omkar");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void relativewihtagname()
	{
		oBrowser.findElement(By.xpath("//input")).sendKeys("omkar");
	}
	private static void relativexpathtagnamewithindex()
	{
		oBrowser.findElement(By.xpath("//input[2]")).sendKeys("omkar");
	}
	private static void relativeXPathUsingTagNameWithAttributeNameValue()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit']")).click();
	}
	private static void relativeXPathUsingAttributeNameValue()
	{
		oBrowser.findElement(By.xpath("//*[@value='Submit']")).click();
	}
	private static void relativeXPathUsingAttributeValue()
	{
		oBrowser.findElement(By.xpath("//*[@*='Submit']")).click();
	}
	private static void relativeXPathUsingTagNameWithMultipleAttributeNameValue()
	{
		oBrowser.findElement(By.xpath("//input[@class='sub  mit1btn1'][@value='Submit']")).click();
	}
	private static void relativeXPathUsingTagNameWithMultipleAttributeNameValueUsingAndOperator()
	{
		oBrowser.findElement(By.xpath("//input[@class='submit1btn1' and @value='Submit']")).click();
	}
	private static void relativeXPathUsingTagNameWithMultipleAttributeNameValueUsingOROperator()
	{
		oBrowser.findElement(By.xpath("//input[@class='submit1btn1' or @value='Submit']")).click();
	}
	private static void relativeXPathUsingPartialMatchingOfAttributeValue()
	{
		//oBrowser.findElement(By.xpath("//input[starts-with(@id,'btn1')]")).click();
		oBrowser.findElement(By.xpath("//input[contains(@id,'btn1')]")).click();
	}
	private static void relativeXPathUsingTagNameWithAttributeName()
	{
		// # of links in the webElements
		List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
		System.out.println("# of links :"+oLinks.size());
	}
	private static void relativeXPathUsingTagNameWithAttributeName_1()
	{
		//Total links in the Web elements
		List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<oLinks.size();i++)
		{
			String AllLinks=oLinks.get(i).getText();
			System.out.println(AllLinks);
		}
		
	}
	private static void relativeXPathUsingTagNameWithAttributeName_2()
	{
		try
		{
			List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
			for(int i=0;i<oLinks.size();i++)
			{
				String AllLinks=oLinks.get(i).getText();
				if(AllLinks.endsWith("Testing"))
				{
					oLinks.get(i).click();
					break;
				}
			}
			Thread.sleep(2000);
			oBrowser.navigate().back();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void  relativeXPathUsingTextContent()
	{
		oBrowser.findElement(By.xpath("//a[text()='POI Apache']")).click();
	}
	private static void relativeXPathUsingPartialMatchingOfTextContent()
	{
		//oBrowser.findElement(By.xpath("//a[starts-with(text(),'POI')]")).click();
		oBrowser.findElement(By.xpath("//a[contains(text(),'POI')]")).click();
	}

}
