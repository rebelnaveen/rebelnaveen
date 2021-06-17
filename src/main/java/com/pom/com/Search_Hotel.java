package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {


	public static WebDriver driver;
	
	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;
	
	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement hotels;
	
	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement roomtype;
	
	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement numberofroom;
	
	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement checkindate;
	
	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement checkoutdate;
	
	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement adultsperroom;
	
	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement childperroom;
	
	@FindBy(xpath = "//input[@name='Submit']")
	private WebElement submit;

	
	public Search_Hotel(WebDriver driver3) {
		this.driver = driver3;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNumberofroom() {
		return numberofroom;
	}

	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	public WebElement getAdultsperroom() {
		return adultsperroom;
	}

	public WebElement getChildperroom() {
		return childperroom;
	}

	public WebElement getSubmit() {
		return submit;
	}

	
		
	
}
