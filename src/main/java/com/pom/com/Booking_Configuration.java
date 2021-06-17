package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Configuration {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "(//input[@class='reg_button'])[3]")
	private WebElement litinerary;

	public Booking_Configuration(WebDriver driver6) {
		
		this.driver = driver6;
		PageFactory.initElements(driver, this);
		
		
	}

	public WebElement getLitinerary() {
		return litinerary;
	}
	
	
	
	
	
	
	
	

}
