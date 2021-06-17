package com.adactinsite.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.com.Book_A_Hotel;
import com.pom.com.Booking_Configuration;
import com.pom.com.Hotel_Login;
import com.pom.com.My_Itenerary;
import com.pom.com.Search_Hotel;
import com.pom.com.Select_Hotel;

public class Page_Object_Manager {
	
	
	public static WebDriver driver;
	
	private Hotel_Login login;
	
	private Search_Hotel search;
	
	private Select_Hotel select;
	
	private Book_A_Hotel bookhotel;
	
	private Booking_Configuration bookconfirm;
	
	private My_Itenerary iternity;
	
	
	public Page_Object_Manager(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	
	}
	public Hotel_Login get_Instance_Login() {
		
		login = new Hotel_Login(driver);
		
		return login;
		
	}
	
	 public Search_Hotel get_instance_search() {
		 
		 search = new Search_Hotel(driver);
		 
		 return search;
		 
	}
	
	public Select_Hotel get_instance_select() {
		
		select = new Select_Hotel(driver);
		
		return select;
		
		
	}
	
	public Book_A_Hotel get_instance_bookhotel() {
		
		bookhotel = new Book_A_Hotel(driver);
		
		return bookhotel;
		
	}
	
	public Booking_Configuration get_instance_bookconfirm() {
		
		bookconfirm = new Booking_Configuration(driver);
		
		return bookconfirm;
		
	}
	
	public My_Itenerary get_instance_iternity() {
		
		iternity = new My_Itenerary(driver);
		
		return iternity;	
		
	}
	
	
	
	
	
	
	
	
	
	


}
