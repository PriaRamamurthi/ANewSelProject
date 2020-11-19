package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.sun.glass.events.KeyEvent;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static JavascriptExecutor js;
	
	
	//LAUNCH BROWSER
	
	public static void launchBrowser()
	{
		driver=new ChromeDriver();
	}
	
	//LAUNCH URL
	public static void launchUrl(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	//TITLE OF PAGE
	public static void pageTitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	//SENDKEYS
	public static void fill(WebElement ele,String value)
	{
		ele.sendKeys(value);
	}
		//CLICK WEBELEMENT
	public static void bttnClick(WebElement ele)
	{
		ele.click();
	}
	
	//RIGHT CLICK
	public static void rightClick(WebElement ele)
	{
		a= new Actions(driver);
		 		 a.contextClick(ele).perform();
	}
		//DOUBLE CLICK
	public static void clickDouble(WebElement ele)
	{ a = new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	// GET TEXT
		public static void textGet(WebElement ele)
		{
			String text=ele.getText();
			System.out.println(text);
		}
	//DELETE TEXT
	public static void deleteText(WebElement ele) throws AWTException
	{
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_DELETE);
		
	}
	// ACCEPT ALERT
	public static void acceptAlert()
	{
		Alert a=  driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
	
	}
		
	//SWITCH TO CHILD WINDOW	
	public static void switchToChildWindow(int index)
	{
		String mainWindow=driver.getWindowHandle();
		Set<String> allWindows=driver.getWindowHandles();
		List<String> allWindowsList= new ArrayList<String>();
		allWindowsList.addAll(allWindows);
		String secondWindow=allWindowsList.get(index);
		driver.switchTo().window(secondWindow);
				
	}
	
	//DROP DOWN
	public static void selectDropDownByIndex(WebElement ele,int index)
	{
		Select s= new Select(ele);
		List<WebElement> li=s.getOptions();
		
		WebElement st=li.get(index);
		st.click();
		System.out.println(st.getAttribute("value"));
		
	}
	//SCROLL DOWN 
	public static void scrollDown(WebElement ele,WebDriver driver)
	{    
		 JavascriptExecutor js= (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView(true)", ele);
		 System.out.println(ele.getText());
		 
     }
	// SCROLL UP
	public static void scrollUp(WebElement ele, WebDriver driver)
	{
		JavascriptExecutor js= (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView(false)", ele);
		 System.out.println(ele.getText());
	}
	
	
	
}
