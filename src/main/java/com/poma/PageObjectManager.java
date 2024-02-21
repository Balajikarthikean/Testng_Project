package com.poma;

import com.base.BaseClass;
import com.pom.Home_PageTN;
import com.pom.SelectFlight;

public class PageObjectManager extends BaseClass {
	private Home_PageTN hp;
	private SelectFlight sf;
	
	public Home_PageTN getHP(){
		return hp= new Home_PageTN();
		
	}
	
	public SelectFlight getSF() {
		return sf = new SelectFlight();
	}

}
