package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.base.BaseClass;

public class Configuration extends BaseClass {
	static Properties p;
	
	public Configuration() {
		
	}

	public static  Properties getPropertyFile() throws IOException {
		File f = new File(
				"C:\\Users\\hp\\eclipse-workspace\\Testng_Project\\src\\main\\java\\com\\utility\\flight.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
		return p;
	}

	public static String getBrowser() throws IOException {
		
		String browser = getPropertyFile().getProperty("browser");
		return browser;
	}

	public static String getUrl() throws Throwable {
		String url = getPropertyFile().getProperty("url");
		return url;

	}

	public static String getBillingAdress() throws IOException {
		String billingadress = getPropertyFile().getProperty("ebilling_Address");
		return billingadress;

	}

	public static String getPincode() {
		String pincode = p.getProperty("pincode");
		return pincode;

	}

	public static String getFirstName() {
		String firstname = p.getProperty("first_Middle_Name");
		return firstname;

	}

	public static String getLastName() {
		String lastname = p.getProperty("last_Name");
		return lastname;

	}

	public static String getEmail() {
		String email = p.getProperty("email");
		return email;

	}

	public static String getMobileNumber() {
		String mobilenumber = p.getProperty("mobile_Number");
		return mobilenumber;

	}

	

}
