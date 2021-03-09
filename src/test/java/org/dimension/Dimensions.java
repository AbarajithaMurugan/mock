package org.dimension;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dimensions {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Navin Vishal M\\Downloads\\Abara's\\eclipse\\configuration\\MockQuestions\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
//		Dimension d=new Dimension(width, height);
//		//Point p=new Point(9, 9);
//		Dimension d=driver.manage().window().getSize();
//		System.out.println(d);
//		System.out.println(d.getHeight());
//		System.out.println(d.getWidth());
//		
//		Point pt=driver.manage().window().getPosition();
//		System.out.println(pt);
//		System.out.println(pt.getX());
//		System.out.println(pt.getY());
	pojo p=new pojo();
	
	
	List<WebElement> user = p.getUser();
	List<WebElement> pwd = p.getPwd();
	
	System.out.println(user.size());
	System.out.println(pwd.size());
	
	}

}
