package com.zoho.base.pages;

import com.zoho.web.WebConnector;

public interface ZohoNormalPage {
	//Zoho based normal
	ZohoPage goToHomePage();
	ZohoPage goToEnterUserNamePage();
	void goToRegisterPage();
	void submitUsername(String userid);
	WebConnector validator();
}
