package org.dimension;

import java.awt.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class pojo extends Dimensions{
	public pojo() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBys({
		
		@FindBy(id="email"),
		@FindBy(xpath="//input[@class='inputtext _55r1 _6luy'][1]")
		
		
	})
	private java.util.List<WebElement> user;
	@FindAll({
		@FindBy(id="pass"),
		@FindBy(xpath="(//input[@class='inputtext _55r1 _6luy'])[2]")
	})
	private java.util.List<WebElement> pwd;
	public java.util.List<WebElement> getUser() {
		return user;
	}
	public java.util.List<WebElement> getPwd() {
		return pwd;
	}

}
