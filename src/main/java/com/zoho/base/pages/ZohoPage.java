package com.zoho.base.pages;

import com.zoho.session.ZohoTestSession;
import com.zoho.web.WebConnector;

public interface ZohoPage extends ZohoNormalPage, ZohoSessionPage {
	//normal browser operations
	ZohoPage openBrowser(String browser);
	void quite();
	void close();
	void getTotalWindows();
	ZohoTestSession getSession();
	
	//Zoho based normal
	ZohoPage goToHomePage();
	ZohoPage goToEnterUserNamePage();
	void goToRegisterPage();
	void submitUsername(String userid);
	WebConnector validator(boolean flagAssertionType);
	
	//Zoho - session related
	void creatDeal();
	void logout();
}
