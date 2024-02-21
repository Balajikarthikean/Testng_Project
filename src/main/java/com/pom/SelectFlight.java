package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SelectFlight extends BaseClass {
	public SelectFlight() {
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(xpath="(//span[text()='Cheapest']//following::button[@class='srp-card-uistyles__BookButton-sc-3flq99-21 gtPjNk dF justifyCenter alignItemsCenter f600'])[1]")
	private WebElement gotoviewFare;
	public WebElement getGotoviewFare() {
		return gotoviewFare;
	}
	
	@FindBy(xpath="(//button[@class='srp-card-uistyles__BookButton-sc-3flq99-21 gtPjNk dF justifyCenter alignItemsCenter f600'])[1]")
	private WebElement ViewFare;
	public WebElement getViewFare() {
		return ViewFare;
	}
	
	@FindBy(xpath="(//input[@class='srp-card-uistyles__Fltbook-sc-3flq99-35 hqAmOx f600 widthF105'])[1]")
	private WebElement bookTicket;
	public WebElement getBookTicket() {
		return bookTicket;
	}
	
	//new window
	
	//click no thanks  //p[text()='By adding assurance I confirm all passengers are between ']//preceding::button[@class='dweb-commonstyles__Button-sc-13fxsy5-14 TPeIR marginR10']
	@FindBy(xpath="//button[@class='dweb-commonstyles__Button-sc-13fxsy5-14 TPeIR marginR10']")
	private WebElement Clicknothanks;
	public WebElement getClicknothanks() {
		return Clicknothanks;
	}
	//  (//div[@class='sc-bbSZdi kHYRqU'])[1]
	@FindBy(xpath="//div[@class='sc-cVzyXs hGsVXY']")
	private WebElement scrolltoUpdateDetails;
	public WebElement getScrolltoUpdateDetails() {
		return scrolltoUpdateDetails;
	}
	//div[@class='sc-jaXxmE iWHXLm']//child::input[@id='Billing Address']
	//move Enter bill address   id="Billing Address"    (//div[@class='sc-bbSZdi kHYRqU'])[1]
	@FindBy(xpath="//input[@id='Billing Address']")
	private WebElement enterbilladdress;
	public WebElement getEnterbilladdress() {
		return enterbilladdress;
	}
	//Enter bill address  "avadi"
	@FindBy(xpath="//input[@class='sc-eBHhsj fYsyIB']")
	private WebElement enterdataBillAddress;
	public WebElement getEnterdataBillAddress() {
		return enterdataBillAddress;
	}



	//click enterpincode 
	@FindBy(xpath="//label[text()='Enter Pincode']")
	private WebElement enterpincode;
	public WebElement getEnterpincode() {
		return enterpincode;
	}
	//click and send data in pincode  //label[contains(@class, 'sc-fBWQRz eXHInN') and text()='Enter Pincode']
	@FindBy(xpath="//label[@for='Pincode']")
	private WebElement enterDataPincode;
	public WebElement getEnterDataPincode() {
		return enterDataPincode;
	}



	//optional tamilnadu
	@FindBy(xpath="//div[@class='sc-hCPjZK cxqTGF']")
	private WebElement state;
	public WebElement getState() {
		return state;
	}
	
	//select checkbox
	@FindBy(xpath="//label[text()='Confirm and save billing details to your profile']")
	private WebElement tickCheckbox;
	public WebElement getTickCheckbox() {
		return tickCheckbox;
	}

	//male gender
	@FindBy(xpath="//select[@class='common-elementsstyles__CustSelectTrvl-sc-ilw4bs-9 lpjPee']")
	private WebElement genderselect;
	public WebElement getGenderselect() {
		return genderselect;
	}
	
	//give firstname sendkey
	@FindBy(name ="givenname")
	private WebElement firstname;
	public WebElement getFirstname() {
		return firstname;
	}
	
	//lastname sendkey
	@FindBy(name="lastname")
	private WebElement lastname;
	public WebElement getLastname() {
		return lastname;
	}
	
	//Enter email Sendkey  //input[@name='email']
	@FindBy(xpath= "//input[@class='common-elementsstyles__IpTxt-sc-ilw4bs-11 dEvRMR width100']")
	private WebElement Enteremail;
	public WebElement getEnteremail() {
		return Enteremail;
	}
	
	//enter mobile number sendkey
	@FindBy(name="mobile")
	private WebElement mobilenumber;
	public WebElement getMobilenumber() {
		return mobilenumber;
	}
	
	//click proceed
	@FindBy(xpath="//button[@class='dweb-commonstyles__FltBtn-sc-13fxsy5-12 bWfuav f500 wid25 font16']")
	private WebElement clickproceed;
	public WebElement getClickproceed() {
		return clickproceed;
	}
	
	//click thatsright
	@FindBy(xpath="//button[@class='dweb-commonstyles__ButtonBase-sc-13fxsy5-4 reviewTravellerOverlaystyles__RtdCorrBtn-sc-w2a3p-7 eTrRGk iYGKjl']")
	private WebElement clickthatsright;
	public WebElement getClickthatsright() {
		return clickthatsright;
	}
	
	//select the seat (//div[@class='tip tip_btm blackTip tipSeat'])[2]   //span[text()='4C']
	@FindBy(xpath="(//p[@class='frontPlane font14']//following::span[@class='seatText  black'])[1]")
	private WebElement selectseats;
	public WebElement getSelectseats() {
		return selectseats;
	}
	
	// click proceed payment
	@FindBy(xpath="//button[text()='Proceed To Payment']")
	private WebElement clickPaymenttoproceed;
	public WebElement getClickPaymenttoproceed() {
		return clickPaymenttoproceed;
	}

}
