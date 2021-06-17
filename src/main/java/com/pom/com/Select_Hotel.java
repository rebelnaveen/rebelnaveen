package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private WebElement radiobtn;

	@FindBy(xpath = "//input[@name='continue']")
	private WebElement continuebtn;
	
	
	public Select_Hotel(WebDriver driver4) {
	
		this.driver = driver4;
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}

	
	
	
	
	
	
	
	
	
	
	

}
