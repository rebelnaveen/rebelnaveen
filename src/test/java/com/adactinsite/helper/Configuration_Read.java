package com.adactinsite.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;


public class Configuration_Read {
	
	public static Properties p;
	

	public Configuration_Read() throws Throwable {

		File f = new File(
				"C:\\Users\\shiva\\eclipse-workspace\\Adactin_Pro\\src\\test\\java\\com\\adact\\helper\\Configuration.properties");

		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(fis);
		

	}
	
	
	public String get_Browser() {
		
		String brows = p.getProperty("browser");
		
		return brows;
	}
	
	
	public String get_Url() {
		
		String url = p.getProperty("url");
		return url;
		
	}
	
	public String get_ccno() {
		
		String ccno = p.getProperty("ccno");
		return ccno;
	}
	
	public String get_cvvno() {
		
		String cvvno = p.getProperty("cvvno");
		return cvvno;
		
		
	}
	
	public String get_user() {
		
		String user = p.getProperty("user");
		return user;
		
		
	}
	
	public String get_pass() {
		
		String pass = p.getProperty("pass");
		return pass;
		
		
	}
	
	
	
	
	
	
	
	

}
