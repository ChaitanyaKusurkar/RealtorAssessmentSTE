
package com.selenium.cases;


import java.util.Random;
import org.testng.annotations.Test;
import com.selenium.base.BaseTest;
import com.selenium.pages.HomeSearchPage;
import com.selenium.pages.SearchResultsPage;

public class SearchARandomApartmentAndComparePrice extends BaseTest {
	
	HomeSearchPage homeSearchPage=new HomeSearchPage();
	SearchResultsPage searchResultsPage=new SearchResultsPage();
	
	
	// Stating point of Execution of Test Cases
	@Test
	public void searchARandomApartmentAndComparePrice(){
		int countId=1;
		
		// Enter text in search Element and click search button
		homeSearchPage.enterSearchText("Morgantown,WV");
		
		homeSearchPage.clickSearchButton();
	
		//Returns total number of listings only if count is >0
		int count = Integer.parseInt(searchResultsPage.getNumberOfHomes());
		
		//Generate random number to select a random listing on the page
		if(count>0){
			if(count>52){ 							// select random number from 52 listings listed on first page
				Random random=new Random();
				countId=random.nextInt(52)+1;
			}
			else{                                    //executed only if total number of listings is less than 52
				Random random=new Random();
				countId=random.nextInt(count)+1;
			}
			
		}
		
		//Fetch the price on the Listing which was randomly selected
		
		String priceOnListing=searchResultsPage.checkPrice(countId);
		
		
		//Click the listing which was randomly selected
		searchResultsPage.clickListing(countId);
		
		//Fetch the Property price from the page showing property details
		String listPrice=searchResultsPage.listPrice();
		
		searchResultsPage.validatePrice(listPrice,priceOnListing);
		
		
	}
	
}
