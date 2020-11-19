package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandleSample {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/ ");
		driver.manage().window().maximize();
		WebElement popup=driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		popup.click();
		WebElement search=driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		search.sendKeys("mask");
		WebElement searchButtn=driver.findElement(By.xpath("//button[@class='vh79eN']"));
		searchButtn.click();
		Thread.sleep(2000);
		
		WebElement product=driver.findElement(By.xpath("(//img[@alt='Wildcraft HypaShield Supermask reusable outdoor protection mask 12535'])[1]"));
		product.click();
		
		String parentWindow=driver.getWindowHandle();
		Set<String> allWindows=driver.getWindowHandles();
		List<String> l= new ArrayList<String>();
		l.addAll(allWindows);
		String window=l.get(1);
		driver.switchTo().window(window);
		Thread.sleep(2000);
		
		WebElement pincode=driver.findElement(By.xpath("//input[@class='_3X4tVa']"));
	pincode.click();
		pincode.sendKeys("600115");
		driver.findElement(By.xpath("//span[text()='Check']")).click();
		
		
		
		
		
	}

}
