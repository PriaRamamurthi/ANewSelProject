package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDownSample extends BaseClass{


	public static void main(String[] args)  throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement create=driver.findElement(By.id("u_0_2"));
		create.click();
		Thread.sleep(3000);
		WebElement year=driver.findElement(By.id("year"));
		selectDropDownByIndex(year,2);
		/*Select s= new Select(year);
		//s.selectByIndex(6);
		List<WebElement> li=s.getOptions();
		//for (WebElement mn : li) {
			//System.out.println(mn.getAttribute("value"));
		//}
		//System.out.println("For LOOP DONE...");
		WebElement st=li.get(2);
		st.click();
		System.out.println(st.getAttribute("value"));
		*/
	}
}
