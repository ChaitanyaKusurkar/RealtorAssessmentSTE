package com.selenium.pages;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import com.selenium.base.BaseCommands;
import com.selenium.maps.SearchResultsMap;


//Class to handle events that are performed on Property Listings page
public class SearchResultsPage {
	SearchResultsMap srm=new SearchResultsMap();
	BaseCommands bc=new BaseCommands();


	//Function to fetch total number of properties returned after clicking Search button
	public String getNumberOfHomes(){

		String count= bc.getText(srm.numberHomes());
		String[] countArray=count.split(" ");
		assertTrue(Integer.parseInt(countArray[0].replaceAll(",", ""))>0,"The number of homes should be greater than 0");
		return countArray[0].replaceAll(",", "");	

	}



	//Function to fetch the Price of the Property Listed selected using the random function
	public String checkPrice(int countId){
		String textID="data-propertyid";
		String propertyID=bc.getAttribute(srm.listing(countId), textID);
		String price = bc.getText(srm.checkPrice(propertyID));
		return price;
	}


	//Function to click on Listing
	public void clickListing(int countId) {
		// TODO Auto-generated method stub
		bc.click(srm.listing(countId));

	}

	//Function to fetch price on Property on the property details page
	public String listPrice(){
		String listPrice=bc.getText(srm.listingPrice());
		return listPrice;
	}


	public void validatePrice(String listPrice, String priceOnListing) {
		// TODO Auto-generated method stub
		//Compare the two prices to ensure the prices match
		assertEquals(listPrice, priceOnListing);
		System.out.println("Prices match");

	}


}
