package org.sample;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SampleSel {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		WebElement table=driver.findElement(By.xpath("//table[@id='customers']"));	
		
		List<WebElement>allRow=table.findElements(By.tagName("tr"));
		System.out.println("RowSize:"+allRow.size());
		for (int i = 1; i <allRow.size(); i++) {
		WebElement oneRow=allRow.get(i);
		System.out.println("ROW:"+i);
			List<WebElement>allColumnData=oneRow.findElements(By.tagName("td"));
				
			//for (int j = 0; j < allColumnData.size(); j++) {
				
			
			
				WebElement oneData=allColumnData.get(allColumnData.size()-1);
				
			System.out.println(oneData.getText());
			
			//}
			
			
				
		}
		
		
		/*for (WebElement oneRow : allRow) {
			List<WebElement>allColumnData=oneRow.findElements(By.tagName("td"));
			for (WebElement oneColumnData : allColumnData) {
				System.out.println(oneColumnData.getText());
			}
			
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Actions act=new Actions(driver);
		act.moveToElement(dept);
		WebElement paint=driver.findElement(By.xpath("(//a[text()='Paint'])[1]"));
		act.moveToElement(paint).perform();
		System.out.println("paint select");
	
	
		WebElement intPaint=driver.findElement(By.xpath("//a[@title='Interior Paint']"));
		act.moveToElement(intPaint).perform();
		WebElement ceiling=driver.findElement(By.xpath("(//a[text()='Ceiling Paint'])[1]"));
		ceiling.click();
	*/	
		
		
		
		
	}
	
	
	}
	