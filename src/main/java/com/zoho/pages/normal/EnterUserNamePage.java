package com.zoho.pages.normal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoho.base.pages.Constants;
import com.zoho.base.pages.ZohoBasePage;

public class EnterUserNamePage extends ZohoBasePage {
	//@FindBy (xpath=Constants.USER_NAME)
	//WebElement loginUserName;
	
	@FindBy (xpath=Constants.USER_NAME)
	WebElement loginUserName;
	
	
	public void submitUsername(String userId) {
		//loginUserName.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loginUserName.sendKeys(userId);
		
	}
	
	
	
}
