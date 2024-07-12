package com.zoho.web;

import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.zoho.base.pages.ZohoPage;
import com.zoho.session.ZohoTestSession;

public abstract class ZohoValidationDriver implements WebConnector {
EventFiringWebDriver driver;
boolean stopExecution;
SoftAssert softAssert = new SoftAssert();

	@Override
	public ZohoPage validateTitle(String expTitle) {
		/*
		 * System.out.println("Title String is : "+driver.getTitle());
		 * Assert.assertEquals(driver.getTitle(), expTitle);
		 */
		//System.out.println("validateTitle Status is "+isStopExecution());
		if(!expTitle.equals(driver.getTitle())) {
			softAssert.fail("Title donot match. Got title as"+driver.getTitle());
			if(isStopExecution())
				softAssert.assertAll();
		}
		
		return getSession().getCurrentPage();
		}
	
	public ZohoPage validateText(String locator, String expectedText) {
		// TODO Auto-generated method stub
		String actualText = "abc";
		if(!expectedText.equals(actualText)) {
			softAssert.fail("Text donot match. Got Text as"+actualText);
			if(isStopExecution())
				softAssert.assertAll();
		}
		System.out.println("validateText Status is "+isStopExecution());
		return null;
	}
	
	
	public ZohoPage validateElementPresence(String locatorType, String locator) {
		return getSession().getCurrentPage();
	}
	
	@Override
	public void validateLogin() {
	System.out.println("ZohoValidationDriver validateLogin");
		
	}
	
	public void assertAll() {//control will come to stop the test because of some critical error
		softAssert.assertAll();
		
	}
	
	public ZohoTestSession getSession() {
		
		return (ZohoTestSession)Reporter.getCurrentTestResult().getTestContext().getAttribute("session");
		
		}

	public boolean isStopExecution() {
		return stopExecution;
	}

	public void setStopExecution(boolean stopExecution) {
		this.stopExecution = stopExecution;
	}

	public SoftAssert getSoftAssert() {
		return softAssert;
	}

	public void setSoftAssert(SoftAssert softAssert) {
		this.softAssert = softAssert;
	}
	
	
}
