package com.selenium.maps;

import org.openqa.selenium.By;


//Class that defines xpath of the elements required to perform test cases
public class SearchResultsMap {
	

	
	//Returns xpath of the area displaying the total available listings
	public By numberHomes() {
		// TODO Auto-generated method stub
		return By.xpath("//span[@id='search-result-count']");
	}
	
	
	//Returns xpath of the Listing whose price is to be validated
	public By listing(int countId){
		return By.xpath("//div[@id='srp-list']/ul/li["+countId+"]");
	}
	
	//Returns xpath of the price displayed on the Listing
	public By checkPrice(String countId){
		return By.xpath("//li[@data-propertyid='"+countId+"']/div[3]/div[2]/div[1]/div[2]/span");
	}
	
	//Returns xpath of the price displayed on the property on the property details page
	public By listingPrice(){
		return By.xpath("//div[@itemid='#offer']/span");
	}
}
