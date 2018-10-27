package com.selenium.pages;


import com.selenium.base.BaseCommands;

import com.selenium.maps.RealtorHomeMap;

// Class to handle events on the homepage
public class HomeSearchPage {

	RealtorHomeMap rhm=new RealtorHomeMap();
	BaseCommands bc=new BaseCommands();

	//Function to enter Text in the search Box to search Property Listing
	public void enterSearchText(String searchText){
		
		bc.enterText(searchText, rhm.searchField());
	}
	
	//Function to Click the search button
	public void clickSearchButton(){
		
		bc.click(rhm.searchButton());
	}
	
}
