package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginPageCAPS {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
	    WebElement firstName=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	    Actions act=new Actions(driver);
	    //act.click(firstName).keyDown(Keys.SHIFT).sendKeys("Priya").keyUp(Keys.SHIFT).perform();
	    
	   act.keyDown(firstName,Keys.SHIFT).sendKeys("priya").keyUp(Keys.SHIFT).perform();
	   
	    
	    
	    
	    
	    
	    
	    //firstName.sendKeys("Priya");
	   /* WebElement lastName=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	    lastName.sendKeys("Shiva");
	   WebElement address=driver.findElement(By.xpath("//textarea[@rows='3']"));
	   address.sendKeys("No.100,workers estate, chennai");  
	   WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
	   email.sendKeys("Priya@gmail.com");
	   WebElement phone=driver.findElement(By.xpath("//input[@type='tel']"));
	   phone.sendKeys("Priya@gmail.com");
	   WebElement radioBtn=driver.findElement(By.xpath("//input[@value='FeMale']"));
	   radioBtn.click();
	   WebElement chkBox1=driver.findElement(By.id("checkbox1"));
	   chkBox1.click();
	   WebElement chkBox2=driver.findElement(By.id("checkbox2"));
	   chkBox2.click();*/
	   
	   
	    //loginBtn.click();
	}

}//xpath
