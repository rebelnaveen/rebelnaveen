package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Itenerary {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//input[@name='logout']")
	private WebElement logout;

	public My_Itenerary(WebDriver driver7) {
		
		this.driver = driver7;
		PageFactory.initElements(driver, this);
		
		
	}

	public WebElement getLogout() {
		return logout;
	}
	
	
	
	
	
	
	
	
	
	
	
}
