package com.zoho.listener;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Reporter;

import com.zoho.session.ZohoTestSession;
import com.zoho.web.WebConnector;

public class ZohoEventListener extends AbstractWebDriverEventListener {
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("Locator"+by);
		System.out.println("element"+element);
		System.out.println("driver"+driver);
	
		boolean err = true;
		if(err) {
			getDriver().getSoftAssert().fail("Element Not Found"+by);
			getDriver().assertAll();// end the flow of the test
		}
	}


	
	public WebConnector getDriver() {
		
		return getSession().getCon();
	} 
	public ZohoTestSession getSession() {
		
		return (ZohoTestSession)Reporter.getCurrentTestResult().getTestContext().getAttribute("session");
		
		}
	
}
