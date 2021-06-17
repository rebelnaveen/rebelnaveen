package com.adactin.stepdefi;

import org.openqa.selenium.WebDriver;

import com.adactin.test.Test_Runner;
import com.adactinbaseclass.BaseClassSelinium;
import com.adactinsite.helper.File_Reader;
import com.adactinsite.helper.Page_Object_Manager;
import com.pom.com.Book_A_Hotel;
import com.pom.com.Booking_Configuration;
import com.pom.com.Hotel_Login;
import com.pom.com.My_Itenerary;
import com.pom.com.Search_Hotel;
import com.pom.com.Select_Hotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Step_Definition extends BaseClassSelinium {
	
	public static WebDriver driver = Test_Runner.driver;
	
//	Hotel_Login login = new Hotel_Login(driver);
//	Search_Hotel searchhotel = new Search_Hotel(driver);
//	Select_Hotel selecthotel = new Select_Hotel(driver);
//	Book_A_Hotel bookhotel = new Book_A_Hotel(driver);
//	Booking_Configuration bookconfirm = new Booking_Configuration(driver);
//	My_Itenerary myitenerary = new My_Itenerary(driver);
	
	Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		
		String url = File_Reader.getInstance().getInstanceCR().get_Url();
	
		
		geturl(url);
	}
	
	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String username) throws Throwable {

		sendValues(pom.get_Instance_Login().getEmail(),username);
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String password) throws Throwable {

		sendValues(pom.get_Instance_Login().getPass(), password);

	}


	
	
	@Then("^user Click On The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
	
		clickOnElement(pom.get_Instance_Login().getLogin());
	}

	@When("^user Select The Location In Location Field$")
	public void user_Select_The_Location_In_Location_Field() throws Throwable {
		
		singleDropDown(pom.get_instance_search().getLocation(), "Los Angeles");
	}

	@When("^user Select The Hotel In Hotel Field$")
	public void user_Select_The_Hotel_In_Hotel_Field() throws Throwable {
		singleDropDown(pom.get_instance_search().getHotels(), "Hotel Sunshine");
	}

	@When("^user Select The Room Type In Room Type Field$")
	public void user_Select_The_Room_Type_In_Room_Type_Field() throws Throwable {
		singleDropDown(pom.get_instance_search().getRoomtype(), "Super Deluxe");
	}

	@When("^user Select The No Of Rooms In Number Of Rooms Field$")
	public void user_Select_The_No_Of_Rooms_In_Number_Of_Rooms_Field() throws Throwable {
		singleDropDown(pom.get_instance_search().getNumberofroom(), "2");
	}

	@When("^user Select The Check In Date In Check In Field$")
	public void user_Select_The_Check_In_Date_In_Check_In_Field() throws Throwable {
		
	}

	@When("^user Select The Check Out Date In Check Out Field$")
	public void user_Select_The_Check_Out_Date_In_Check_Out_Field() throws Throwable {
		
	}

	@When("^user Select The Adults Per Room In Adults Room Field$")
	public void user_Select_The_Adults_Per_Room_In_Adults_Room_Field() throws Throwable {
		singleDropDown(pom.get_instance_search().getAdultsperroom(), "1");
	}

	@When("^user Select The Child Per Room In Child Room Field$")
	public void user_Select_The_Child_Per_Room_In_Child_Room_Field() throws Throwable {
		singleDropDown(pom.get_instance_search().getChildperroom(), "2");
	}

	@Then("^user Click On The Submit Button And It Navigates To The Select Hotel Page$")
	public void user_Click_On_The_Submit_Button_And_It_Navigates_To_The_Select_Hotel_Page() throws Throwable {
		clickOnElement(pom.get_instance_search().getSubmit());
	}

	@When("^user Click The Radio Button$")
	public void user_Click_The_Radio_Button() throws Throwable {
		clickOnElement(pom.get_instance_select().getRadiobtn());
	}

	@Then("^user Click The Continue Button And It Navigate To The Book A Hotel Page$")
	public void user_Click_The_Continue_Button_And_It_Navigate_To_The_Book_A_Hotel_Page() throws Throwable {
		clickOnElement(pom.get_instance_select().getContinuebtn());
	}

	@When("^user Enter The First Name In First Name Field$")
	public void user_Enter_The_First_Name_In_First_Name_Field() throws Throwable {
		sendValues(pom.get_instance_bookhotel().getFirstName(), "NAVEEN KUMAR");
	}

	@When("^user Enter The Last Name Inn Last Name Field$")
	public void user_Enter_The_Last_Name_Inn_Last_Name_Field() throws Throwable {
		sendValues(pom.get_instance_bookhotel().getLastName(), "D");
	}

	@When("^user Enter The Address In The Address Field$")
	public void user_Enter_The_Address_In_The_Address_Field() throws Throwable {
		sendValues(pom.get_instance_bookhotel().getAddress(), "no:23,tnagar,chennai");
	}

	@When("^user Enter The Ccno In Cridit Card No Field$")
	public void user_Enter_The_Ccno_In_Cridit_Card_No_Field() throws Throwable {
		sendValues(pom.get_instance_bookhotel().getCcNo(),File_Reader.getInstance().getInstanceCR().get_ccno() );
	}

	@When("^user Select The Cc Type In Cridit Card Type Field$")
	public void user_Select_The_Cc_Type_In_Cridit_Card_Type_Field() throws Throwable {
		singleDropDown(pom.get_instance_bookhotel().getCcType(), "MAST");
	}

	@When("^user Select The Cridit Card Expiry Month In Select Month Field$")
	public void user_Select_The_Cridit_Card_Expiry_Month_In_Select_Month_Field() throws Throwable {
		singleDropDown(pom.get_instance_bookhotel().getCcExpMonth(), "10");
	}

	@When("^user Select The Cridit Card Expiry Year In Select Year Field$")
	public void user_Select_The_Cridit_Card_Expiry_Year_In_Select_Year_Field() throws Throwable {
		singleDropDown(pom.get_instance_bookhotel().getCcExpYear(), "2022");
	}

	@When("^user Enter The Cridit Card Cvv number In Cvv Number Field$")
	public void user_Enter_The_Cridit_Card_Cvv_number_In_Cvv_Number_Field() throws Throwable {
		sendValues(pom.get_instance_bookhotel().getCvvNumber(), File_Reader.getInstance().getInstanceCR().get_cvvno());
	}

	@Then("^user Click The Book Now Button And It Navigates To The Book Confirmation Page$")
	public void user_Click_The_Book_Now_Button_And_It_Navigates_To_The_Book_Confirmation_Page() throws Throwable {
		clickOnElement(pom.get_instance_bookhotel().getBookNow());
	}

	@When("^user Click The My Itinenary Button$")
	public void user_Click_The_My_Itinenary_Button() throws Throwable {
		
		Thread.sleep(2000);
		clickOnElement(pom.get_instance_bookconfirm().getLitinerary());
	}

	@Then("^It Navigates To Booked Itinenary Page$")
	public void it_Navigates_To_Booked_Itinenary_Page() throws Throwable {
		
	}

	@When("^user Click The Logout Button$")
	public void user_Click_The_Logout_Button() throws Throwable {
		clickOnElement(pom.get_instance_iternity().getLogout());
	}

	@Then("^It Navigates To Login Again Page$")
	public void it_Navigates_To_Login_Again_Page() throws Throwable {
		
	}

	
		
}
