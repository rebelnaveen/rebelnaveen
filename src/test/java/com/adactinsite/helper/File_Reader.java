package com.adactinsite.helper;

public class File_Reader {
	
	private File_Reader(){
		
	}
	
	public static File_Reader getInstance() {
		
		File_Reader helper = new File_Reader();
		
		return helper;
		
	}
	
	
	
	public Configuration_Read getInstanceCR() throws Throwable {
		
		Configuration_Read reader = new Configuration_Read();
		
		return reader;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
