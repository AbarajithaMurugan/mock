package org.dimension;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebtable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		List<WebElement> list = driver.findElements(By.tagName("tr"));
		
		for (int i = 0; i < list.size(); i++) {
			WebElement webElement = list.get(i);
			List<WebElement>	li=webElement.findElements(By.tagName("td"));
			for (int i1 = 0; i1 < li.size(); i++) {
		
		WebElement element = li.get(i1);
			String text = element.getText();
			System.out.println(text);
		if (text.equalsIgnoreCase("Island Trading")) {
			
			
		
String s=li.get(1).getText();
System.out.println(s);
				
			}
		
		}
		}
	
}
}
		
	


