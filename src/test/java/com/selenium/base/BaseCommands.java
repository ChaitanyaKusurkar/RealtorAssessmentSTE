package com.selenium.base;

import org.openqa.selenium.By;
import org.testng.Assert;
import com.selenium.base.BaseTest;

public class BaseCommands extends BaseTest {


	//function to enter Text in an Element
	public void enterText(String text,By locator){
		try{
			getDriver().findElement(locator).sendKeys(text.toString());

		}
		catch(Exception e){
			e.printStackTrace();
			e.toString();
		}
	}
	//function to click element
	public void click(By locator){
		try{
			getDriver().findElement(locator).click();
		}
		catch(Exception e){
			e.printStackTrace();
			e.toString();
		}
	}

	//function to get Text from element
	public String getText(By locator){
		try{
			return getDriver().findElement(locator).getText();
		}
		catch(Exception e){
			e.printStackTrace();
			e.toString();
		}
		return null;
	}

	//Function to get Attribute Value
	public String getAttribute(By listing, String textID) {
		// TODO Auto-generated method stub
		return getDriver().findElement(listing).getAttribute(textID);
	}

	//Report True or False if the condition is true or false
	public void assertPassFail(boolean status){
		Assert.assertTrue(status);
	}

}
