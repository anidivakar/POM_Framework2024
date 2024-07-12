package com.zoho.base.pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Reporter;

import com.zoho.session.ZohoTestSession;
import com.zoho.web.WebConnector;

public class ZohoBasePage implements ZohoPage {

	public ZohoBasePage() {
		System.out.println("-----------ZohoBasePage Constuctor ------------");
		PageFactory.initElements(getCurrentDriver(), this);
		getSession().setCurrentPage(this);
	}
	
	public ZohoPage openBrowser(String browser) {
		
		return null;
	}

	public void quite() {
		// TODO Auto-generated method stub
		
	}

	public void close() {
		// TODO Auto-generated method stub
		
	}

	public void getTotalWindows() {
		// TODO Auto-generated method stub
		
	}

	public ZohoPage goToHomePage() {
		// TODO Auto-generated method stub
		return null;
	}

	public void goToRegisterPage() {
		// TODO Auto-generated method stub
		
	}

	public void submitUsername(String userid) {
		
		
	}

	public WebConnector validator(boolean stopexecution) {
		//update the flag in the web layer
		getSession().getCon().setStopExecution(stopexecution);
		return getSession().getCon();
		
	}

	public void creatDeal() {
		// TODO Auto-generated method stub
		
	}

	public void logout() {
		// TODO Auto-generated method stub
		
	}

	public ZohoPage goToEnterUserNamePage() {
		return null;
		
	}
	
	public ZohoTestSession getSession() {
		
	return (ZohoTestSession)Reporter.getCurrentTestResult().getTestContext().getAttribute("session");
	
	}
	
	public WebConnector getDriver() {
	
		return getSession().getCon();
	} 
	
	public EventFiringWebDriver getCurrentDriver() {
		return getSession().getCon().getCurrentDriver();
	}

	@Override
	public WebConnector validator() {
		// TODO Auto-generated method stub
		return null;
	}





}
