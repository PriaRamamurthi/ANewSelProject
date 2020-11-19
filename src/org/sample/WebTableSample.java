package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableSample extends BaseClass{

	public static void main(String[] args) throws Exception {
		
		launchBrowser();
		launchUrl("https://www.flipkart.com/ ");
		WebElement search=driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		bttnClick(search);
		WebElement text=driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		fill(text,"mask");
		WebElement searchButtn=driver.findElement(By.xpath("//button[@class='vh79eN']"));
		bttnClick(searchButtn);
		Thread.sleep(2000);
		WebElement product=driver.findElement(By.xpath("(//img[@alt='Wildcraft HypaShield Supermask reusable outdoor protection mask 12535'])[1]"));
		bttnClick(product);
		
		switchToChildWindow(1);
		WebElement pincode=driver.findElement(By.xpath("//input[@class='_3X4tVa']"));
		clickDouble(pincode);
		deleteText(pincode);
		fill(pincode,"600115");
		
	}


	
	
	
}
