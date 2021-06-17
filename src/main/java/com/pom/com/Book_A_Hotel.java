package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_A_Hotel {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lastName;
	
	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement address;
	
	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement ccNo;
	
	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement ccType;
	
	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement ccExpMonth;
	
	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement ccExpYear;
	
	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement cvvNumber;
	
	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement bookNow;
	
	public Book_A_Hotel(WebDriver driver8) {
		
		this.driver = driver8;
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcNo() {
		return ccNo;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getCcExpMonth() {
		return ccExpMonth;
	}

	public WebElement getCcExpYear() {
		return ccExpYear;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	public WebElement getBookNow() {
		return bookNow;
	}
	
	
	

}
