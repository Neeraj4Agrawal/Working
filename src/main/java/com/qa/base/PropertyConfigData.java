package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyConfigData {
	public static Properties prop;

	public PropertyConfigData() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"C:\\Bridesides\\FreeCRMCucumberFramework\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	
	
	public String getReportConfigPath(){
	 String reportConfigPath = prop.getProperty("reportConfigPath");
	 if(reportConfigPath!= null) return reportConfigPath;
	 else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath"); 
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
