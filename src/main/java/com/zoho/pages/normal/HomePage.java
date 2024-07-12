package com.zoho.pages.normal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoho.base.pages.Constants;
import com.zoho.base.pages.ZohoBasePage;
import com.zoho.base.pages.ZohoPage;

public class HomePage extends ZohoBasePage {

	@FindBy(css =Constants.LOGIN_LINK)
	WebElement loginLink;
	
	public ZohoPage goToEnterUserNamePage() {
		System.out.println("Going to click on SignIn link");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loginLink.click();
		PageFactory.initElements(getCurrentDriver(), this);
		return new EnterUserNamePage();
	}
	
}
