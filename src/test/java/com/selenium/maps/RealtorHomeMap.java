package com.selenium.maps;

import org.openqa.selenium.By;


//Class that returns xpath of elements required to execute test cases on homepage
public class RealtorHomeMap {

	//Return Xpath of the 1st search field on homepage
	public By searchField(){
		return By.xpath("//input[@id='searchBox']");
	}
	
	
	//Return xpath of the SearchButton
	public By searchButton(){
		return By.xpath("//div[@class='container home-header-content']/div/div/div[2]/span/button[2]");
	}
	
	
}
