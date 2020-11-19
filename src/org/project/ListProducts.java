package org.project;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class ListProducts extends BaseClass{
	public static void main(String[] args) {
		
	WebDriver d=launchBrowser();
	launchUrl("https://www.amazon.in/");
	WebElement enterText=d.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	fill(enterText,"Dell Laptop");
	WebElement search=d.findElement(By.xpath("(//input[@type='submit'])[1]"));
	bttnClick(search);
   List<WebElement> listOfItems=d.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
   Set<WebElement> setOfItems=new HashSet<WebElement>(listOfItems);
   for (WebElement product : setOfItems) {
	System.out.println(product.getText());
}
 	
}
}
