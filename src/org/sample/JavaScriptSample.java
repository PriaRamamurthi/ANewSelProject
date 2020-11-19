package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptSample extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	
		WebElement loc=driver.findElement(By.xpath("//span[text()='Greens technology Perumbakkam']"));
		textGet(loc);
		scrollDown(loc, driver);
		
		WebElement des=driver.findElement(By.xpath("//h1[contains(text(),'No 1 Software Training')]"));
		scrollUp(des,driver);
		//scrollDown(loc);
		//js.executeScript("arguments[0].scrollIntoView(true)", loc);
		//System.out.println(loc.getText());
		
		
	}

}
