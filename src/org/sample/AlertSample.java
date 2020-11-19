package org.sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class AlertSample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
	
		driver.switchTo().frame("login_page");
		//Thread.sleep(2000);
		//WebElement userId=driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		//userId.sendKeys("Priya");
		WebElement enter=driver.findElement(By.xpath("(//img[@alt='continue'])[1]"));
		enter.click();
	 Alert a=  driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
		
		
		/*WebElement login=driver.findElement(By.xpath("(//input[@title='Log In'])[1]"));
		login.click();
	//	driver.switchTo().frame("footer");
		Thread.sleep(3000);
		WebElement pass=driver.findElement(By.xpath("(//input[@class='input_password'])[2]"));
		pass.sendKeys("1234");*/
	}
}
