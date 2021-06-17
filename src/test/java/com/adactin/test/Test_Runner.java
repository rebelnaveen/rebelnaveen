package com.adactin.test;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactinbaseclass.BaseClassSelinium;
import com.adactinsite.helper.File_Reader;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//featured",
glue = "com.adactin.stepdefi") 


public class Test_Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_Up() throws Throwable  {
		
		
		String browser = File_Reader.getInstance().getInstanceCR().get_Browser();
		
		driver = BaseClassSelinium.browserlaunch(browser);
		
	}
	
	
	@AfterClass
	public static void tear_Down() {
		
		
		
	}
	

	
	

}
