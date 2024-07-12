package com.zoho.web;

import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.asserts.SoftAssert;

import com.zoho.session.ZohoTestSession;

public interface WebConnector extends ZohoWebConnector{
//this class will be responsible for all driver based commands
	void openBrowser(String bName);
	void navigate(String url);
	void quit();
	EventFiringWebDriver getCurrentDriver();
	ZohoTestSession getSession();
	boolean isStopExecution();
	void setStopExecution(boolean stopExecution);
	SoftAssert getSoftAssert();
	void setSoftAssert(SoftAssert softAssert);
	void assertAll();
}
