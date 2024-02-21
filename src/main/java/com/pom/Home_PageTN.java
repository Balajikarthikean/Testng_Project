package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Home_PageTN extends BaseClass{
	public Home_PageTN() {
		PageFactory.initElements(driver, this);
	}
	
	//closing the popout
	@FindBy(xpath="//span[@class='logSprite icClose']")
	private WebElement closepopup;
	public WebElement getClosepopup() {
		return closepopup;
	}

	////input[@type='text']
	@FindBy(xpath ="//span[@class='sc-12foipm-17 eBxhjL fswWidgetLabel']//following::p[@class='sc-12foipm-20 bhnHeQ']//preceding::span[text()='From']")
	private WebElement from;
	public WebElement getFrom() {
		return from;
	}
	
	@FindBy(xpath= "//input[@type='text']")
	private WebElement fromClickValue;
	public WebElement getFromClickValue() {
		return fromClickValue;
	}
	
	@FindBy(xpath="//p[text()='Madurai Airport']")
	private WebElement selectmadurai;
	public WebElement getSelectmadurai() {
		return selectmadurai;
	}
	
    //(//div[@class='sc-12foipm-16 wRKJm fswFld '])[2]
//	@FindBy(xpath = "//span[@class='sc-12foipm-17 eBxhjL fswWidgetLabel']//following::p[@class='sc-12foipm-20 bhnHeQ']//preceding::span[text()='To']")
//	private WebElement destination;
//	public WebElement getDestination() {
//		return destination;
//	}
	
	@FindBy(xpath="//span[@class='sc-12foipm-39 hRfNRh']//following::input[@type='text']")
	private WebElement ClickValueTo;
	public WebElement getDestinationClickValue() {
		return ClickValueTo;
	}
	
	@FindBy(xpath="//p[text()='Chennai International Airport']")
	private WebElement selectchennai;
	public WebElement getSelectchennai() {
		return selectchennai;
	}

	@FindBy(xpath="(//p[text()='28']//parent::div[@class='DayPicker-Day'])[1]")
	private WebElement dateSelect;
	public WebElement getDateSelected() {
		return dateSelect;
	}
	
	@FindBy(xpath="//span[text()='Done']")
	private WebElement dateconfirmed;
	public WebElement getDateconfirmed() {
		return dateconfirmed;
	}

	@FindBy(xpath = "(//span[@class='sc-12foipm-64 dGRyPm'])[4]")
	private WebElement adultcount;
	public WebElement getAdultcount() {
		return adultcount;
	}
	
	@FindBy(xpath= "//a[text()='Done']")
    private WebElement adulttotal;	
	public WebElement getAdulttotal() {
		return adulttotal;
	}
	
	
	
	
	
	
	
	
	

	
	@FindBy(xpath="//span[@class='sc-12foipm-85 fUaVPB']")
	private WebElement clickSearchFlight;
	public WebElement getClickSearchFlight() {
		return clickSearchFlight;
	}
	

}
