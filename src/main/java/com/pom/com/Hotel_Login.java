package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Login {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "(//input[@class='login_input'])[1]")
	private WebElement email;
	
	@FindBy(xpath = "(//input[@class='login_input'])[2]")
	private WebElement pass;
	
	@FindBy(xpath = "//input[@class='login_button']")
	private WebElement login;
	
	public Hotel_Login(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}


}
