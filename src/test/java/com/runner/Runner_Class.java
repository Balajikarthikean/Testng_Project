package com.runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.poma.PageObjectManager;
import com.utility.FileReaderManager;

public class Runner_Class extends BaseClass {
	
	PageObjectManager pom = new PageObjectManager();
	
	
	@Test(priority = 1)
	public void asetup() throws InterruptedException {
		browserLaunch("edge");
//		String browser = FileReaderManager.getInstanConfiguration().getInstanFileReaderManager().getProperty();
//		browserLaunch(browser);
		launchUrl("https://www.goibibo.com/");
		//driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		clickButton(pom.getHP().getClosepopup());
		
	}
	@Test(priority=2)
	public void updateDetails() throws InterruptedException   {
		clickButton(pom.getHP().getFrom());
		
		passInput(pom.getHP().getFromClickValue(), "madurai");
		
		clickButton(pom.getHP().getSelectmadurai());
		
		passInput(pom.getHP().getDestinationClickValue(), "chennai");
		
		clickButton(pom.getHP().getSelectchennai());
		
		clickButton(pom.getHP().getDateSelected());
		
		clickButton(pom.getHP().getDateconfirmed());
		
		//clickButton(pom.getHP().getAdultcount());
		
		clickButton(pom.getHP().getAdulttotal());
		
		clickButton(pom.getHP().getClickSearchFlight());

	}
	@Test(priority=3)
	public void selectflight() throws InterruptedException {
		setImplicitWait(15, TimeUnit.SECONDS);

		scrollViewContent(pom.getSF().getGotoviewFare());

		actionmoveElement(pom.getSF().getViewFare());
		javaScript("up");
		Thread.sleep(5000);
		clickElement(pom.getSF().getViewFare());
		clickButton(pom.getSF().getBookTicket());
	}
	@Test(priority=4)
		public void pageDetails() throws InterruptedException {
		windowhandles();
		MutliplewindowsHandling("Book Cheap Flights");
		actionmoveElement(pom.getSF().getClicknothanks());
		clickButton(pom.getSF().getClicknothanks());
		actionmoveElement(pom.getSF().getScrolltoUpdateDetails());
		javaScriptElementInteract(pom.getSF().getEnterdataBillAddress());
		passInput(pom.getSF().getEnterbilladdress(), "Avadi");
		Thread.sleep(5000);
		jsClick(pom.getSF().getEnterpincode());
		Thread.sleep(5000);
		javaScriptElementInteract(pom.getSF().getEnterDataPincode());
    	Thread.sleep(10000);
    	passInput(pom.getSF().getEnterDataPincode(), "600001");
		//passInput(pom.getSF().getEnterDataPincode(), "600000");
		clickButton(pom.getSF().getTickCheckbox());
		Thread.sleep(20000);
		actionmoveElement(pom.getSF().getClickproceed());
		
		clickButton(pom.getSF().getGenderselect());
		Thread.sleep(30000);
		selectbyIndex(pom.getSF().getGenderselect(), 1);
		Thread.sleep(10000);
		clickButton(pom.getSF().getFirstname());
		Thread.sleep(5000);
		passInput(pom.getSF().getFirstname(), "KR");
		clickButton(pom.getSF().getLastname());
		Thread.sleep(5000);
		passInput(pom.getSF().getLastname(), "BK");
		clickButton(pom.getSF().getEnteremail());
		Thread.sleep(3000);
		passInput(pom.getSF().getEnteremail(),"qwert@gmail.com");
		clickButton(pom.getSF().getMobilenumber());
		Thread.sleep(3000);
		passInput(pom.getSF().getMobilenumber(), "9876543210");
		clickButton(pom.getSF().getClickproceed());
		clickButton(pom.getSF().getClickthatsright());
//		
		clickButton(pom.getSF().getSelectseats());
		clickButton(pom.getSF().getClickPaymenttoproceed());
	}
}
